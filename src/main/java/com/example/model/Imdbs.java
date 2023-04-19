package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "imdbs")
public class Imdbs {
    @Id
    private String id;
    private String title;
    private String year;
    private String rating;
    private String image;

    public Imdbs() {
    }

    public Imdbs(String title, String year, String rating, String image) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.image = image;
    }

    public Imdbs(String id, String title, String year, String rating, String image) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
