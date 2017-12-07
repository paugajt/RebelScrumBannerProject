package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Building class that has the name of the building and build id.
 */
@Entity
public class Building {
    /**
     * building class.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * Objects for building class.
     */
    private Integer id;
    /**
     * Objects for building class.
     */
    private String buildingName;
    /**
     *
     */
    @OneToMany(mappedBy = "building")
    /**
     * Database relationship.
     */
    private Set<Room> roomList;

    /**
     *setter for building id.
     * @param id of building
     */
    public  void setId(Integer id) {
        this.id = id; }

    /**
     *getter for building id.
     * @return building
     */
    public Integer getId() {
        return id; }

    /**
     * setter for building name.
     * @param buildingName
     */
    public  void setBuildingName(String buildingName) {
        this.buildingName = buildingName; }
    /**
     *getter for building name.
     * @return buildingName
     */
    public String getBuildingName() {
        return buildingName; }
    /**
     *method is executed correctly.
     * @param room
     */
    public void addRoom(Room room) {
        this.roomList.add(room);
    }
    /**
     *method is executed correctly.
     * @return roomlist
     */
    public Set<Room> getRoomList() {
        return roomList;
    }


}
