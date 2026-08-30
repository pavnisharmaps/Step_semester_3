package main.java.string.assigment_problems;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    void classifyWordLengths(String review) {

        String[] words = review.trim().split("\\s+");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length <= 8) {
                mediumCount++;
            } else {
                longCount++;
            }
        }

        System.out.println(
                "Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie review:");
        String review = sc.nextLine();

        MovieReviewWordLengthProfiler obj =
                new MovieReviewWordLengthProfiler();

        obj.classifyWordLengths(review);

        sc.close();
    }
}