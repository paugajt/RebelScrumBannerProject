package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {;
    @Test
    public void getFirstName() throws Exception {
        Admin admin = new Admin();
        assertNull("Should pass because first name is null", admin.getFirstName());
        admin.setFirstName("Bob");
        assertNotNull("First name exists", admin.getFirstName());
    }

    @Test
    public void setFirstName() throws Exception {
        Admin admin = new Admin ();
        assertNull("This test should pass when there is no  First Name", admin.getFirstName());
        admin.setFirstName("Bob");
        assertNotNull("The First Name doesn't exist", admin.getFirstName());
    }

}