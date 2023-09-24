package com.expensetracker.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Journal {
    private Map<LocalDate, List<Expense>> expenseList;

    public void addExpense(LocalDate now, Expense expense) {
        if (expenseList.containsKey(now)) {
            expenseList.get(now).add(expense);
        } else
            expenseList.put(now, new ArrayList<>()).add(expense);
    }

    public List<Expense> getExpensesForDate(LocalDate date) {
        return expenseList.get(date);
    }
}
