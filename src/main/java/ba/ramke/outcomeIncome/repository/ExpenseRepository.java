package ba.ramke.outcomeIncome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.ramke.outcomeIncome.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}