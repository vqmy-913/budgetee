package com.tracker.budgetee.repository;

import com.tracker.budgetee.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
