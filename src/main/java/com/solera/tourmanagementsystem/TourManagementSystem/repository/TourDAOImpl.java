package com.solera.tourmanagementsystem.TourManagementSystem.repository;

import com.solera.tourmanagementsystem.TourManagementSystem.entity.Tour;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TourDAOImpl implements TourDAO {

    @Autowired
    private EntityManager entityManager;

    // Retrieve all tours from the database
    @Override
    public List<Tour> displayAll() {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            Query<Tour> theQuery = currentSession.createQuery("from Tour", Tour.class);
            List<Tour> tours = theQuery.getResultList();
            return tours;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to retrieve tours");
        }
    }

    // Retrieve a tour from the database by its ID
    @Override
    public Tour displayTourById(int theId) {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            Tour theTour = currentSession.get(Tour.class, theId);
            return theTour;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to retrieve tour with ID: " + theId);
        }
    }

    // Add a new tour or update an existing tour in the database
    @Override
    public void addTour(Tour theTour) {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            currentSession.saveOrUpdate(theTour);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to add/update tour");
        }
    }

    // Update an existing tour in the database
    @Override
    public void updateTour(Tour theTour) {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            currentSession.saveOrUpdate(theTour);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to update tour with ID: " + theTour.getId());
        }
    }

    // Delete a tour from the database by its ID
    @Override
    public void deleteTourById(int theId) {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            Query<Tour> theQuery = currentSession.createQuery("delete from Tour where id=:theTourId");
            theQuery.setParameter("theTourId", theId);
            theQuery.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to delete tour with ID: " + theId);
        }
    }
}
