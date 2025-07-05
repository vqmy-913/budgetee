package com.tracker.budgetee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.budgetee.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // JPA query to find transactions by type (e.g., "income" or "expense"), case-insensitive
    List<Transaction> findByTypeIgnoreCase(String type);

    // JPA query to find all transactions after a certain date
    List<Transaction> findByDateAfter(java.time.LocalDate date);

    // JPA query to find all transactions within a date range
    List<Transaction> findByDateBetween(java.time.LocalDate start, java.time.LocalDate end);
}
