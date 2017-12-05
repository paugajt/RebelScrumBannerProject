package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.util.Set;

/**
 * impelement to find semester in database
 */
@Entity
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * fields for database table
     */
    private String semesterYear;
    @OneToMany
    @JoinColumn(name = "schedule_id")
    private Set<Schedule> schedules;
    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    public void setEnrollments(Set<Enrollment> enrollments) {this.enrollments = enrollments;}
    public Set<Enrollment> getEnrollments() {return this.enrollments;}


    /**
     * getter for semester
     * @return
     */
    public String getSemesterYear() {
        return semesterYear;
    }

    /**
     * setter for semester
     * @param semesterYear
     */
    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }
}