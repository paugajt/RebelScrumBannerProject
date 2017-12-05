package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Semester semester;
    @OneToOne
    @JoinColumn(name = "building_id")
    private Building building;
    @OneToMany
    public static Set<Section> sectionList;
    private String days;

    final String MW = "mw";
    final String TR = "tr";
    final int time = 2;

    public Semester getSemester() {return semester;}

    public void setSemester(Semester semester) {this.semester = semester;}

    public Building getBuilding() {return building;}

    public void setBuilding(Building building) {this.building = building;}

    public String getDays() {return days;}

    public void setDays(String days) {this.days = days;}

    public String getMW() {return MW;}

    public String getTR() {return TR; }

    public int getTime() {return time; }

    public Set<Section> getSectionList() {return this.sectionList;}

    public void setSectionList(Set sectionLIst) {this.sectionList = sectionList;}

    //add a Section to the schedule
 }
