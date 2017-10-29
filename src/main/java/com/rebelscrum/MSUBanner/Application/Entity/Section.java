package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Object Course;
    private Object Professor;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Object getCourse() {
        return Course;
    }

    public void setCourse(Object course) {
        this.Course = course;
    }

    public Object getProfessor() {
        return Professor;
    }

    public void setProfessor(Object professor) {
        this.Professor = professor;
    }
}

