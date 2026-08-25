package main.java.loops.assigment_problems;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    void sumOfNaturalNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
        obj.sumOfNaturalNumbers(n);
        sc.close();
    }
}