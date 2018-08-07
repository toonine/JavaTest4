FROM registry.saas.hand-china.com/tools/mysql:5.6
COPY sakila-data.sql /
COPY sakila-schema.sql /
RUN cat /sakila-schema.sql > /docker-entrypoint-initdb.d/dump.sql
RUN cat /sakila-data.sql >> /docker-entrypoint-initdb.d/dump.sql