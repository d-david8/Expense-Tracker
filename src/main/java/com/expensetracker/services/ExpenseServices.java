package com.expensetracker.services;

import com.expensetracker.domain.Category;
import com.expensetracker.domain.Expense;

public interface ExpenseServices {
    public Expense createExpense(Category category, double amount, String description);
    public double getAmount(Expense expense);

}
