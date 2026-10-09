package main.java.abstraction.assigment_problems;

import java.util.Scanner;

abstract class Cab {
    protected double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRate();

    double calculateFare() {
        return Math.max(100, km * getRate());
    }
}

interface NightService {
    double applyNightFare(double fare);
}

class MiniCab extends Cab {
    MiniCab(double km) {
        super(km);
    }

    double getRate() {
        return 10;
    }
}

class SedanCab extends Cab implements NightService {
    SedanCab(double km) {
        super(km);
    }

    double getRate() {
        return 14;
    }

    public double applyNightFare(double fare) {
        return fare * 1.20;
    }
}

class SUVCab extends Cab implements NightService {
    SUVCab(double km) {
        super(km);
    }

    double getRate() {
        return 18;
    }

    public double applyNightFare(double fare) {
        return fare * 1.20;
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab c;
            if (type.equals("MINI"))
                c = new MiniCab(km);
            else if (type.equals("SEDAN"))
                c = new SedanCab(km);
            else
                c = new SUVCab(km);

            if (time.equals("NIGHT")) {
                if (!(c instanceof NightService)) {
                    System.out.println("MINI: night service not available");
                    continue;
                }

                NightService night = (NightService) c;
                double fare = night.applyNightFare(c.calculateFare());
                System.out.printf("%s: %.2f%n", type, fare);
                total += fare;
            } else {
                double fare = c.calculateFare();
                System.out.printf("%s: %.2f%n", type, fare);
                total += fare;
            }
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}