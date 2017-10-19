package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Repository.BuildingRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class BuildingLoader implements ApplicationListener<ContextRefreshedEvent> {
    private BuildingRepository buildingRepository;
    private Logger log = Logger.getLogger(BuildingLoader.class);

    @Autowired
    public void setBuildingRepository(BuildingRepository buildingRepository) {this.buildingRepository = buildingRepository;}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Building test = new Building();
        test.setBuildingName("Science");
        test.setAddress("100 MSU Dr.");
        test.setRoomCount(10);

        buildingRepository.save(test);

        log.info("Saved Building -id: " + test.getId());
    }

}