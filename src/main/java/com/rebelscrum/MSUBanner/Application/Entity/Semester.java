package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.util.Set;

/**
 * impelement to find semester in database.
 */
@Entity
public class Semester {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * fields for database table.
     */
    private String semesterYear;

    /**
     * fields for database table.
     */
    @OneToMany
    @JoinColumn(name = "schedule_id")
    private Set<Schedule> schedules;

    /**
     * fields for database table.
     */
    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    /**
     * setter enrollments.
     * @param enrollments
     */
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments; }

    /**
     * getter enrollment.
     * @return enrollment
     */
    public Set<Enrollment> getEnrollments() {
        return this.enrollments; }


    /**
     * getter for semester.
     * @return
     */
    public String getSemesterYear() {
        return semesterYear;
    }

    /**
     * setter for semester.
     * @param semesterYear
     */
    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }
}