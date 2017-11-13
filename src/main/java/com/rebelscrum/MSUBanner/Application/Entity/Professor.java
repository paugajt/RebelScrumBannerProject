package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Professor extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "professor_id", nullable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private final String USER_TYPE = "Professor";
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    @JoinColumn(name = "section_id")
    private Set<Section> sections;
    private String department;
    private String officeLocation;



    public Set<Section> getSections() {return sections;}

    public void setSections(Set<Section> sections) {this.sections = sections;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstname) {this.firstName = firstname;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getUserType() {return USER_TYPE;}

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

