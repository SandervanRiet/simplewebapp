package be.thomasmore.party.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Date;

@Entity
public class Ride {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ride_generator")
    @SequenceGenerator(name = "ride_generator", sequenceName = "ride_seq", allocationSize = 1)
    @Id
    private Integer id;
    @NotBlank
    private String name;
    private String endPoint;
    private String info;
    private double distanceFromAntwerpInKm;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date date;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date time;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private StartingPoint startingPoint;

    public Ride() {
    }



    public Ride(Integer id, String name,  String endPoint, String info, double distanceFromAntwerpInKm, Date date, Date time) {
        this.id = id;
        this.name = name;
        this.endPoint = endPoint;
        this.info = info;
        this.distanceFromAntwerpInKm = distanceFromAntwerpInKm;
        this.date = date;
        this.time = time;
    }

    public StartingPoint getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(StartingPoint startingPoint) {
        this.startingPoint = startingPoint;
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
