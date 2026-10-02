package main.java.inheritance.assigment_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Question {
    protected String correctAnswer;
    protected String studentAnswer;
    protected double points;

    Question(String correctAnswer, String studentAnswer, double points) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double calculateScore();
}

class MCQQuestion extends Question {

    MCQQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {
        return studentAnswer.equalsIgnoreCase(correctAnswer)
                ? points : 0;
    }
}

class TFQuestion extends Question {

    TFQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {
        return studentAnswer.equalsIgnoreCase(correctAnswer)
                ? points : 0;
    }
}

class EssayQuestion extends Question {

    EssayQuestion(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {

        String[] keywords = correctAnswer.split(",");
        int matched = 0;

        for (String keyword : keywords) {

            keyword = keyword.trim();

            if (studentAnswer.toLowerCase()
                    .contains(keyword.toLowerCase())) {
                matched++;
            }
        }

        if (matched >= 2) {
            return points * 0.75;
        } else if (matched == 1) {
            return points * 0.50;
        }

        return 0;
    }
}

public class ExaminationQuestionGrader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        Pattern pattern = Pattern.compile(
                "^(\\S+)\\s+\"([^\"]*)\"\\s+\"([^\"]*)\"\\s+\"([^\"]*)\"\\s+(\\d+)$"
        );

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);

            if (!matcher.matches()) {
                continue;
            }

            String type = matcher.group(1);
            String correctAnswer = matcher.group(3);
            String studentAnswer = matcher.group(4);
            double points = Double.parseDouble(matcher.group(5));

            Question question;

            if (type.equals("MCQ")) {
                question = new MCQQuestion(
                        correctAnswer, studentAnswer, points
                );
            } else if (type.equals("TF")) {
                question = new TFQuestion(
                        correctAnswer, studentAnswer, points
                );
            } else {
                question = new EssayQuestion(
                        correctAnswer, studentAnswer, points
                );
            }

            double score = question.calculateScore();

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);

        sc.close();
    }
}