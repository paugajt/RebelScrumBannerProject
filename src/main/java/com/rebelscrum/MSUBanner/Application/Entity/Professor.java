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
    private String[] currentCourses;
    private String department;
    private String officeLocation;


    public String[] getCurrentCourses() { return currentCourses; }
    public void setCurrentCourses(String[] currentCourses) {
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


}

