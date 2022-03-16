package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Ride;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RideRepository extends CrudRepository<Ride, Integer> {
    Optional<Ride> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Ride> findFirstByIdGreaterThanOrderById(int id);
    Optional<Ride> findFirstByOrderByIdDesc();
    Optional<Ride> findFirstByOrderByIdAsc();
    @Query("SELECT r FROM Ride r WHERE (:min IS NULL OR r.distanceFromAntwerpInKm >= :min) AND (:max IS NULL OR r.distanceFromAntwerpInKm <= :max) ")
    Iterable<Ride> findByDistance(
            @Param("min") double min, @Param("max") double max);
}

