package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Building;

/**
 * Building interface to interact with the database.
 */
public interface BuildingService {

    /**
     * lists all the buildings in the database.
     * @return the building in the database
     */
    Iterable<Building> listAllBuildings();

    /**
     * find the building by id.
     * @param id the building id
     * @return the building
     */
    Building getBuildingById(Integer id);


    /**
     * save the building to the database.
     * @param building save
     * @return the saved buildings
     */
    Building saveBuilding(Building building);

    /**
     * delete the building from the database.
     * @param id the id of the building
     */
    void deleteBuilding(Integer id);
}
