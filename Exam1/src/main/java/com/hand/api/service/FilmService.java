package com.hand.api.service;

import com.hand.domain.entity.FilmE;

public interface FilmService {
    void insertFilm(FilmE film);

    void insertFilmWithException(FilmE filmE);
}