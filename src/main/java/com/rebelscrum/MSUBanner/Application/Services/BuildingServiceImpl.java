package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation to communicate to the database.
 */
@Service
public class BuildingServiceImpl implements BuildingService {

    /**
     * Repository used to communicate with the database.
     */
    private BuildingRepository buildingRepository;

    /**
     * Setter for building to be used for testing purposes.
     * @param buildingRepository
     */
    @Autowired
    public void setBuildingRepository(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    /**
     * show all the buildings in the database.
     * @return the list of all the buildings
     */
    @Override
    public Iterable<Building> listAllBuildings() {
        return buildingRepository.findAll();
    }

    /**
     * find the building using the id.
     * @param id the building id
     * @return the building
     */
    @Override
    public Building getBuildingById(Integer id) {
        return buildingRepository.findOne(id);
    }

    /**
     * save the building to the database.
     * @param building save building
     * @return the saved building
     */
    @Override
    public Building saveBuilding(Building building) {
        return buildingRepository.save(building);
    }

    /**
     * delete the building from the database using the id.
     * @param id delete the id of the building
     */
    @Override
    public void deleteBuilding(Integer id) {
        buildingRepository.delete(id);
    }
}