package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;

    public void setId(Integer id) {this.id = id;}
    public Integer getId() {return this.id;}

    public void setSection(Section section) {this.section = section;}
    public Section getSection() {return this.section;}

    public void setStudent(Student student) {this.student = student;}
    public Student getStudent() {return this.student;}

    public void setSemester(Semester semester) {this.semester = semester;}
    public Semester getSemester() {return this.semester;}


}
