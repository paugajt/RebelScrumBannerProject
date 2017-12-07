package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;

/**
 * impelementation to create table for database.
 */
@Entity
public class Student extends User {
    /**
     * fields for database table.
     */
    private String major;
    /**
     * fields for database table.
     */
    private Integer creditsEarned;
    /**
     * fields for database table.
     */
    private Integer creditLevel;
    /**
     * fields for database table.
     */
    @OneToMany
    @JoinColumn(name = "section_id")
    private Set<Section> sections;
    /**
     * fields for database table.
     */
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    /**
     * setter for enrollments.
     * @param enrollments
     */
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments; }

    /**
     * setter for enrollments list
     * @return
     */
    public Set<Enrollment> getEnrollments() {
        return this.enrollments; }

    /**
     * getter for major.
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * setter for major.
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * getter for credits earned.
     * @return credits earned
     */
    public Integer getCreditsEarned() {
        return creditsEarned;
    }

    /**
     * setter for credits earned.
     * @param creditsEarned
     */
    public void setCreditsEarned(Integer creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    /**
     * getter for credit level.
     * @return credit level
     */
    public Integer getCreditLevel() {
        return creditLevel;
    }

    /**
     * setter for credit level.
     * @param creditLevel
     */
    public void setCreditLevel(Integer creditLevel) {
        this.creditLevel = creditLevel;
    }

    /**
     * getter for first name.
     * @return name
     */
    public String getFirstName() {
        return super.getFirstName();
    }

    /**
     * setter for first name.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    /**
     * getter for last name.
     * @return last name
     */
    public String getLastName() {
        return super.getLastName();
    }

    /**
     * setter for last name.
     * @param lastName
     */
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    /**
     * getter for email.
     * @return email
     */
    public String getEmail() {
        return super.getEmail();
    }

    /**
     * setter for email.
     * @param email
     */
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     * getter for id
     * @return id
     */
    public Integer getId() {
        return super.getId();
    }

    //set usertype as student
    /**
     * setter for user type.
     * @param "Student"
     */
    public void setUserype() {
        super.setUserType("Student"); }

    /**
     * getter for user type.
     * @return user type
     */
    public String getUserType() {
        return super.getUserType();
    }

    /**
     * getter for section.
     * @return section
     */
    public Set<Section> getSections() {
        return sections; }

    /**
     * setter for sections.
     * @param sections
     */
    public void setSections(Set<Section> sections) {
        this.sections = sections; }


}

