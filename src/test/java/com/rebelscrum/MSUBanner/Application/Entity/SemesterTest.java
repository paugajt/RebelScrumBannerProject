package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SemesterTest {
    @Test
    public void setTerm() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester term", tester.getTerm());
        tester.setTerm("Spring");
        assertNotNull("The Semester term exists",tester.getTerm());
    }

    @Test
    public void getTerm() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester term", tester.getTerm());
        tester.setTerm("Spring");
        assertNotNull("The Semester term exists",tester.getTerm());
    }

    @Test
    public void setYear() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester year", tester.getYear());
        tester.setYear(2019);
        assertNotNull("The Semester year exists",tester.getYear());

    }

    @Test
    public void getYear() throws Exception {
        Semester tester = new Semester();
        assertNull("This test should pass when there is no Semester year", tester.getYear());
        tester.setYear(2019);
        assertNotNull("The Semester year exists",tester.getYear());
    }
}
