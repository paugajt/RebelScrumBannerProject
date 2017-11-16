package com.rebelscrum.MSUBanner.Application.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name ="section_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JsonBackReference
    private Course course;

    @ManyToOne
    private Professor professor;

    @ManyToMany
    @JoinColumn(name = "student_id")
    private Set<Student> student;

    //Getters and setters
    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCourse() {return course.getCourseName();}

    public void setCourse(Course course) {this.course = course;}

    public String getProfessor() {return professor.getFirstName();}

    public void setProfessor(Professor professor) {this.professor = professor;}

}

