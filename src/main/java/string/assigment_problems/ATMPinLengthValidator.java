package main.java.string.assigment_problems;

import java.util.Scanner;

public class ATMPinLengthValidator {

    void checkPinLength(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PIN:");
        String pin = sc.nextLine();

        ATMPinLengthValidator validator = new ATMPinLengthValidator();

        validator.checkPinLength(pin);

        sc.close();
    }
}