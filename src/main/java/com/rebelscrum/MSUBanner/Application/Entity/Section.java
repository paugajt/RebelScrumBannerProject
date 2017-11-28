package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name ="section_id", nullable = false)
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

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    private String days;
    private int timeStart;
    private int timeEnd;
    private Building building;
    private Room room;

    //Getters and setters
    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCourse() {return course.getCourseName();}

    public void setCourse(Course course) {this.course = course;}

    public String getProfessor() {return professor.getFirstName();}

    public void setProfessor(Professor professor) {this.professor = professor;}

}

