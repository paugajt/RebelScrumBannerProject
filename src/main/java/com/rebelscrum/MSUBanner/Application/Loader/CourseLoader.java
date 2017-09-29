package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Course;
import com.rebelscrum.MSUBanner.Application.Repository.CourseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class CourseLoader implements ApplicationListener<ContextRefreshedEvent> {
    private CourseRepository courseRepository;
    private Logger log = Logger.getLogger(CourseLoader.class);

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {this.courseRepository = courseRepository;}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Course test = new Course();
        test.setCourseName("Software Development");
        test.setCoReqs("Computer org 2");
        test.setCreditLevel("Senior");
        test.setDepartment("Computer Sciences");
        test.setDescription("The student will learn the ins and outs of software development as well as working in" +
                " an agile development environment");
        test.setLearningObjectives("Student will be able to apply software engineering principles in an agile team" +
                " environment");
        test.setSemester("Fall");
        courseRepository.save(test);

        log.info("Saved Course -id: " + test.getId());
    }

}
