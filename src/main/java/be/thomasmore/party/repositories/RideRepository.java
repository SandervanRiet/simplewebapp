package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Ride;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RideRepository extends CrudRepository<Ride, Integer> {
    Iterable<Ride> findByOutdoor(boolean isOutdoor);
    Iterable<Ride> findByIndoor(boolean isIndoor);
    Iterable<Ride> findByCapacityLessThanEqual(int equal);
    Iterable<Ride> findByCapacityIsBetween(int less, int equal);
    Iterable<Ride> findByCapacityIsGreaterThanEqual(int equal);
    Optional<Ride> findFirstByIdLessThanOrderByIdDesc(Integer id);
    Optional<Ride> findFirstByIdGreaterThanOrderById(Integer id);
    Optional<Ride> findFirstByOrderByIdDesc();
    Optional<Ride> findFirstByOrderByIdAsc();

}

