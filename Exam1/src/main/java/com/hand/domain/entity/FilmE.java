package com.hand.domain.entity;


import java.util.Date;

public class FilmE {

    private Long filmId;
    private String title;
    private String description;
    private String releaseYear;
    private Long languageId;
    private Long originalLanguageId;
    private Long rentalDuration;
    private Double rentalRate;
    private Long length;
    private Double replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;


    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }


    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }


    public Long getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Long originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }


    public Long getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Long rentalDuration) {
        this.rentalDuration = rentalDuration;
    }


    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rentalRate) {
        this.rentalRate = rentalRate;
    }


    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }


    public Double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Double replacementCost) {
        this.replacementCost = replacementCost;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }


    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
