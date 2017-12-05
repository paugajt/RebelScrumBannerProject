package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;

/**
 * implementation to create section database
 */
@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name ="section_id", nullable = false)
    /**
     * fields and relationships for sections
     */
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany
    @JoinColumn(name = "student_id")
    private Set<Student> student;

    //Getters and setters

    /**
     * getter for id
     * @return
     */
    public Integer getId() {return id;}

    /**
     * setter for id
     * @param id
     */
    public void setId(Integer id) {this.id = id;}

    /**
     * getter for course
     * @return
     */
    public String getCourse() {return course.getCourseName();}

    /**
     * setter for course
     * @param course
     */
    public void setCourse(Course course) {this.course = course;}

    /**
     * setter for professor
     * @return
     */
    public String getProfessor() {return professor.getFirstName();}

    /**
     * getter for professor
     * @param professor
     */
    public void setProfessor(Professor professor) {this.professor = professor;}

}

