package main.java.abstraction.class_problems;

import java.util.Scanner;

abstract class LibraryItem {
    abstract double calculateFine(int days);
}

class Book extends LibraryItem {
    double calculateFine(int days) {
        return days * 2.0;
    }
}

class DVD extends LibraryItem {
    double calculateFine(int days) {
        return Math.min(days * 5.0, 50);
    }
}

class Magazine extends LibraryItem {
    double calculateFine(int days) {
        return days;
    }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();
            LibraryItem item;

            if (type.equals("BOOK"))
                item = new Book();
            else if (type.equals("DVD"))
                item = new DVD();
            else
                item = new Magazine();

            double fine = item.calculateFine(days);
            System.out.printf("%s: %.2f%n", title, fine);
            total += fine;
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}