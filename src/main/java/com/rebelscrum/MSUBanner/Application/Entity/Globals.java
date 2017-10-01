package com.rebelscrum.MSUBanner.Application.Entity;

public class Globals {
    private String university = "";

    private final int FRESHMAN = 30;
    private final int SOPHOMORE = 60;
    private final int JUNIOR = 90;
    private final int SENIOR = 120; //Unused because of how the current logic is written

    private String status = "";

    public String getMyLevel(int n){
       if (n < FRESHMAN){
           status = "Freshman";
       }

       else if (n < SOPHOMORE){
           status = "Sophomore";
       }

       else if (n < JUNIOR){
           status = "Junior";
       }

       else {
           status = "Senior";
       }

       return status;
    }
}
