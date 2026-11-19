package main.java.linked_lists.class_problems;

public class WeeklyRainfallAnalysis {

    public static void main(String[] args) {

        double[] rainfall = {12, 0, 25, 18, 0, 30, 15};

        double total = 0;
        double max = rainfall[0];

        int wettestDay = 1;
        int dryDays = 0;

        System.out.print("Rainfall (mm): ");

        for (int i = 0; i < rainfall.length; i++) {

            System.out.print(rainfall[i] + " ");

            total += rainfall[i];

            if (rainfall[i] > max) {
                max = rainfall[i];
                wettestDay = i + 1;
            }

            if (rainfall[i] == 0) {
                dryDays++;
            }
        }

        double average = total / rainfall.length;

        System.out.println();
        System.out.println("Total Rainfall: " + total + " mm");
        System.out.printf("Average Rainfall: %.2f mm%n", average);

        System.out.println("Wettest Day: Day " + wettestDay
                + " (" + max + " mm)");

        System.out.println("Total Dry Days: " + dryDays);
    }
}