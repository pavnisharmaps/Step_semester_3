package main.java.string.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {

    String reverseCustomerName(String customerName) {

        char[] characters = customerName.toCharArray();
        String reversedName = "";

        for (int i = characters.length - 1; i >= 0; i--) {
            reversedName += characters[i];
        }

        return reversedName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();

        ReverseCustomerName obj = new ReverseCustomerName();

        String reversedName = obj.reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);

        sc.close();
    }
}
