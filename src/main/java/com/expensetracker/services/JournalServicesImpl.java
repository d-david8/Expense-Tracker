package com.expensetracker.services;

import com.expensetracker.domain.Expense;
import com.expensetracker.domain.Journal;

import java.time.LocalDate;

public class JournalServicesImpl implements JournalServices {
    @Override
    public Journal createExpensesList() {
        return new Journal();
    }

    @Override
    public void addExpense(Journal journal, Expense expense) {
        journal.addExpense(LocalDate.now(), expense);
    }

    @Override
    public void exportExpenses() {

    }
}
