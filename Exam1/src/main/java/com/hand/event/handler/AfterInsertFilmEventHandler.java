package com.hand.event.handler;

import com.hand.event.AfterInsertFilmEvent;
import org.springframework.context.ApplicationListener;

public class AfterInsertFilmEventHandler implements ApplicationListener<AfterInsertFilmEvent> {
    @Override
    public void onApplicationEvent(AfterInsertFilmEvent event) {
        System.out.println("After Insert Film Data");
    }
}
