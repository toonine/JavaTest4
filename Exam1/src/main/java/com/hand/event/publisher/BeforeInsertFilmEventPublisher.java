package com.hand.event.publisher;

import com.hand.event.BeforeInsertFilmEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class BeforeInsertFilmEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish() {
        applicationEventPublisher.publishEvent(new BeforeInsertFilmEvent(this));
    }
}
