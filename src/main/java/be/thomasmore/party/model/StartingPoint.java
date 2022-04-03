package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class StartingPoint {
    @Id
    private Integer id;
    private String startingPointName;
    private Integer maximumMotorcycles;
    private String information;
    private String city;
    private boolean pubNearby;
    private boolean foodshopNearby;


    public StartingPoint() {
    }

    public StartingPoint( String startingPointName, Integer maximimMotorcycles, String information, String city, boolean pubNearby, boolean foodshopNearby) {
        this.startingPointName = startingPointName;
        this.maximumMotorcycles = maximimMotorcycles;
        this.information = information;
        this.city = city;
        this.pubNearby = pubNearby;
        this.foodshopNearby = foodshopNearby;
    }

    public String getStartingPointName() {
        return startingPointName;
    }

    public void setStartingPointName(String startingPointName) {
        this.startingPointName = startingPointName;
    }

    public Integer getId() {
        return id;
    }


    public Integer getMaximumMotorcycles() {
        return maximumMotorcycles;
    }

    public void setMaximumMotorcycles(Integer maximimMotorcycles) {
        this.maximumMotorcycles = maximimMotorcycles;
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
