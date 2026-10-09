package main.java.abstraction.class_problems;

import java.util.Scanner;

abstract class Connection {
    abstract double calculateBill(int units);
}

class Home extends Connection {
    double calculateBill(int units) {
        if (units <= 100)
            return units * 5.0;
        return 500 + (units - 100) * 7.0;
    }
}

class Shop extends Connection {
    double calculateBill(int units) {
        return units * 8.0 + 100;
    }
}

class Factory extends Connection {
    double calculateBill(int units) {
        return Math.max(units * 6.0, 1000);
    }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            Connection c;

            if (type.equals("HOME"))
                c = new Home();
            else if (type.equals("SHOP"))
                c = new Shop();
            else
                c = new Factory();

            double bill = c.calculateBill(units);
            System.out.printf("%s: %.2f%n", type, bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}