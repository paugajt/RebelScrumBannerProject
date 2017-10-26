package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.security.PrivateKey;

@Entity
public class Schedule {
    private Object Semester;
    private Object Building;
    private Object Course;
    private String days;

    final String MW = "mw";
    final String TR = "tr";
    final int time = 2;

    public Object getSemester() {
        return Semester;
    }

    public void setSemester(Object semester) {
        Semester = semester;
    }

    public Object getBuilding() {
        return Building;
    }

    public void setBuilding(Object building) {
        Building = building;
    }

    public Object getCourse() {
        return Course;
    }

    public void setCourse(Object course) {
        Course = course;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getMW() {
        return MW;
    }

    public String getTR() {
        return TR;
    }

    public int getTime() {
        return time;
    }
}
