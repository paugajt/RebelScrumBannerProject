package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;

@Entity
public class Semester {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Term;
    private Integer year;

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
