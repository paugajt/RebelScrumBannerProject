package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
public class Student extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private Integer creditsEarned;
    private Integer creditLevel;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getCreditsEarned(){
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}

