package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Room;

public interface RoomService {
    Iterable<Room> listAllRooms();

    Room getRoomById(Integer id);

    Room saveRoom(Room room);

    void deleteRoom(Integer id);
}
