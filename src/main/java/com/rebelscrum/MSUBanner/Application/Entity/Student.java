package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Student extends User{
    private String major;
    private final String USER_TYPE = "Student";
    private Integer creditsEarned;
    private Integer creditLevel;
    @OneToMany
    @JoinColumn(name = "section_id")
    private Set<Section> sections;

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
        return super.getFirstName();
    }

    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    public String getLastName() {
        return super.getLastName();
    }

    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public Integer getId(){
        return super.getId();
    }


    public String getUserType(){
        return USER_TYPE;
    }

    public Set<Section> getSections() {return sections;}

    public void setSections(Set<Section> sections) {this.sections = sections;}


}

