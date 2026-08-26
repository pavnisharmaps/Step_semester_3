package main.java.loops.assigment_problems;

import java.util.Scanner;

public class LoginAttempt {

    void simulateLogin(String correctCode, String[] attempts) {

        boolean accessGranted = false;

        for (int i = 0; i < attempts.length && i < 3; i++) {

            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                accessGranted = true;
                break;
            }
        }

        if (!accessGranted) {
            System.out.println("Access denied — all attempts used");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter correct code:");
        String correctCode = sc.nextLine();

        System.out.println("Enter 3 attempts:");

        String[] attempts = {
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine()
        };

        LoginAttempt l1 = new LoginAttempt();
        l1.simulateLogin(correctCode, attempts);

        sc.close();
    }
}