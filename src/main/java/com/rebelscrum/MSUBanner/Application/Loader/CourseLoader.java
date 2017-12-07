package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Entity.Course;
//import com.rebelscrum.MSUBanner.Application.Entity.Room;
//import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Repository.CourseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Loads the database with the information below.
 */
@Component
public class CourseLoader implements ApplicationListener
        <ContextRefreshedEvent> {
    /**
     * repository to communicate with database.
     */
    private CourseRepository courseRepository;
    /**
     * logger.
     */
    private Logger log = Logger.getLogger(CourseLoader.class);

    /**
     * for testing.
     * @param courseRepository
     */
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository; }

    /**
     * load the fields with this information.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    /*

     //   Room test2 = new Room();
       // Building test1 = new Building();


	Room test2 = new Room();

        Room test2 = new Room();
        Building test1 = new Building();
        Course test = new Course();
        test.setCourseName("Software Development");
        test.setCoReqs("Computer org 2");
        test.setCreditLevel("Senior");
        test.setDepartment("Computer Sciences");
        test.setDescription("The student will learn the ins
        and outs of software development as well as working in" +
                " an agile development environment");
        test.setLearningObjectives("Student will be able to
        apply software engineering principles in an agile team" +
                " environment");
        test.setSemester("Fall");
        test.setDays("MW");
        test.setTimeStart(1200);
        test.setTimeEnd(1350);
      //  test.setBuilding(test1);
       // test.setRoom(test2);

        courseRepository.save(test);
        test.setDays("MW");
        test.setTimeStart(1200);
        test.setTimeEnd(1350);
        test.setBuilding(test1);
        test.setRoom(test2);


        log.info("Saved Course -id: " + test.getId());
        */
    }

}
