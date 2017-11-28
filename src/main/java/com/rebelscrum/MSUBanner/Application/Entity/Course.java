package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;
import java.util.ArrayList;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    private Integer id;
    
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Section> sections;

    private String courseName;
    private String department;
    private String creditLevel;
    private String description;
    private String learningObjectives;
    private String coReqs;
    private String semester;

    private ArrayList<Course> allCourses = new ArrayList<>();


    public Set<Section> getSections() {return sections;}

    public void setSections(Set<Section> sections) {this.sections = sections;}

    public  void setCourseName(String courseName) {this.courseName = courseName;}

    public String getCourseName() {return courseName;}

    public void setDepartment(String department) {this.department = department;}

    public String getDepartment() {return department;}

    public void setCreditLevel(String creditLevel) {this.creditLevel = creditLevel;}

    public String getCreditLevel() {return creditLevel;}

    public void setDescription(String description) {this.description = description;}

    public String getDescription() {return description;}

    public void setLearningObjectives(String learningObjectives) {this.learningObjectives = learningObjectives;}

    public String getLearningObjectives() {return learningObjectives;}

    public void setCoReqs(String coReqs) { this.coReqs = coReqs;}

    public String getCoReqs() {return coReqs;}

    public void setSemester(String semester) { this.semester = semester;}

    public String getSemester() {return semester;}

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

            if (!(courseToAdd.getTimeStart() > allCourses.get(i).getTimeStart()) &&
		!(courseToAdd.getTimeEnd() < allCourses.get(i).getTimeEnd())){
                checkTimes = false;
            }

            if ((courseToAdd.getBuilding() == allCourses.get(i).getBuilding()) &&
		(courseToAdd.getRoom() == allCourses.get(i).getRoom())){
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
