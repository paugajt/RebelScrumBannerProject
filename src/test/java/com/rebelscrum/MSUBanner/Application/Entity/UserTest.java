package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getFirstName() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name exists",tester.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name doesn't exist",tester.getFirstName());
    }

    @Test
    public void getLastName() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void setLastName() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void getEmail() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smithmsudenver.edu");
        assertNull("The Email should be invalid",tester.getEmail());

    }

    @Test
    public void setEmail() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smit@hmsudenver.edu");
        assertNotNull("The Email doesn't exist",tester.getEmail());

    }

    @Test
    public void getId() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void setId() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void getUserType() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no User-Type", tester.getUserType());
        tester.setUserType("The Boss");
        assertNotNull("The ID doesn't exist",tester.getUserType());
    }

    @Test
    public void setUserType() throws Exception {
        User tester = new User ();
        assertNull("This test should pass when there is no User-Type", tester.getUserType());
        tester.setUserType("The Boss");
        assertNotNull("The ID doesn't exist",tester.getUserType());
    }

}