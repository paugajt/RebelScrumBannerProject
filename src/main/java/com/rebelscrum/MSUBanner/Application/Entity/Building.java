package com.rebelscrum.MSUBanner.Application.Entity;

import org.hibernate.dialect.Ingres9Dialect;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String buildingName;
    private String address;
    private Integer roomCount;
    private Room[] roomList;
    private String[] departments;

    public  void setId(Integer id) {this.id = id;}
    public Integer getId() {return id;}

    public  void setBuildingName(String buildingName) {this.buildingName = buildingName;}
    public String getBuildingName() {return buildingName;}

    public  void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}

    public void setRoomCount(Integer roomCount) {this.roomCount = roomCount;}
    public Integer getRoomCount() {return  roomCount;}

    public void setRoomList(Room[] roomList){this.roomList = roomList;}
    public Room[] getRoomList() {return roomList;}

    public  void setDepartments(String[] departments, int index) {this.departments = departments;}
    public String[] getDepartments() {return departments;}

    class Room{
        private Integer roomNum;
        private Integer seats;

        Room(Integer roomNum, Integer seats){
            this.roomNum = roomNum;
            this.seats = seats;
        }

        public  void setRoomNum(Integer roomNum) {this.roomNum = roomNum;}
        public Integer getRoomNum() {return roomNum;}

        public  void setSeats(Integer seats) {this.seats = seats;}
        public Integer getSeats() {return seats;}


    }

}
