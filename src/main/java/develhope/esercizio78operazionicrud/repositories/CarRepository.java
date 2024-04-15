package develhope.esercizio78operazionicrud.repositories;

import develhope.esercizio78operazionicrud.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
