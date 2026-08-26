package main.java.loops.assigment_problems;
import java.util.Scanner;
public class PrimeNumber {
    void checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 1:");
        int number = sc.nextInt();
        PrimeNumber p1 = new PrimeNumber();
        p1.checkPrime(number);
        sc.close();
    }
}