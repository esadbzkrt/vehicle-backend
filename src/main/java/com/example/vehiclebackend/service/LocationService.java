package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.Location;
import com.example.vehiclebackend.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }


    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location saveLocation(Location location) {
        locationRepository.save(location);
        return location;
    }
}