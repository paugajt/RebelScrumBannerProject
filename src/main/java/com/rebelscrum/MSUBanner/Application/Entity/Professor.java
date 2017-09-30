package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
public class Professor extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String userType;
    private String currentCourses;
    private String department;
    private String officeLocation;


    public String getFirstName() {return firstName;}
    public void setFirstName(String firstname) {this.firstName = firstname;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getUserType() {return userType;}
    public void setUserType(String userType) {this.userType = userType;}

    public String getCurrentCourses() { return currentCourses; }
    public void setCurrentCourses(String currentCourses) {
        this.currentCourses = currentCourses;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}


}

