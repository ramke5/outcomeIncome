package ba.ramke.outcomeIncome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.ramke.outcomeIncome.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
