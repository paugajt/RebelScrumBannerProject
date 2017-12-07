package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;
import com.rebelscrum.MSUBanner.Application.Repository.ProfessorRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Loads the database with the information below.
 */
@Component
public class ProfessorLoader implements
        ApplicationListener<ContextRefreshedEvent> {
    /**
     * repository to communicate with database.
     */
    private ProfessorRepository professorRepository;
    /**
     * logger.
     */
    private Logger log = Logger.getLogger(ProfessorLoader.class);

    /**
     * for testing.
     * @param professorRepository
     */
    @Autowired
    public void setProfessorRepository(
            ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository; }

    /**
     * load the fields with this information.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Professor test = new Professor();
        test.setFirstName("Steve");
        test.setLastName("Beaty");
        test.setEmail("sbeaty@msudenver.edu");
        test.setDepartment("Computer Science");
        //test.setCurrentCourses("SW Dev, OS");
        test.setOfficeLocation("AES 218");

        professorRepository.save(test);

        log.info("Saved Professor -id: " + test.getId());
    }

}