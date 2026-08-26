package main.java.loops.assigment_problems;
import java.util.Scanner;
public class GradeClassifier {
    public void classifyWithAttendance(int marks, int attendance) {
        if (attendance >= 75 && marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Detained");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        System.out.println("Enter attendance:");
        int attendance = sc.nextInt();
        GradeClassifier g1 = new GradeClassifier();
        g1.classifyWithAttendance(marks, attendance);
        sc.close();
    }
}