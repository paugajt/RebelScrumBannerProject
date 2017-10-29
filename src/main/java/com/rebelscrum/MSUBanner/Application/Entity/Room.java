package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer seats;

    public  void setId(Integer id) {this.id = id;}
    public Integer getId() {return id;}

    public  void setSeats(Integer seats) {this.seats = seats;}
    public Integer getSeats() {return seats;}

}
