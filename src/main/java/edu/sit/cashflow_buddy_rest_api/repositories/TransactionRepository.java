package edu.sit.cashflow_buddy_rest_api.repositories;

import edu.sit.cashflow_buddy_rest_api.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}