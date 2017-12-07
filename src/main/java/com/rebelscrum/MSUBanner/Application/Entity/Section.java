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

    private String days;
    private int timeStart;
    private int timeEnd;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;


    public void setEnrollments(Set<Enrollment> enrollments) {this.enrollments = enrollments;}
    public Set<Enrollment> getEnrollments() {return this.enrollments;}

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

    public String getBuilding() {
        return room.getBuilding() ;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


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

