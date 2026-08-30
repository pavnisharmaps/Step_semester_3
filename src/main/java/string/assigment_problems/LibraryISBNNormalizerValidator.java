package main.java.string.assigment_problems;

import java.util.Scanner;

public class LibraryISBNNormalizerValidator {

    String normalizeCode(String raw) {

        String code = raw.trim();

        if (code.length() < 3) {
            return code;
        }

        String publisherCode =
                code.substring(0, 3).toUpperCase();

        String remainingCode =
                code.substring(3);

        return publisherCode + remainingCode;
    }

    String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {

            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String publisherCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalogNumber = code.substring(7, 13);

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(publisherCode);
        result.append("] YEAR: ");
        result.append(year);
        result.append(" | CATALOG: ");
        result.append(catalogNumber);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN-style code:");
        String raw = sc.nextLine();

        LibraryISBNNormalizerValidator validator =
                new LibraryISBNNormalizerValidator();

        String normalizedCode = validator.normalizeCode(raw);

        String result = validator.validateAndFormat(normalizedCode);

        System.out.println(result);

        sc.close();
    }
}
