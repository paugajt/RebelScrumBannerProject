package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Repository.StudentRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StudentLoader implements ApplicationListener<ContextRefreshedEvent> {
    private StudentRepository studentRepository;

    private Logger log = Logger.getLogger(StudentLoader.class);

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Student one = new Student();
        one.setFirstName("Justin");
        one.setLastName("Smith");
        one.setEmail("jpauga@msudenver.edu");
        one.setCreditLevel(20);
        one.setCreditsEarned(30);
        one.setMajor("Computer Science");
        studentRepository.save(one);

        log.info("Saved Student -id: " + one.getId());


    }
}
