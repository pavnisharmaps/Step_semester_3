package main.java.abstraction.assigment_problems;

import java.util.Scanner;

abstract class Student {
    abstract double getTuition();

    boolean usesBus() {
        return false;
    }

    double getTotalFee() {
        return getTuition() + (usesBus() ? 12000 : 0);
    }
}

class DayScholar extends Student {
    double getTuition() {
        return 40000;
    }

    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {
    double getTuition() {
        return 100000;
    }
}

class Scholar extends Student {
    double getTuition() {
        return 20000;
    }

    boolean usesBus() {
        return true;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Student s;

            if (type.equals("DAY_SCHOLAR"))
                s = new DayScholar();
            else if (type.equals("HOSTELLER"))
                s = new Hosteller();
            else
                s = new Scholar();

            double fee = s.getTotalFee();
            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}