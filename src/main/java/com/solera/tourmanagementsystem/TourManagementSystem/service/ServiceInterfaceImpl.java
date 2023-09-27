package com.solera.tourmanagementsystem.TourManagementSystem.service;

import com.solera.tourmanagementsystem.TourManagementSystem.entity.Tour;
import com.solera.tourmanagementsystem.TourManagementSystem.repository.TourDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowired
    private TourDAO tourDAO;
    @Override
    @Transactional
    public List<Tour> displayAll() {
        return tourDAO.displayAll();
    }

    @Override
    @Transactional
    public Tour displayTourById(int theId) {
        return tourDAO.displayTourById(theId);
    }

    @Override
    @Transactional
    public void addTour(Tour theTour) {
        tourDAO.addTour(theTour);
    }

    @Override
    @Transactional
    public void updateTour(Tour theTour) {
        tourDAO.updateTour(theTour);
    }

    @Override
    @Transactional
    public void deleteTourById(int theId) {
        tourDAO.deleteTourById(theId);
    }
}
