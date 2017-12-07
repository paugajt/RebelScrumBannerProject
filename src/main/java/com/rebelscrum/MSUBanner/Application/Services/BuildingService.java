package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Building;

public interface BuildingService {
    Iterable<Building> listAllBuildings();

    Building getBuildingById(Integer id);

    Building saveBuilding(Building building);

    void deleteBuilding(Integer id);
}
