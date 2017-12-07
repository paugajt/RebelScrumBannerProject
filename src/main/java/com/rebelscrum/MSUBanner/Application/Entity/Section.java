package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;

/**
 * implementation to create section database.
 */
@Entity
public class Section {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "section_id", nullable = false)
    /**
     * fields and relationships for sections.
     */
    private Integer id;

    /**
     * fields and relationships for sections.
     */
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    /**
     * fields and relationships for sections.
     */
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    /**
     * fields and relationships for sections.
     */
    @ManyToMany
    @JoinColumn(name = "student_id")
    private Set<Student> student;

    /**
     * fields and relationships for sections.
     */
    private String days;

    /**
     * fields and relationships for sections.
     */
    private int timeStart;

    /**
     * fields and relationships for sections.
     */
    private int timeEnd;

    /**
     * fields and relationships for sections.
     */
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    /**
     * fields and relationships for sections.
     */
    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    /**
     * sett enrollments.
     * @param enrollments
     */
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments; }

    /**
     * getter enrollments.
     * @return enrollments
     */
    public Set<Enrollment> getEnrollments() {
        return this.enrollments; }

    /**
     * days getter.
     * @return days
     */
    public String getDays() {
        return days;
    }

    /**
     * setter for days.
     * @param days
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * getter time start.
     * @return time
     */
    public int getTimeStart() {
        return timeStart;
    }

    /**
     * setter time start.
     * @param timeStart
     */
    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * getter time end.
     * @return end
     */
    public int getTimeEnd() {
        return timeEnd;
    }

    /**
     * setter time end.
     * @param timeEnd
     */
    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * getter building.
     * @return building
     */
    public String getBuilding() {
        return room.getBuilding();
    }

    /**
     * getter room.
     * @return room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * setter room.
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * getter for id.
     * @return id
     */

    public Integer getId() {return id;}


    /**
     * setter for id.
     * @param id
     */
    public void setId(Integer id) {
        this.id = id; }

    /**
     * getter for course.
     * @return course name
     */
    public String getCourse() {
        return course.getCourseName(); }

    /**
     * setter for course.
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course; }

    /**
     * getter for professor.
     * @return professor first name
     */
    public String getProfessor() {
        return professor.getFirstName(); }

    /**
     * setter for professor.
     * @param professor
     */
    public void setProfessor(Professor professor) {
        this.professor = professor; }

}

