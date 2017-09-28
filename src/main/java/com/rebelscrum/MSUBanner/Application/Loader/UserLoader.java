package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {
    private UserRepository userRepository;

    private Logger log = Logger.getLogger(UserLoader.class);

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User student = new User();
        student.setFirstName("Justin");
        student.setLastName("Pauga");
        student.setEmail("jpauga@msudenver.edu");
        userRepository.save(student);

        log.info("Saved Student -id: " + student.getId());

        User teacher = new User();
        teacher.setFirstName("Steve");
        teacher.setLastName("Beaty");
        teacher.setEmail("sbeaty@msudenver.edu");
        userRepository.save(teacher);

        log.info("Saved Teacher -id: " + teacher.getId());

    }
}
