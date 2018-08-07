package com.hand.event.handler;

import com.hand.event.BeforeInsertFilmEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class BeforeInsertFilmEventHandler implements ApplicationListener<BeforeInsertFilmEvent> {
    @Override
    public void onApplicationEvent(BeforeInsertFilmEvent event) {
        System.out.println("Before Insert Film Data");
    }
}
