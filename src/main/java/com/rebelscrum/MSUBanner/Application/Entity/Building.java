package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * Building class that has the name of the building and build id.
 */
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    /**
     * Objects for building class
     */
    private Integer id;
    private String buildingName;
    @OneToMany(mappedBy = "building")
    /**
     * Database relationship.
     */
    private Set<Room> roomList;
    //private Set<String> departmentList;

    /**
     *setter for building id
     * @param id of building
     */
    public  void setId(Integer id) {this.id = id;}

    /**
     *getter for building id
     * @return building
     */
    public Integer getId() {return id;}

    /**
     * setter for building name
     * @param buildingName
     */

    public  void setBuildingName(String buildingName) {this.buildingName = buildingName;}

    /**
     *getter for building name
     * @return
     */
    public String getBuildingName() {return buildingName;}

    /*
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
    */
}
