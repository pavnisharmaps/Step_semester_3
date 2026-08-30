package main.java.string.class_problems;

import java.util.Scanner;

public class BmiCalculator {

    String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf(
                    "%d | %.2f | %.2f | %.2f | %s%n",
                    i + 1,
                    heights[i],
                    weights[i],
                    bmi,
                    status
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of people:");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter height for person " + (i + 1) + ":");
            heights[i] = sc.nextDouble();

            System.out.println("Enter weight for person " + (i + 1) + ":");
            weights[i] = sc.nextDouble();
        }

        BmiCalculator calculator = new BmiCalculator();

        calculator.printWellnessReport(heights, weights);

        sc.close();
    }
}