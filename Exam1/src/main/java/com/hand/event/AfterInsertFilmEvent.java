package com.hand.event;

import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent {
    public AfterInsertFilmEvent(Object source) {
        super(source);
    }
}
