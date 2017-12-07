package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void setCourseName() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no  Course Name", tester.getCourseName());
        tester.setCourseName("Really Hard Class");
        assertNotNull("The Course Name exists",tester.getCourseName());

    }

    @Test
    public void getCourseName() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no  Course Name", tester.getCourseName());
        tester.setCourseName("Really Hard Class");
        assertNotNull("The Course Name exists",tester.getCourseName());
    }

    @Test
    public void setDepartment() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Department", tester.getDepartment());
        tester.setDepartment("Computer Science");
        assertNotNull("The Department doesn't exist",tester.getDepartment());
    }

    @Test
    public void getDepartment() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Department", tester.getDepartment());
        tester.setDepartment("Computer Science");
        assertNotNull("The Department doesn't exist",tester.getDepartment());
    }

    @Test
    public void setCreditLevel() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Credit Level", tester.getCreditLevel());
        tester.setCreditLevel("Really Hard");
        assertNotNull("The Credit Level doesn't exist",tester.getCreditLevel());
    }

    @Test
    public void getCreditLevel() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Credit Level", tester.getCreditLevel());
        tester.setCreditLevel("Really Hard");
        assertNotNull("The Credit Level doesn't exist",tester.getCreditLevel());
    }

    @Test
    public void setDescription() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Course Description", tester.getDescription());
        tester.setDescription("Really Hard Class");
        assertNotNull("The Course Description doesn't exist",tester.getDescription());
    }

    @Test
    public void getDescription() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no Course Description", tester.getDescription());
        tester.setDescription("Really Hard Class");
        assertNotNull("The Course Description doesn't exist",tester.getDescription());
    }

    @Test
    public void setLearningObjectives() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no objection", tester.getLearningObjectives());
        tester.setLearningObjectives("Learn Stuff");
        assertNotNull("The Learning Objective doesn't exist",tester.getLearningObjectives());
    }

    @Test
    public void getLearningObjectives() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no objection", tester.getLearningObjectives());
        tester.setLearningObjectives("Learn Stuff");
        assertNotNull("The Learning Objective doesn't exist",tester.getLearningObjectives());
    }

    @Test
    public void setCoReqs() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no objection", tester.getCoReqs());
        tester.setCoReqs("You have already learned stuff");
        assertNotNull("The Learning Objective doesn't exist",tester.getCoReqs());
    }

    @Test
    public void getCoReqs() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no CoReq listed", tester.getCoReqs());
        tester.setCoReqs("You have must have already learned stuff");
        assertNotNull("The Coreq doesn't exist",tester.getCoReqs());
    }

    @Test
    public void setSemester() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no objection", tester.getSemester());
        tester.setSemester("fall or spring or summer");
        assertNotNull("The semester doesn't exist",tester.getSemester());
    }

    @Test
    public void getSemester() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no objection", tester.getSemester());
        tester.setSemester("fall or spring or summer");
        assertNotNull("The semester doesn't exist",tester.getSemester());
    }

    @Test
    public void getId() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void setId() throws Exception {
        Course tester = new Course ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

}