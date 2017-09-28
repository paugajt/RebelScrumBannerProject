package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String courseName;
    private String department;
    private String creditLevel;
    private String description;
    private String learningObjectives;
    private String coReqs;
    private String semester;

    public  void setCourseName(String courseName) {this.courseName = courseName;}

    public String getCourseName() {return courseName;}

    public void setDepartment(String department) {this.department = department;}

    public String getDepartment() {return department;}

    public void setCreditLevel(String creditLevel) {this.creditLevel = creditLevel;}

    public String getCreditLevel() {return creditLevel;}

    public void setDescription(String description) {this.description = description;}

    public String getDescription() {return description;}

    public void setLearningObjectives(String learningObjectives) {this.learningObjectives = learningObjectives;}

    public String getLearningObjectives() {return learningObjectives;}

    public void setCoReqs(String coReqs) { this.coReqs = coReqs;}

    public String getCoReqs() {return coReqs;}

    public void setSemester(String semester) { this.semester = semester;}

    public String getSemester() {return semester;}

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
