package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Term;
    private Integer year;
    @OneToMany
    @JoinColumn(name = "schedule_id")
    private Set<Schedule> schedules;
    @OneToMany(mappedBy = "semester", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    public void setEnrollments(Set<Enrollment> enrollments) {this.enrollments = enrollments;}
    public Set<Enrollment> getEnrollments() {return this.enrollments;}

    public void setTerm(String term) {
        this.Term = term;
    }

    public String getTerm() {
        return Term;
    }


    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }
}
