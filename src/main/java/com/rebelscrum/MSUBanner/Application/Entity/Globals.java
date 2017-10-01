package com.rebelscrum.MSUBanner.Application.Entity;

public class Globals {
    private String university = "";

    private final int FRESHMAN = 30;
    private final int SOPHOMORE = 60;
    private final int JUNIOR = 90;
    private final int SENIOR = 120;

    private String status = "";

    public String getMyLevel(int n){
       if (n < FRESHMAN){
           status = "Freshman";
       }

       if (n < SOPHOMORE){
           status = "Sophomore";
       }

       if (n < JUNIOR){
           status = "Junior";
       }

       if (n < SENIOR){
           status = "Senior";
       }

       return status;
    }
}
