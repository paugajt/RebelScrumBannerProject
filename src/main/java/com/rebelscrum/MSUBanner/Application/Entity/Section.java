package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String course;
    private String professor;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCourse() {return course;}


    public void setCourse(String course) {this.course = course;}

    public String getProfessor() {return professor;}

    public void setProfessor(String professor) {this.professor = professor;}
}

