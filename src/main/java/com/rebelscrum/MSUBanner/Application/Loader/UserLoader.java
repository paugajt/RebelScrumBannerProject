package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Loads the database with the information below.
 */
@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * repository to communicate with database.
     */
    private UserRepository userRepository;
    /**
     * logger.
     */
    private Logger log = Logger.getLogger(UserLoader.class);

    /**
     * for testing.
     * @param userRepository
     */
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * load the fields with this information.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User test = new User();
        test.setFirstName("Justin");
        test.setLastName("Pauga");
        test.setEmail("jpauga@msudenver.edu");
        test.setUserType("test");
        test.setPassword("password");

        userRepository.save(test);

        log.info("Saved user -id: " + test.getId());

        User teacher = new User();
        teacher.setFirstName("Steve");
        teacher.setLastName("Beaty");
        teacher.setEmail("sbeaty@msudenver.edu");
        teacher.setUserType("Professor");
        teacher.setPassword("password");
        userRepository.save(teacher);

        log.info("Saved Teacher -id: " + teacher.getId());
    }
}
