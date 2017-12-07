package com.rebelscrum.MSUBanner.Application.Entity;

/**
 * globals used for student status.
 */
public class Globals {

    /**
     * fields for globals.
     */
    private String university = "";
    /**
     * fields for globals.
     */
    private final int FRESHMAN = 30;
    /**
     * fields for globals.
     */
    private final int SOPHOMORE = 60;
    /**
     * fields for globals.
     */
    private final int JUNIOR = 90;
    /**
     * fields for globals.
     */
    private final int SENIOR = 120;
    /**
     * fields for globals.
     */
    private String status = "";

    /**
     * check student level.
     * @param n
     * @return status
     */
    public String getMyLevel(int n) {
       if (n < FRESHMAN && n > 0) {
           status = "Freshman";
       }

       if (n < SOPHOMORE && n > FRESHMAN) {
           status = "Sophomore";
       }

       if (n < JUNIOR && n > SOPHOMORE) {
           status = "Junior";
       }

       if (n > JUNIOR) {
           status = "Senior";
       }

       return status;
    }
}
