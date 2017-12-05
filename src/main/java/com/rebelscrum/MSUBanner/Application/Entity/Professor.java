package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;

/**
 * implementation to create database table
 */
@Entity
public class Professor extends User{
    /**
     * fields to create the database table
     */
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private Set<Section> sections;
    private String department;
    private String officeLocation;


    /**
     * getter for Set database sections
     * @return
     */
    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }

    /**
     * getter for first name
     * @return
     */
    public String getFirstName() {
        return super.getFirstName();
    }

    /**
     * setter for first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    /**
     * getter for last name
     * @return
     */
    public String getLastName() {
        return super.getLastName();
    }

    /**
     * setter for last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    /**
     * getter for email
     * @return
     */
    public String getEmail() {
        return super.getEmail();
    }

    /**
     * setter for email
     * @param email
     */
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     * setter for user type
     */
    public void setUserType() {
        super.setUserType("Professor");
    }

    /**
     * getter for user type
     * @return
     */
    public String getUserType() {
        return super.getUserType();
    }

    /**
     * getter for department
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     * setter for department
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * getter for office location
     * @return
     */
    public String getOfficeLocation() {
        return officeLocation;
    }

    /**
     * setter for office location
     * @param officeLocation
     */
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    /**
     * getter for id
     * @return
     */
    public Integer getId() {
        return super.getId();
    }


}

