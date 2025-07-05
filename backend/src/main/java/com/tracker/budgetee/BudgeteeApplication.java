package com.tracker.budgetee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tracker.budgetee")
public class BudgeteeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgeteeApplication.class, args);
    }
}
