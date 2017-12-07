package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Repository.RoomRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Loads the database with the information below
 */
@Component
public class RoomLoader implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * repository to communicate with database.
     */
    private RoomRepository roomRepository;
    private Logger log = Logger.getLogger(RoomLoader.class);

    /**
     * for testing.
     * @param roomRepository
     */
    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository; }

    /**
     * load the fields with this information.
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Room test = new Room();
        test.setRoomNum(1010);
        test.setSeats(50);

        roomRepository.save(test);

        log.info("Saved Room -id: " + test.getId());
    }

}