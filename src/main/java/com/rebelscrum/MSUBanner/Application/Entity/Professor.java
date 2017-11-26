package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Professor extends User{
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private Set<Section> sections;
    private String department;
    private String officeLocation;



    public Set<Section> getSections() {return sections;}

    public void setSections(Set<Section> sections) {this.sections = sections;}

    public String getFirstName() {return super.getFirstName();}
    public void setFirstName(String firstName) {super.setFirstName(firstName);}

    public String getLastName() {return super.getLastName();}
    public void setLastName(String lastName) {super.setLastName(lastName);}

    public String getEmail() {return super.getEmail();}
    public void setEmail(String email) {super.setEmail(email);}

    public void setUserType() {super.setUserType("Professor");}
    public String getUserType() {return super.getUserType();}

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

    public Integer getId() {return super.getId();}


}

