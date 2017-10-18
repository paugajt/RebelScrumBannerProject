package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false)

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Integer id;

    private String professor;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCourse() {return course.getCourseName();}

    public void setCourse(Course course) {this.course = course;}

    public String getProfessor() {return professor;}

    public void setProfessor(String professor) {this.professor = professor;}
}

