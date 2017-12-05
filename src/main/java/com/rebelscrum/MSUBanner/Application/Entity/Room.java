package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

/**
 * Room class used to create database table
 */
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    /**
     * fields for database
     */
    private Integer id;
    private Integer roomNum;
    private Integer seats;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    /**
     * setter for id
     * @param id
     */
    public  void setId(Integer id) {this.id = id;}

    /**
     * getter for id
     * @return
     */
    public Integer getId() {return id;}

    /**
     * setter for room number
     * @param roomNum
     */
    public void setRoomNum(Integer roomNum) {this.roomNum = roomNum;}

    /**
     * getter for room number
     * @return
     */
    public Integer getRoomNum() {return roomNum;}

    /**
     * setter for seats
     * @param seats
     */
    public  void setSeats(Integer seats) {this.seats = seats;}

    /**
     * getter for seats
     * @return
     */
    public Integer getSeats() {return seats;}

    /**
     * setter for building
     * @param building
     */
    public void setBuilding(Building building) {this.building = building;}

    /**
     * getter for building
     * @return
     */
    public String getBuilding() {return building.getBuildingName();}

}
