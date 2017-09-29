package com.rebelscrum.MSUBanner.Application.Loader;


import com.rebelscrum.MSUBanner.Application.Entity.Section;
import com.rebelscrum.MSUBanner.Application.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component
public class SectionLoader implements ApplicationListener<ContextRefreshedEvent> {
    private SectionRepository sectionRepository;

    private Logger log = Logger.getLogger(SectionLoader.class);

    @Autowired
    public void setSectionRepository(SectionRepository sectionRepository) {this.sectionRepository = sectionRepository;}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Section section = new Section();
        section.setCourse("Software Development");
        section.setProfessor("Steve Beaty");
        sectionRepository.save(section);

        log.info("Saved Section -id:" + section.getId());
    }

}
