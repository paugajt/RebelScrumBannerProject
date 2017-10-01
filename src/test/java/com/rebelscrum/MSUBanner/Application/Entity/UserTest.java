package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UserTest {

    private static String sampleFirstName = "";
    private static String sampleLastName = "";
    private static String sampleEmail = "";
    private static String sampleStatus = "";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createWhenFirstNameIsNullShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("First Name must not be null");
        sampleFirstName = null;
    }

    @Test
    public void createWhenFirstNameIsEmptyShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("First Name must not be empty");
        sampleFirstName = "";
    }

    @Test
    public void createWhenLastNameIsNullShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Last Name must not be null");
        sampleLastName = null;
    }

    @Test
    public void createWhenLastNameIsEmptyShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Last Name must not be empty");
        sampleLastName = "";
    }

    @Test
    public void createWhenEmailIsNullShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Email must not be null");
        sampleEmail = null;
    }

    @Test
    public void createWhenEmailIsEmptyShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Email must not be empty");
        sampleEmail = "";
    }

    @Test
    public void createWhenStatusIsNullShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Status must not be null");
        sampleStatus = null;
    }

    @Test
    public void createWhenStatusIsEmptyShouldThrowException() throws Exception {
        this.thrown.expect(IllegalArgumentException.class);
        this.thrown.expectMessage("Status must not be empty");
        sampleStatus = "";
    }


}