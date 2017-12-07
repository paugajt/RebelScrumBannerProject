package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import com.rebelscrum.MSUBanner.Application.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation to communicate with the database.
 */
@Service
public class RoomServiceImpl implements RoomService {
    /**
     * repository to communicate with the database.
     */
    private RoomRepository roomRepository;

    /**
     * setter used for testing purposes.
     * @param roomRepository
     */
    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /**
     * list all the rooms from the database.
     * @return all rooms
     */
    @Override
    public Iterable<Room> listAllRooms() {
        return roomRepository.findAll();
    }

    /**
     * find the room in the database.
     * @param id of room
     * @return room
     */
    @Override
    public Room getRoomById(Integer id) {
        return roomRepository.findOne(id);
    }

    /**
     * save the room to the database.
     * @param room
     * @return room
     */
    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    /**
     * delete the room from the database.
     * @param id of room
     */
    @Override
    public void deleteRoom(Integer id) {
        roomRepository.delete(id);
    }
}