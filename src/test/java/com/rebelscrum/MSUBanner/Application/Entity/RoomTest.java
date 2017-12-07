package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    @Test
    public void setId() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there is no id", tester.getId());
        tester.setId(1);
        assertNotNull("this test should pass when the ID is present", tester.getId());
    }

    @Test
    public void getId() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there is no id", tester.getId());
        tester.setId(1);
        assertNotNull("this test should pass when the ID is present", tester.getId());
    }

    @Test
    public void setRoomNum() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there is no roomNum", tester.getRoomNum());
        tester.setRoomNum(1);
        assertNotNull("this test should pass when the roomNum is present", tester.getRoomNum());
    }

    @Test
    public void getRoomNum() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there is no roomNum", tester.getRoomNum());
        tester.setRoomNum(1);
        assertNotNull("this test should pass when the roomNum is present", tester.getRoomNum());
    }

    @Test
    public void setSeats() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there are no seats", tester.getSeats());
        tester.setSeats(1);
        assertNotNull("this test should pass when the seats are present", tester.getSeats());
    }

    @Test
    public void getSeats() throws Exception {
        Room tester = new Room ();
        assertNull("this test should pass when there are no seats", tester.getSeats());
        tester.setSeats(1);
        assertNotNull("this test should pass when the seats are present", tester.getSeats());
    }

    @Test
       public void getBuilding() throws Exception {
        Room tester = new Room ();
        Building building = new Building();
        building.setBuildingName("buildingtest");
        assertNotNull("this test should pass when the building is present", building.getBuildingName());
    }

}