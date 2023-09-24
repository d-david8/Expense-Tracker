package com.expensetracker.application;

import com.expensetracker.services.MenuService;
import com.expensetracker.services.MenuServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuService menuService = new MenuServiceImpl();

        while (true) {
            menuService.displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Add");
                case 2 -> System.out.println("View");
                case 3 -> System.out.println("Edit");
                case 4 -> System.out.println("Delete");
                case 5 -> System.out.println("View Total expenses");
                case 6 -> System.out.println("Export");
                case 0 -> {
                    System.out.println("Exit");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!\nPlease enter a correct choice: ");
            }
        }

    }
}