package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.security.PrivateKey;
import java.util.ArrayList;

@Entity
public class Schedule {
    private Semester semester;
    private Building building;
    private ArrayList<Course> courseList= new ArrayList<>();
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

    public void addCourse(Course course){
        this.courseList.add(course);
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }

 }
