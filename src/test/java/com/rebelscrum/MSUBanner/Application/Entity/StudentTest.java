package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getMajor() throws Exception {
        Student tester = new Student ();
        assertNull("This test should pass when there is no Major", tester.getMajor());
        tester.setMajor("CS");
        assertNotNull("The Major should exist",tester.getMajor());
    }

    @Test
    public void setMajor() throws Exception {
        Student tester = new Student ();
        tester.setCreditsEarned(51);
        Integer testLev = tester.getCreditsEarned();
        assertSame(51,testLev);
    }

    @Test
    public void getCreditsEarned() throws Exception {
        Student tester = new Student ();
        tester.setCreditsEarned(51);
        Integer testLev = tester.getCreditsEarned();
        assertSame(51,testLev);
    }

    @Test
    public void setCreditsEarned() throws Exception {
        Student tester = new Student ();
        Integer creditLevel = tester.getCreditsEarned();
        Integer testLevel = 51;
        assertSame(51,testLevel);
    }

    @Test
    public void getCreditLevel() throws Exception {
        Student tester = new Student ();
        tester.setCreditLevel(51);
        Integer testLev = tester.getCreditLevel();
        assertSame(51,testLev);
    }

    @Test
    public void setCreditLevel() throws Exception {
        Student tester = new Student ();
        tester.setCreditLevel(51);
        Integer testLev = tester.getCreditLevel();
        assertSame(51,testLev);
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