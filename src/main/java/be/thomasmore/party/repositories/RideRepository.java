package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Ride;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RideRepository extends CrudRepository<Ride, Integer> {
    Optional<Ride> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Ride> findFirstByIdGreaterThanOrderById(int id);
    Optional<Ride> findFirstByOrderByIdDesc();
    Optional<Ride> findFirstByOrderByIdAsc();
}

