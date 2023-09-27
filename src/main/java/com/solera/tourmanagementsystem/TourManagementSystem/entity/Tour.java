package com.solera.tourmanagementsystem.TourManagementSystem.entity;
import javax.persistence.*;

@Entity
@Table(name = "Tour")
@SequenceGenerator(name="MySequence",sequenceName = "tour_sequence",initialValue = 50,allocationSize = 1)
public class Tour {
    @Id()
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "MySequence")
    private int id;
    @Column(name="package_name")
    private String packageName;
    @Column(name="source")
    private String source;

    @Column(name="destination")
    private String destination;

    @Column(name="duration")
    private String duration;

    @Column(name="price")
    private double price;

    @Column(name="amenities")
    private String amenities;

    public Tour() {
    }

    public Tour(int id, String packageName, String source, String destination, String duration, double price, String amenities) {
        this.id = id;
        this.packageName = packageName;
        this.source = source;
        this.destination = destination;
        this.duration = duration;
        this.price = price;
        this.amenities = amenities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", packageName='" + packageName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", duration='" + duration + '\'' +
                ", price=" + price +
                ", amenities='" + amenities + '\'' +
                '}';
    }
}
