package com.example.paygenius;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Spring Data JPA will automatically create the method implementation
    // based on the method name. This will find all expenses for a given category.
    List<Expense> findByCategory(String category);
}
