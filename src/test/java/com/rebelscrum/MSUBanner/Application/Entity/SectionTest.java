package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionTest {
    Course testCourse = new Course();
    Professor testProf = new Professor();
    @Test
    public void getId() throws Exception {
        Section tester = new Section ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void setId() throws Exception {
        Section tester = new Section ();
        assertNull("This test should pass when there is no ID", tester.getId());
        tester.setId(123);
        assertNotNull("The ID doesn't exist",tester.getId());
    }

    @Test
    public void getCourse() throws Exception {
        Section tester = new Section ();
        Course test =new Course ();
        test.setCourseName("Software Development");
        test.setCoReqs("Computer org 2");
        test.setCreditLevel("Senior");
        test.setDepartment("Computer Sciences");
        test.setDescription("The student will learn the ins and outs of software development as well as working in" +
                " an agile development environment");
        test.setLearningObjectives("Student will be able to apply software engineering principles in an agile team" +
                " environment");
        test.setSemester("Fall");
        test.setDays("MW");
        test.setTimeStart(1200);
        test.setTimeEnd(1350);
        test.setBuilding(null);
        test.setRoom(null);
        tester.setCourse (test);
        assertNotNull("The Course doesn't exist",tester.getCourse());
    }

    @Test
    public void setCourse() throws Exception {
        Section tester = new Section ();
        Course test =new Course ();
        test.setCourseName("Software Development");
        test.setCoReqs("Computer org 2");
        test.setCreditLevel("Senior");
        test.setDepartment("Computer Sciences");
        test.setDescription("The student will learn the ins and outs of software development as well as working in" +
                " an agile development environment");
        test.setLearningObjectives("Student will be able to apply software engineering principles in an agile team" +
                " environment");
        test.setSemester("Fall");
        test.setDays("MW");
        test.setTimeStart(1200);
        test.setTimeEnd(1350);
        test.setBuilding(null);
        test.setRoom(null);
        tester.setCourse(test);
        assertNotNull("The Course doesn't exist",tester.getCourse());
    }

    @Test
    public void getProfessor() throws Exception {
        Section tester = new Section ();
        Professor test = new Professor();
        test.setFirstName("Steve");
        test.setLastName("Beaty");
        test.setEmail("sbeaty@msudenver.edu");
        test.setDepartment("Computer Science");
        //test.setCurrentCourses("SW Dev, OS");
        test.setOfficeLocation("AES 218");
        tester.setProfessor(test);
        assertNotNull("The Professor doesn't exist",tester.getProfessor());
    }

    @Test
    public void setProfessor() throws Exception {
        Section tester = new Section ();
        Professor test = new Professor();
        test.setFirstName("Steve");
        test.setLastName("Beaty");
        test.setEmail("sbeaty@msudenver.edu");
        test.setDepartment("Computer Science");
        //test.setCurrentCourses("SW Dev, OS");
        test.setOfficeLocation("AES 218");
        tester.setProfessor(test);
        assertNotNull("The Professor doesn't exist",tester.getProfessor());
    }

}