package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Ride;
import be.thomasmore.party.model.StartingPoint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RideRepository extends CrudRepository<Ride, Integer> {
    Optional<Ride> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Ride> findFirstByIdGreaterThanOrderById(int id);
    Optional<Ride> findFirstByOrderByIdDesc();
    Optional<Ride> findFirstByOrderByIdAsc();
    Iterable<Ride> findByStartingPoint(StartingPoint startingPoint);

    @Query("SELECT r FROM Ride r WHERE (:min IS NULL OR r.distanceFromAntwerpInKm >= :min) " +
            "AND (:max IS NULL OR r.distanceFromAntwerpInKm <= :max) "
            /*+
            "AND (:mintime IS NULL OR r.time >= :mintime)" +
            "AND (:maxtime IS NULL OR r.time <= :maxtime)" +
            "AND (:mindate IS NULL OR r.date >= :mindate)" +
            "AND (:maxdate IS NULL OR r.date <= :maxdate)"*/
    )
    Iterable<Ride> findByDistanceTimeDate(
            @Param("min") Double min, @Param("max") Double max
           /* , @Param("mintime") Date mintime, @Param("maxtime") Date maxtime,
            @Param("mindate") Date mindate, @Param("maxdate") Date maxdate*/
    );
}

