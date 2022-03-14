package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StartingPoint {
    @Id
    private Integer id;
    private Integer maximimMotorcycles;
    private String information;
    private String city;
    private boolean pubNearby;
    private boolean foodshopNearby;

    public StartingPoint() {
    }

    public StartingPoint(Integer id, Integer maximimMotorcycles, String information, String city, boolean pubNearby, boolean foodshopNearby) {
        this.id = id;
        this.maximimMotorcycles = maximimMotorcycles;
        this.information = information;
        this.city = city;
        this.pubNearby = pubNearby;
        this.foodshopNearby = foodshopNearby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaximimMotorcycles() {
        return maximimMotorcycles;
    }

    public void setMaximimMotorcycles(Integer maximimMotorcycles) {
        this.maximimMotorcycles = maximimMotorcycles;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPubNearby() {
        return pubNearby;
    }

    public void setPubNearby(boolean pubNearby) {
        this.pubNearby = pubNearby;
    }

    public boolean isFoodshopNearby() {
        return foodshopNearby;
    }

    public void setFoodshopNearby(boolean foodshopNearby) {
        this.foodshopNearby = foodshopNearby;
    }
}
