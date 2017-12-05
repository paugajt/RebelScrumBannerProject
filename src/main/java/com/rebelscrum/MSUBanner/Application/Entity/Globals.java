package com.rebelscrum.MSUBanner.Application.Entity;

/**
 * globals used for student status
 */
public class Globals {

    /**
     * fields for globals
     */
    private String university = "";

    private final int FRESHMAN = 30;
    private final int SOPHOMORE = 60;
    private final int JUNIOR = 90;
    private final int SENIOR = 120;

    private String status = "";

    /**
     * check student level
     * @param n
     * @return
     */
    public String getMyLevel(int n){
       if (n < FRESHMAN && n>0){
           status = "Freshman";
       }

       if (n < SOPHOMORE && n>FRESHMAN){
           status = "Sophomore";
       }

       if (n < JUNIOR && n>SOPHOMORE){
           status = "Junior";
       }

       if (n>JUNIOR){
           status = "Senior";
       }

       return status;
    }
}
