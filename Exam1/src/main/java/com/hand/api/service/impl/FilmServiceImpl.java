package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import com.hand.infra.mapper.FilmMapper;

public class FilmServiceImpl implements FilmService {

    private final FilmMapper filmMapper;

    public FilmServiceImpl(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }

    @Override
    public void insertFilm(FilmE film) {
        filmMapper.insertFilm(film);
    }

    @Override
    public void insertFilmWithException(FilmE filmE) {
        filmMapper.insertFilm(filmE);
        throw new RuntimeException();
    }
}
