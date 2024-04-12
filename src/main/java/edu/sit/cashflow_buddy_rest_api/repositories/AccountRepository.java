package edu.sit.cashflow_buddy_rest_api.repositories;

import edu.sit.cashflow_buddy_rest_api.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}