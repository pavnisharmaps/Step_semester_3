package main.java.loops.assigment_problems;
import java.util.Scanner;
public class PositiveNegativeZero  {
    public void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        PositiveNegativeZero n1 = new PositiveNegativeZero();
        int number = sc.nextInt();
        n1.classifyNumber(number);
    
    sc.close();
    }
}
