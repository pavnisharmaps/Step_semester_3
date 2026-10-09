package main.java.abstraction.assigment_problems;

import java.util.Scanner;

abstract class Ticket {
    private static final double FEE = 20;
    abstract double getPrice();

    double getTotal(int count) {
        return count * (getPrice() + FEE);
    }
}

class Regular extends Ticket {
    double getPrice() {
        return 150;
    }
}

class Premium extends Ticket {
    double getPrice() {
        return 250;
    }
}

class Recliner extends Ticket {
    double getPrice() {
        return 400;
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int count = sc.nextInt();
            Ticket t;

            if (type.equals("REGULAR"))
                t = new Regular();
            else if (type.equals("PREMIUM"))
                t = new Premium();
            else
                t = new Recliner();

            double amount = t.getTotal(count);
            System.out.printf("%s: %.2f%n", type, amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}