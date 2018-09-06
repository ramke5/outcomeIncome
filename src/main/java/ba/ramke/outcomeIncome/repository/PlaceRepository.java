package ba.ramke.outcomeIncome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.ramke.outcomeIncome.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long>{

}
