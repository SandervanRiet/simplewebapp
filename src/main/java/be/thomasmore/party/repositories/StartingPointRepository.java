package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Ride;
import be.thomasmore.party.model.StartingPoint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StartingPointRepository extends CrudRepository<StartingPoint, Integer> {
    Optional<StartingPoint> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<StartingPoint> findFirstByIdGreaterThanOrderById(int id);
    Optional<StartingPoint> findFirstByOrderByIdDesc();
    Optional<StartingPoint> findFirstByOrderByIdAsc();
    @Query("SELECT s FROM StartingPoint s " +
            "WHERE (:foodshopNearby IS NULL OR s.foodshopNearby = :foodshopNearby) " +
            "AND (:pubNearby IS NULL OR s.pubNearby = :pubNearby) ")
    List<StartingPoint> findBypubNearbyfoodshopNearby(
            @Param("foodshopNearby") Boolean foodshopNearby,
            @Param("pubNearby") Boolean pubNearby);
}
