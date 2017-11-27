package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Repository.RoomRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class RoomLoader implements ApplicationListener<ContextRefreshedEvent> {
    private RoomRepository roomRepository;
    private Logger log = Logger.getLogger(RoomLoader.class);

    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {this.roomRepository = roomRepository;}

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Room test = new Room();
        test.setRoomNum(1010);
        test.setSeats(50);

        roomRepository.save(test);

        log.info("Saved Room -id: " + test.getId());
    }

}