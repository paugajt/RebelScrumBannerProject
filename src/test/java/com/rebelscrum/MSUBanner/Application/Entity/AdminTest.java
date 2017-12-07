package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.*;

import static org.junit.Assert.*;

public class AdminTest {;


    @Test
    public void getFirstName() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name exists",tester.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name doesn't exist",tester.getFirstName());
    }

    @Test
    public void getLastName() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void setLastName() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void getEmail() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smithmsudenver.edu");
        assertNull("The Email should be invalid",tester.getEmail());
    }
    @Test
    public void setEmail() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smit@hmsudenver.edu");
        assertNotNull("The Email doesn't exist",tester.getEmail());
    }

    @Test
    public void getId() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void setId() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void getDepartment() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no Department", tester.getDepartment());
        tester.setDepartment("Computer Science");
        assertNotNull("The Department doesn't exist",tester.getDepartment());
    }

    @Test
    public void setDepartment() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no Department", tester.getDepartment());
        tester.setDepartment("Computer Science");
        assertNotNull("The Department doesn't exist",tester.getDepartment());
    }

    @Test
    public void getPassword() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no Password", tester.getPassword());
        tester.setPassword("Abc123");
        assertNotNull("The password doesn't exist",tester.getPassword());
    }

    @Test
    public void setPassword() throws Exception {
        Admin tester = new Admin ();
        assertNull("This test should pass when there is no Password", tester.getPassword());
        tester.setPassword("Abc123");
        assertNotNull("The password doesn't exist",tester.getPassword());
    }

}