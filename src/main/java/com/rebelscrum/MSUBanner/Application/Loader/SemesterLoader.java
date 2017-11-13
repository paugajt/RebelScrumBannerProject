package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Repository.SemesterRepository;
import groovy.util.logging.Commons;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class SemesterLoader implements ApplicationListener<ContextRefreshedEvent>{
    private SemesterRepository semesterRepository;

    private Logger log = Logger.getLogger(UserLoader.class);

    @Autowired
    public void setSemesterRepository(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Semester semester = new Semester();
        semester.setTerm("Fall");
        semester.setTerm("Spring");
        semesterRepository.save(semester);
    }
}
