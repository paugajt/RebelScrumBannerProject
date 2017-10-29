package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingServiceImpl implements BuildingService {
    private BuildingRepository buildingRepository;

    @Autowired
    public void setBuildingRepository(BuildingRepository buildingRepository){
        this.buildingRepository = buildingRepository;
    }

    @Override
    public Iterable<Building> listAllBuildings() {
        return buildingRepository.findAll();
    }

    @Override
    public Building getBuildingById(Integer id) {
        return buildingRepository.findOne(id);
    }

    @Override
    public Building saveBuilding(Building building) {
        return buildingRepository.save(building);
    }

    @Override
    public void deleteBuilding(Integer id) {
        buildingRepository.delete(id);
    }
}