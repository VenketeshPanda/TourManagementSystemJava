package com.solera.tourmanagementsystem.TourManagementSystem.controller;

import com.solera.tourmanagementsystem.TourManagementSystem.entity.Tour;
import com.solera.tourmanagementsystem.TourManagementSystem.service.ServiceInterface;
import com.solera.tourmanagementsystem.TourManagementSystem.service.ServiceInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TourRestController {

    @Autowired
    private ServiceInterfaceImpl serviceInterfaceImpl;

    // Get all tours
    @GetMapping("/tours")
    public List<Tour> displayAll() {
        try {
            return serviceInterfaceImpl.displayAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Get a specific tour by ID
    @GetMapping("/tours/{theId}")
    public Tour displayTourById(@PathVariable int theId) {
        Tour tour = serviceInterfaceImpl.displayTourById(theId);
        if (serviceInterfaceImpl.displayTourById(theId)==null) {
            throw new TourNotFoundException("Tour with ID " + theId + " not found");
        } else {
            return tour;
        }
    }

    // Add a new tour
    @PostMapping("/tours")
    public void addTour(@RequestBody Tour theTour) {
        try {
            serviceInterfaceImpl.addTour(theTour);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update an existing tour
    @PutMapping("/tours")
    public void updateTour(@RequestBody Tour theTour) {
        try {
            serviceInterfaceImpl.updateTour(theTour);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete a tour by ID
    @DeleteMapping("/tours/{theId}")
    public void deleteTourById(@PathVariable int theId) {
        try {
            serviceInterfaceImpl.deleteTourById(theId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
