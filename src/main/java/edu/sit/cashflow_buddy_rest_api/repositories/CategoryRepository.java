package edu.sit.cashflow_buddy_rest_api.repositories;

import edu.sit.cashflow_buddy_rest_api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}