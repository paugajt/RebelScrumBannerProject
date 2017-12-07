package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;
import java.util.ArrayList;

/**
 * course class with fields to implement into database.
 */
@Entity
public class Course {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    /**
     * all fields and parameters for courses.
     */
    private Integer id;
    /**
     *
     */
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    /**
     *
     */
    private Set<Section> sections;
    /**
     *
     */
    private String courseName;
    /**
     *
     */
    private String department;
    /**
     *
     */
    private String creditLevel;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private String learningObjectives;
    /**
     *
     */
    private String coReqs;
    /**
     *
     */
    private String semester;


    //private Building building;
    //private Room room;

    private ArrayList<Course> allCourses = new ArrayList<>();
    /**
     * Set of sections in the database.
     * @return sections
     */
    public Set<Section> getSections() {
        return sections; }

    /**
     * setter for section.
     * @param sections
     */
    public void setSections(Set<Section> sections) {
        this.sections = sections; }

    /**
     * setter for course name.
     * @param courseName
     */
    public  void setCourseName(String courseName) {
        this.courseName = courseName; }

    /**
     * getter for course name.
     * @return courseName
     */
    public String getCourseName() {
        return courseName; }

    /**
     * setter for department.
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department; }

    /**
     * getter for department.
     * @return department
     */
    public String getDepartment() {
        return department; }

    /**
     * setter for creditlevel.
     * @param creditLevel
     */
    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel; }

    /**
     * getter for credit level.
     * @return credit level
     */
    public String getCreditLevel() {
        return creditLevel; }

    /**
     * setter for description.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description; }

    /**
     * getter for description.
     * @return description
     */
    public String getDescription() {
        return description; }

    /**
     * setter for learning.
     * @param learningObjectives
     */
    public void setLearningObjectives(String learningObjectives) {
        this.learningObjectives = learningObjectives; }

    /**
     * getter for learning.
     * @return learning objectives
     */
    public String getLearningObjectives() {
        return learningObjectives; }

    /**
     * setter for coreqs.
     * @param coReqs
     */
    public void setCoReqs(String coReqs) {
        this.coReqs = coReqs; }

    /**
     * getter for coreqs.
     * @return coreqs
     */
    public String getCoReqs() {
        return coReqs; }

    /**
     * setter for semester.
     * @param semester
     */
    public void setSemester(String semester) {
        this.semester = semester; }

    /**
     * getter for semester.
     * @return semester
     */
    public String getSemester() {
        return semester; }

    /**
     * getter for id.
     * @return id
     */
    public Integer getId() {
        return id; }

    /**
     * setter for id.
     * @param id
     */
    public void setId(Integer id) {

        this.id = id; }


    /*
    public Building getBuilding() {return building;}

    public void setBuilding(Building building) {this.building = building;}

    public Room getRoom() {return room;}

    public void setRoom(Room room) {this.room = room;}

    public void addCourseToList(){
        if (conflicts() == false){
            allCourses.add(this);
        }
        else{
            //Error occurred, couldn't be added to schedule due to conflicts.
            //Need to put an alert in the HTML

        }
    }

    public boolean conflicts(){
        Course courseToAdd = this;
        boolean checkDays = true;
        boolean checkTimes = true;
        boolean checkRooms = true;
        for (int i = 0; i < allCourses.size(); i++){
            if (courseToAdd.getDays() != allCourses.get(i).getDays()){
                checkDays = false;
            }

            if (!(courseToAdd.getTimeStart() >
            allCourses.get(i).getTimeStart()) &&!(courseToAdd.getTimeEnd()
            < allCourses.get(i).getTimeEnd())){
                checkTimes = false; }

            if ((courseToAdd.getBuilding() ==
            allCourses.get(i).getBuilding()) && (courseToAdd.getRoom() ==
            allCourses.get(i).getRoom())){
                checkRooms = false;

            }

            if (checkDays && checkTimes && checkRooms){
                return true;
            }



        }
        return false;
    }
*/
}
