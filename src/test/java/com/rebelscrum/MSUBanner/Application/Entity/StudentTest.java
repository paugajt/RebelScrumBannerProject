package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void getMajor() throws Exception {
    }

    @Test
    public void setMajor() throws Exception {
    }

    @Test
    public void getCreditsEarned() throws Exception {
    }

    @Test
    public void setCreditsEarned() throws Exception {
    }

    @Test
    public void getCreditLevel() throws Exception {
    }

    @Test
    public void setCreditLevel() throws Exception {
    }

    @Test
    public void getFirstName() throws Exception {
        Student tester = new Student ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name exists",tester.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception {
        Student tester = new Student ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
    }

    @Test
    public void getLastName() throws Exception {
        Student tester = new Student ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void setLastName() throws Exception {
        Student tester = new Student ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void getEmail() throws Exception {
    }

    @Test
    public void setEmail() throws Exception {
    }

    @Test
    public void getId() throws Exception {
    }

    @Test
    public void setId() throws Exception {
    }

}