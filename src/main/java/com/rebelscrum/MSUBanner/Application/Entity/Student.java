package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
public class Student extends User {
    @Id

    @GeneratedValue(strategy=GenerationType.AUTO)
    private String major;
    private Integer creditsEarned;
    private Integer creditLevel;

    public String major() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public Integer creditsEarned(){
        return creditsEarned;
    }
    public void setCreditsEarned(Integer creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public Integer getCreditLevel(){
        return creditLevel;
    }
    public void setCreditLevel(Integer creditLevel) {
        this.creditLevel = creditLevel;
    }



}

