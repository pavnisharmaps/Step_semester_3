package main.java.string.assigment_problems;

import java.util.Scanner;

public class WordReversalEncoder {

    String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord =
                    new StringBuilder(words[i]);

            reversedWord.reverse();

            result.append(reversedWord);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        WordReversalEncoder encoder = new WordReversalEncoder();

        String result = encoder.reverseEachWord(sentence);

        System.out.println(result);

        sc.close();
    }
}
