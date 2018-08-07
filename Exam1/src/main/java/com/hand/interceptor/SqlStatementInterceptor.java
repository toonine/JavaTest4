package com.hand.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class})})
public class SqlStatementInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        String sqlId = mappedStatement.getId();
        long start = System.currentTimeMillis();
        try {
            return invocation.proceed();
        } catch (Exception e) {
            System.err.println(sqlId + "执行失败！");
            e.printStackTrace();
            return null;
        } finally {
            long end = System.currentTimeMillis();
            long time = end - start;
            StringBuilder str = new StringBuilder();
            str.append(sqlId);
            str.append(": ");
            str.append("cost time ");
            str.append(time);
            str.append(" ms.");
            String sqlInfo = str.toString();
            System.out.println(sqlInfo);
        }
    }

    @Override
    public Object plugin(Object arg0) {
        return Plugin.wrap(arg0, this);
    }

    @Override
    public void setProperties(Properties arg0) {

    }
}
