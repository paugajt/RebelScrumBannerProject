package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

/**
 * Administration entity to define what an admin
 * user has
 */
@Entity
public class Admin extends User{
    private String department;
    private String password;

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

    public void setEmail(String email) {super.setEmail(email);
    }

    public Integer getId(){
        return super.getId();
    }

    public void setUserType() {super.setUserType("Administrator");}
    public String getUserType() {
        return super.getUserType();
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;}

}

