package com.expensetracker.services;

import com.expensetracker.domain.Category;
import com.expensetracker.domain.Expense;

import java.time.LocalDate;

public class ExpenseServicesImpl implements ExpenseServices{
    @Override
    public Expense createExpense(Category category, double amount, String description) {
        return new Expense(category,amount,description);
    }

    @Override
    public double getAmount(Expense expense) {
        return expense.getAmount();
    }
}
