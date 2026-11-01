package com.example.Game.Tracker;

import jakarta.persistence.*;

@Entity
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String status;
    private Double rating;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public Double getRating(){
        return  rating;
    }

    public void setRating(Double rating){
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
