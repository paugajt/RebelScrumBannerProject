package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String buildingName;
    private String address;
    private Room[] roomList;
    private String[] departments;

    public  void setId(Integer id) {this.id = id;}
    public Integer getId() {return id;}

    public  void setBuildingName(String buildingName) {this.buildingName = buildingName;}
    public String getBuildingName() {return buildingName;}

    public  void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}

    public void setRoomList(Room[] roomList){this.roomList = roomList;}
    public Room[] getRoomList() {return roomList;}

    public  void setDepartments(String[] departments) {this.departments = departments;}
    public String[] getDepartments() {return departments;}

}
