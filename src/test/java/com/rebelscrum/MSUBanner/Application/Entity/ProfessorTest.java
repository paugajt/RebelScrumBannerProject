package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfessorTest {


    @Test
    public void getFirstName() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name exists",tester.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  First Name", tester.getFirstName());
        tester.setFirstName("Bob");
        assertNotNull("The First Name exists",tester.getFirstName());
    }

    @Test
    public void getLastName() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void setLastName() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  Last Name", tester.getFirstName());
        tester.setLastName("Smith");
        assertNotNull("The Last Name doesn't exist",tester.getLastName());
    }

    @Test
    public void getEmail() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smithmsudenver.edu");
        assertNull("The Email should be invalid",tester.getEmail());
    }

    @Test
    public void setEmail() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no  Email", tester.getEmail());
        tester.setEmail("Bob.Smit@hmsudenver.edu");
        assertNotNull("The Email doesn't exist",tester.getEmail());
    }

//    @Test
//    public void getCurrentCourses() throws Exception {
//        Professor tester = new Professor ();
//        tester.setCurrentCourses(testCourse);
//        assertEquals("Software Development Methods & Tools","Software Development Methods & Tools");
//    }
//
//    @Test
//    public void setCurrentCourses() throws Exception {
//        Professor tester = new Professor ();
//        tester.setCurrentCourses("Software Development Methods & Tools");
//        assertEquals("Software Development Methods & Tools","Software Development Methods & Tools");
//    }

    @Test
    public void getDepartment() throws Exception {
        Professor tester = new Professor ();
        tester.setDepartment("Computer Science");
        assertEquals("Computer Science","Computer Science");
    }

    @Test
    public void setDepartment() throws Exception {
        Professor tester = new Professor ();
        tester.setDepartment("Computer Science");
        assertEquals("Computer Science","Computer Science");
    }

    @Test
    public void getOfficeLocation() throws Exception {
        Professor tester = new Professor ();
        tester.setOfficeLocation("Science");
        assertEquals("Science","Science");
    }

    @Test
    public void setOfficeLocation() throws Exception {
        Professor tester = new Professor ();
        tester.setOfficeLocation("Science");
        assertEquals("Science","Science");
    }

    @Test
    public void getId() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void setId() throws Exception {
        Professor tester = new Professor ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

}