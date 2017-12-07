package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.util.Set;

/**
 * implementation to create database table.
 */
@Entity
public class Schedule {
    /**
     * fields to create the database table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * fields to create the database table.
     */
    @ManyToOne
    private Semester semester;
    /**
     * fields to create the database table.
     */
    @OneToOne
    @JoinColumn(name = "building_id")
    private Building building;
    /**
     * fields to create the database table.
     */
    @OneToMany
    public static Set<Section> sectionList;
    /**
     * fields to create the database table.
     */
    private String days;
    /**
     * fields to create the database table.
     */
    final String MW = "mw";
    /**
     * fields to create the database table.
     */
    final String TR = "tr";
    /**
     * fields to create the database table.
     */
    final int time = 2;

    /**
     * getter for semester.
     * @return semester
     */
    public Semester getSemester() {
        return semester; }

    /**
     * setter for semester.
     * @param semester
     */
    public void setSemester(Semester semester) {
        this.semester = semester; }

    /**
     * getter for building.
     * @return building
     */
    public Building getBuilding() {
        return building; }

    /**
     * setter for semester.
     * @param building
     */
    public void setBuilding(Building building) {
        this.building = building; }

    /**
     * getter for days.
     * @return days
     */
    public String getDays() {
        return days; }

    /**
     * setter for semester.
     * @param days
     */
    public void setDays(String days) {
        this.days = days; }

    /**
     * getter for MW.
     * @return mw
     */
    public String getMW() {
        return MW; }

    /**
     * getter for TR.
     * @return tr
     */
    public String getTR() {
        return TR; }

    /**
     * getter for Time.
     * @return time
     */
    public int getTime() {
        return time; }

    /**
     * @return section list.
     */
    public Set<Section> getSectionList() {
        return this.sectionList; }
    /**
     *
     */
    public void setSectionList(Set sectionLIst) {
        this.sectionList = sectionList; }

    //add a Section to the schedule
 }
