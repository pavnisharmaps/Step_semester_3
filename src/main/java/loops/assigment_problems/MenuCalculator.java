package main.java.loops.assigment_problems;
import java.util.Scanner;
public class MenuCalculator {
    void calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        MenuCalculator mc = new MenuCalculator();
        mc.calculate(a, b, operator);
        sc.close();
    }
}
