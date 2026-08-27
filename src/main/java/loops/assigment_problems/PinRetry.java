package main.java.loops.assigment_problems;

import java.util.Scanner;

public class PinRetry {

    void atmPinRetry(String correctPin, String[] attempts) {

        int attempt = 0;
        boolean success = false;

        while (attempt < attempts.length && attempt < 3 && !success) {

            boolean isCorrect = attempts[attempt].equals(correctPin);

            if (isCorrect) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }

            attempt++;
        }

        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter correct PIN:");
        String correctPin = sc.nextLine();

        String[] attempts = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter attempt " + (i + 1) + ":");
            attempts[i] = sc.nextLine();
        }

        PinRetry obj = new PinRetry();
        obj.atmPinRetry(correctPin, attempts);

        sc.close();
    }
}