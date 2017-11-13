package com.rebelscrum.MSUBanner.Application.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class Student extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Setter @Getter
    private Integer id;
    @Setter @Getter
    private String firstName;
    @Setter @Getter
    private String lastName;
    @Setter @Getter
    private String email;
    @Setter @Getter
    private String major;
    @Setter @Getter
    private Integer creditsEarned;
    @Setter @Getter
    private Integer creditLevel;



}

