package main.java.abstraction.class_problems;

import java.util.Scanner;

abstract class TravelBooking {
    private static final double FEE = 50;

    abstract double calculateFare(double distance);

    double getTotal(double distance) {
        return calculateFare(distance) + FEE;
    }
}

class Bus extends TravelBooking {
    double calculateFare(double distance) {
        return distance * 2;
    }
}

class Train extends TravelBooking {
    double calculateFare(double distance) {
        return distance * 1.5;
    }
}

class Flight extends TravelBooking {
    double calculateFare(double distance) {
        return 2500 + distance * 4;
    }
}

public class TravelBookingWithCommonFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            TravelBooking b;

            if (type.equals("BUS"))
                b = new Bus();
            else if (type.equals("TRAIN"))
                b = new Train();
            else
                b = new Flight();

            System.out.printf("%s: %.2f%n", type, b.getTotal(distance));
        }

        sc.close();
    }
}