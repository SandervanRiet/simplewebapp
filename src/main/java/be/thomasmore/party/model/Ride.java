package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ride {
    @Id
    private Integer id;
    private String startingPoint;
    private String moreInfo;
    private int capacity;
    private boolean foodProvided;
    private boolean indoor;
    private boolean outdoor;
    private boolean freeParkingAvailable;
    private String city;
    private double distanceFromPublicTransportInKm;


    public Ride(String venueName, String linkMoreInfo) {
        this.startingPoint = venueName;
        this.moreInfo = linkMoreInfo;
    }

    public Ride(String venueName, String linkMoreInfo, int capacity, boolean foodProvided, boolean indoor, boolean outdoor, boolean freeParkingAvailable, String city, double distanceFromPublicTransportInKm) {
        this.startingPoint = venueName;
        this.moreInfo = linkMoreInfo;
        this.capacity = capacity;
        this.foodProvided = foodProvided;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.freeParkingAvailable = freeParkingAvailable;
        this.city = city;
        this.distanceFromPublicTransportInKm = distanceFromPublicTransportInKm;
    }

    public Ride() {

    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String venueName) {
        this.startingPoint = venueName;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String linkMoreInfo) {
        this.moreInfo = linkMoreInfo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFoodProvided() {
        return foodProvided;
    }

    public void setFoodProvided(boolean foodProvided) {
        this.foodProvided = foodProvided;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public boolean isFreeParkingAvailable() {
        return freeParkingAvailable;
    }

    public void setFreeParkingAvailable(boolean freeParkingAvailable) {
        this.freeParkingAvailable = freeParkingAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getDistanceFromPublicTransportInKm() {
        return distanceFromPublicTransportInKm;
    }

    public void setDistanceFromPublicTransportInKm(double distanceFromPublicTransportInKm) {
        this.distanceFromPublicTransportInKm = distanceFromPublicTransportInKm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
