package com.tracker.budgetee.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.budgetee.model.Transaction;
import com.tracker.budgetee.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    // fetch all transactions
    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    // save a new transaction with basic validation
    public Transaction saveTransaction(Transaction transaction) {
        // validate amount (not null or negative)
        if (transaction.getAmount() == null || transaction.getAmount() <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }

        // set current date if not provided
        if (transaction.getDate() == null) {
            transaction.setDate(LocalDate.now());
        }

        return repository.save(transaction);
    }

    // fetch a transaction by ID
    public Transaction getTransactionById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Transaction not found."));
    }

    // delete a transaction
    public void deleteTransaction(Long id) {
        repository.deleteById(id);
    }

    // get transactions filtered by type or date
    public List<Transaction> getTransactionsByType(String type) {
        return repository.findByTypeIgnoreCase(type);
    }
}
