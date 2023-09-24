package com.expensetracker.services;

import com.expensetracker.domain.Category;
import com.expensetracker.domain.Expense;
import com.expensetracker.domain.Journal;

public interface JournalServices {

    Journal createExpensesList();

    public void addExpense(Journal journal, Expense expense);

    void exportExpenses();
}
