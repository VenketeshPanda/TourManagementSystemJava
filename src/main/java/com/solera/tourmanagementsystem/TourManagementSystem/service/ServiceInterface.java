package com.solera.tourmanagementsystem.TourManagementSystem.service;

import com.solera.tourmanagementsystem.TourManagementSystem.entity.Tour;

import java.util.List;

public interface ServiceInterface {
    public List<Tour> displayAll();

    public Tour displayTourById(int theId);

    public void addTour(Tour theTour);

    public void updateTour(Tour theTour);

    public void deleteTourById(int theId);
}
