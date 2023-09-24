package com.expensetracker.services;

public class MenuServiceImpl implements MenuService {

    @Override
    public void displayMenu() {
        System.out.print(new StringBuilder()
                .append("--------Expense Tracker Menu--------\n")
                .append("1. Add expense\n")
                .append("2. View expense\n")
                .append("3. Delete expense\n")
                .append("4. View total expenses for a period\n")
                .append("5. Export expenses\n")
                .append("0. Exit\n")
                .append("Enter the option: ")
        );
    }
}
