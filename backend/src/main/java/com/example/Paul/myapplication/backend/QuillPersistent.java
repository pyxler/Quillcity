package com.example.Paul.myapplication.backend;

/**
 * Created by Paul on 2015-02-21.
 */
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class QuillPersistent {

    @Persistent @PrimaryKey private Integer id;
    @Persistent private String text;
    @Persistent private String author;
    @Persistent private Double latitude;
    @Persistent private Double longitude;
    @Persistent private Double rating;

    public QuillPersistent(String text, String author, Double latitude, Double longitude) {
        this.text = text;
        this.author = author;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = 0;
        this.rating = 0.0;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {

        return latitude;
    }

    public Integer getId() {
        return id;
    }

}
