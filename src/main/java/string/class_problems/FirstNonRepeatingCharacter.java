package main.java.string.class_problems;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    char findFirstNonRepeatingChar(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {

            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        FirstNonRepeatingCharacter obj =
                new FirstNonRepeatingCharacter();

        char result = obj.findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println(
                    "First Non-Repeating Character: '" + result + "'");
        }

        sc.close();
    }
}