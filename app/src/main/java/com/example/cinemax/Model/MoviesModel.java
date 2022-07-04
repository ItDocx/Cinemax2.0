package com.example.cinemax.Model;

public class MoviesModel {

    int Image;
    String Name;
    String Release_Date;
    String Rating;
    String Description;
    String Genre;
    String Directors;
    String Duration;
    String Producers;
    String Cast;


    public MoviesModel(int image, String name, String release_Date, String rating, String description, String genre, String directors, String duration, String producers, String cast) {
        Image = image;
        Name = name;
        Release_Date = release_Date;
        Rating = rating;
        Description = description;
        Genre = genre;
        Directors = directors;
        Duration = duration;
        Producers = producers;
        Cast = cast;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRelease_Date() {
        return Release_Date;
    }

    public void setRelease_Date(String release_Date) {
        Release_Date = release_Date;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public String getDirectors() {
        return Directors;
    }

    public void setDirectors(String directors) {
        this.Directors = directors;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        this.Duration = duration;
    }

    public String getProducers() {
        return Producers;
    }

    public void setProducers(String producers) {
        this.Producers = producers;
    }

    public String getCast() {
        return Cast;
    }

    public void setCast(String cast) {
        this.Cast = cast;
    }
}
