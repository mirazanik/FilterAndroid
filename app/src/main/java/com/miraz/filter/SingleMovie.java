package com.miraz.filter;

/**
 * Created by krupenghetiya on 27/06/17.
 */

public class SingleMovie {
    private String title;
    private String url;
    private String medium_cover_image;
    private String genre;
    private String quality;
    private int year;
    private float rating;

    public SingleMovie(String title, String url, String medium_cover_image, String genre, String quality, int year, float rating) {
        this.title = title;
        this.url = url;
        this.medium_cover_image = medium_cover_image;
        this.genre = genre;
        this.quality = quality;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getMedium_cover_image() {
        return medium_cover_image;
    }

    public String getGenre() {
        return genre;
    }

    public String getQuality() {
        return quality;
    }

    public int getYear() {
        return year;
    }

    public float getRating() {
        return rating;
    }
}