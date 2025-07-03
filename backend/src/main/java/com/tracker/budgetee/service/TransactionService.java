package com.tracker.budgetee.service;

import com.tracker.budgetee.model.Transaction;
import com.tracker.budgetee.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Transaction saveTransaction(Transaction transaction) {
        // add validation or business rules here
        return repository.save(transaction);
    }

    // add business logic methods here
}
