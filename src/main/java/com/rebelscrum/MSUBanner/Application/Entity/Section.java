package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false)

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Integer id;

    
    // These are suppose to be real Course and Professor types such as 'private Professor professor';
    // Once you add the the real types you need to add OneToOne annotation here which says 'each section has 
    // one professor and one course'
    //  @OneToOne
    // The annotation will need to know what is the foriegin key that you are trying to join with this so you
    //  @JoinColumn(name="") <-- the name is the column name of what you have defined as the foregin key in the professor/course entity
    
    private String course;

    private String professor;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getCourse() {return course.getCourseName();}

    public void setCourse(Course course) {this.course = course;}

    public String getProfessor() {return professor;}

    public void setProfessor(String professor) {this.professor = professor;}
}

