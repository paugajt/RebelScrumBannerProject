package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnrollmentTest {
    Enrollment test = new Enrollment();

    @Test
    public void setId() throws Exception {
        assertNull(test.getId());
        test.setId(1);
        assertNotNull(test.getId());
    }

    @Test
    public void getId() throws Exception {
        assertNull(test.getId());
        test.setId(1);
        assertNotNull(test.getId());
    }

    @Test
    public void setSection() throws Exception {
        Section test1 = new Section();
        assertNull(test.getSection());
        test.setSection(test1);
        assertNotNull(test.getSection());
    }

    @Test
    public void getSection() throws Exception {
        Section test1 = new Section();
        assertNull(test.getSection());
        test.setSection(test1);
        assertNotNull(test.getSection());
    }

    @Test
    public void setStudent() throws Exception {
        Student test1 = new Student();
        assertNull(test.getSection());
        test.setStudent(test1);
        assertNotNull(test.getStudent());
    }

    @Test
    public void getStudent() throws Exception {
        Student test1 = new Student();
        assertNull(test.getSection());
        test.setStudent(test1);
        assertNotNull(test.getStudent());
    }

    @Test
    public void setSemester() throws Exception {
        Semester test1 = new Semester();
        assertNull(test.getSection());
        test.setSemester(test1);
        assertNotNull(test.getSemester());
    }

    @Test
    public void getSemester() throws Exception {
        Semester test1 = new Semester();
        assertNull(test.getSemester());
        test.setSemester(test1);
        assertNotNull(test.getSemester());
    }

}