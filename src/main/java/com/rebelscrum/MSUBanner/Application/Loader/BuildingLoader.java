package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Repository.BuildingRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Loads the database with the information below.
 */
@Component
public class BuildingLoader implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * repository to communicate with database.
     */
    private BuildingRepository buildingRepository;
  /**
   * logger.
   */
    private Logger log = Logger.getLogger(BuildingLoader.class);

    /**
     * for testing.
     * @param buildingRepository
     */
    @Autowired
    public void setBuildingRepository(BuildingRepository buildingRepository) {
      this.buildingRepository = buildingRepository; }

    /**
     * load the fields with this information.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
/*
        Building test = new Building();
        Room testRoom = new Room();
        testRoom.setSeats(50);
        testRoom.setRoomNum(1010);
        test.setBuildingName("Science");
        test.setAddress("100 MSU Dr.");
        test.addDepartment("Computer Science");
        test.addRoom(testRoom);

        buildingRepository.save(test);

        log.info("Saved Building -id: " + test.getId());
        */
    }

}