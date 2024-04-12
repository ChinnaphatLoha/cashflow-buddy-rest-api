package edu.sit.cashflow_buddy_rest_api.repositories;

import edu.sit.cashflow_buddy_rest_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}