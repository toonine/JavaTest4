package com.hand;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final String FILM_TITLE = System.getenv("FILM_TITLE");
    private static final String FILM_DESCRIPTION = System.getenv("FILM_DESCRIPTION");
    private static final Long FILM_LANGUAGE_ID = Long.valueOf(System.getenv("FILM_LANGUAGE_ID"));

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        System.out.println("Film Title:");
        System.out.println(FILM_TITLE);
        System.out.println("Film Description:");
        System.out.println(FILM_DESCRIPTION);
        System.out.println("Film LanguageId:");
        System.out.println(FILM_LANGUAGE_ID);

        FilmE filmE = new FilmE();
        filmE.setTitle(FILM_TITLE);
        filmE.setDescription(FILM_DESCRIPTION);
        filmE.setLanguageId(FILM_LANGUAGE_ID);

        FilmService filmService = context.getBean("filmService", FilmService.class);
        try {
            filmService.insertFilmWithException(filmE);
        } catch (Exception e) {
            System.err.println("Insert film throw exception, rollback");
        }
        filmService.insertFilm(filmE);

        context.stop();
    }
}