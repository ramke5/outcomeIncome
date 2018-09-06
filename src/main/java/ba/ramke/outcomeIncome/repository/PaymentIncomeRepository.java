package ba.ramke.outcomeIncome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.ramke.outcomeIncome.model.PaymentIncome;

@Repository
public interface PaymentIncomeRepository extends JpaRepository<PaymentIncome, Long>{

}