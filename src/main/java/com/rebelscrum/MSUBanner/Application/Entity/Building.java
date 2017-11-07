package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String buildingName;
    private String address;
    private ArrayList<Room> roomList = new ArrayList<>();
    private ArrayList<String> departmentList = new ArrayList<>();

    public  void setId(Integer id) {this.id = id;}
    public Integer getId() {return id;}

    public  void setBuildingName(String buildingName) {this.buildingName = buildingName;}
    public String getBuildingName() {return buildingName;}

    public  void setAddress(String address) {this.address = address;}
    public String getAddress() {return address;}

    public void addRoom(Room room){
        this.roomList.add(room);
    }
    public ArrayList<Room> getRoomList(){
        return roomList;
    }

    public void addDepartment(String department){
        this.departmentList.add(department);
    }
    public ArrayList<String> getDepartmentList() {
        return departmentList;
    }
}
