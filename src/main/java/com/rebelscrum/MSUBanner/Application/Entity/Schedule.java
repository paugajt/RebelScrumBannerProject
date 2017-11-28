package com.rebelscrum.MSUBanner.Application.Entity;
import javax.persistence.*;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Semester semester;
    @OneToOne
    @JoinColumn(name = "building_id")
    private Building building;
    @OneToMany
    public static Set<Section> sectionList;
    private String days;

    final String MW = "mw";
    final String TR = "tr";
    final int time = 2;

    public Semester getSemester() {return semester;}

    public void setSemester(Semester semester) {this.semester = semester;}

    public Building getBuilding() {return building;}

    public void setBuilding(Building building) {this.building = building;}

    public String getDays() {return days;}

    public void setDays(String days) {this.days = days;}

    public String getMW() {return MW;}

    public String getTR() {return TR; }

    public int getTime() {return time; }
    /*
    public void addCourse(Course course){
        if (conflicts(course) == false){
            this.sectionList.add(course);
        }
        else{
            //Error occurred, couldn't be added to schedule due to conflicts.
            //Need to put an alert in the HTML

        }
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }

    //Checks time and day conflicts for course to be added against courses already in course list
    public boolean conflicts(Course courseToAdd){
        boolean checkDays = true;
        boolean checkTimes = true;
        for (int i = 0; i < courseList.size(); i++){
            if (courseToAdd.getDays() != courseList.get(i).getDays()){
                checkDays = false;
            }

            if (!(courseToAdd.getTimeStart() > courseList.get(i).getTimeStart()) &&
		!(courseToAdd.getTimeEnd() < courseList.get(i).getTimeEnd())){
                checkTimes = false;
            }

            if (checkDays && checkTimes){
                return true;
            }

        }
        return false;
    }
    */

 }
