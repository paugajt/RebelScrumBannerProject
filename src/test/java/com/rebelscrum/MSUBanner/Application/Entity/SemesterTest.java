package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SemesterTest {
    @Test
    public void setEnrollments() throws Exception {
        Semester tester = new Semester();
        assertNull(tester.getEnrollments());
    }

    @Test
    public void getEnrollments() throws Exception {
        Semester tester = new Semester();
        assertNull(tester.getEnrollments());
    }

    @Test
    public void setYear() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester year", tester.getSemesterYear());
        tester.setSemesterYear("2019");
        assertNotNull("The Semester year exists",tester.getSemesterYear());

    }

    @Test
    public void getYear() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester year", tester.getSemesterYear());
        tester.setSemesterYear("2019");
        assertNotNull("The Semester year exists",tester.getSemesterYear());
    }

}