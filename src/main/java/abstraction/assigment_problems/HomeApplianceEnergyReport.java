package main.java.abstraction.assigment_problems;

import java.util.Scanner;

abstract class Appliance {
    protected double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double getPower();

    boolean supportsSaver() {
        return false;
    }

    double getUnits(boolean saver) {
        double units = getPower() * hours / 1000;
        return saver ? units * 0.75 : units;
    }

    double getCost(boolean saver) {
        return getUnits(saver) * 8;
    }
}

class Fridge extends Appliance {
    Fridge(double h) {
        super(h);
    }

    double getPower() {
        return 150;
    }
}

class AC extends Appliance {
    AC(double h) {
        super(h);
    }

    double getPower() {
        return 1500;
    }

    boolean supportsSaver() {
        return true;
    }
}

class TV extends Appliance {
    TV(double h) {
        super(h);
    }

    double getPower() {
        return 100;
    }
}

class Washer extends Appliance {
    Washer(double h) {
        super(h);
    }

    double getPower() {
        return 500;
    }

    boolean supportsSaver() {
        return true;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();
            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            Appliance a;
            if (type.equals("FRIDGE"))
                a = new Fridge(hours);
            else if (type.equals("AC"))
                a = new AC(hours);
            else if (type.equals("TV"))
                a = new TV(hours);
            else
                a = new Washer(hours);

            if (saver && !a.supportsSaver()) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double units = a.getUnits(saver);
            double cost = a.getCost(saver);

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n", type, units, cost
            );
            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}