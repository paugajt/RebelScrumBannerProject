package com.rebelscrum.MSUBanner.Application.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalsTest {

    @Test
    public void getMyLevelFreshman() throws Exception {
        Globals global = new Globals();
        assertEquals("Freshman",global.getMyLevel(1));
    }
    @Test
    public void getMyLevelSophomore() throws Exception {
        Globals global = new Globals();
        assertEquals("Sophomore",global.getMyLevel(51));
    }
    @Test
    public void getMyLevelJunior() throws Exception {
        Globals global = new Globals();
        assertEquals("Junior",global.getMyLevel(81));
    }
    @Test
    public void getMyLevelSenior() throws Exception {
        Globals global = new Globals();
        assertEquals("Senior",global.getMyLevel(121));
    }

}