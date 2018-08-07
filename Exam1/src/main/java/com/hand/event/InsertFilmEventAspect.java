package com.hand.event;

import com.hand.event.publisher.AfterInsertFilmEventPublisher;
import com.hand.event.publisher.BeforeInsertFilmEventPublisher;

public class InsertFilmEventAspect {
    private final BeforeInsertFilmEventPublisher beforeInsertFilmEventPublisher;
    private final AfterInsertFilmEventPublisher afterInsertFilmEventPublisher;

    public InsertFilmEventAspect(BeforeInsertFilmEventPublisher beforeInsertFilmEventPublisher, AfterInsertFilmEventPublisher afterInsertFilmEventPublisher) {
        this.beforeInsertFilmEventPublisher = beforeInsertFilmEventPublisher;
        this.afterInsertFilmEventPublisher = afterInsertFilmEventPublisher;
    }

    public void doBeforeInsertFilm() {
        beforeInsertFilmEventPublisher.publish();
    }

    public void doAfterInsertFilm() {
        afterInsertFilmEventPublisher.publish();
    }
}
