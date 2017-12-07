package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Room;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface RoomRepository extends CrudRepository<Room, Integer> {
}
