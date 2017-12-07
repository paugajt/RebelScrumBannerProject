package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface BuildingRepository extends CrudRepository<Building, Integer> {
}
