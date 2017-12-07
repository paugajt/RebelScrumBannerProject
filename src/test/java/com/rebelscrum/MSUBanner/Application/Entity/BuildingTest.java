package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {

    @Test
    public void setId() throws Exception{
        Building tester = new Building();
        assertNull("This test should pass when there is no Building ID", tester.getId());
        tester.setId(1234);
        assertNotNull("The Building ID exists", tester.getId());
    }

    @Test
    public void getId() throws  Exception{
        Building tester = new Building();
        assertNull("This test should pass when there is no Building ID", tester.getId());
        tester.setId(1234);
        assertNotNull("The Building ID exists", tester.getId());
    }

    @Test
    public void setBuildingName() throws Exception{
        Building tester = new Building();
        assertNull("This test should pass when there is not Building Name", tester.getBuildingName());
        tester.setBuildingName("Test Science");
        assertNotNull("The Building has a name", tester.getBuildingName());
    }

    @Test
    public void getBuildingName() throws Exception{
        Building tester = new Building();
        assertNull("This test should pass when there is not Building Name", tester.getBuildingName());
        tester.setBuildingName("Test Science");
        assertNotNull("The Building has a name", tester.getBuildingName());
    }
    
}
