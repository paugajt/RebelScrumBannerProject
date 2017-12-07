package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Room;

/**
 * interface to communicate with the database.
 */
public interface RoomService {

    /**
     * list all rooms in the database.
     * @return list of rooms
     */
    Iterable<Room> listAllRooms();

    /**
     * find room in the database.
     * @param id of room
     * @return the room
     */
    Room getRoomById(Integer id);

    /**
     * save the room to the database.
     * @param room
     * @return room
     */
    Room saveRoom(Room room);

    /**
     * delete the room from the database.
     * @param id of room
     */
    void deleteRoom(Integer id);
}
