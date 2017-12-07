package com.rebelscrum.MSUBanner.Application.Entity;


import javax.persistence.*;
import java.util.Set;

/**
 * Enrollment functions.
 */
@Entity
public class Enrollment {

    /**
     * @param id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;


    /**
     *@param id
     */
    public void setId(Integer id) {
        this.id = id; }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id; }

    /**
     *@param section
     */
    public void setSection(Section section) {
        this.section = section; }
    /**
     * @return section
     */
    public Section getSection() {
        return this.section; }

    /**
     *@param student
     */
    public void setStudent(Student student) {
        this.student = student; }

    /**
     * @return student
     */
    public Student getStudent() {
        return this.student; }

    /**
     *@param semester
     */
    public void setSemester(Semester semester) {
        this.semester = semester; }

    /**
     * @return semestre
     */
    public Semester getSemester() {
        return this.semester; }


}
