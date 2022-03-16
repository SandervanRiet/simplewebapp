package be.thomasmore.party.model;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
public class Ride {
    @Id
    private Integer id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private StartingPoint startingPoint;
    private String endPoint;
    private String info;
    private double distanceFromAntwerpInKm;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date time;

    public Ride() {
    }

    public Ride(Integer id, String name, StartingPoint startingPoint, String endPoint, String info, double distanceFromAntwerpInKm, Date date, Date time) {
        this.id = id;
        this.name = name;
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
        this.info = info;
        this.distanceFromAntwerpInKm = distanceFromAntwerpInKm;
        this.date = date;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StartingPoint getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(StartingPoint startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public double getDistanceFromAntwerpInKm() {
        return distanceFromAntwerpInKm;
    }

    public void setDistanceFromAntwerpInKm(double distanceFromAntwerpInKm) {
        this.distanceFromAntwerpInKm = distanceFromAntwerpInKm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
