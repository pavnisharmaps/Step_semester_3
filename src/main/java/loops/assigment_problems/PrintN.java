package main.java.loops.assigment_problems;
import java.util.Scanner;
public class PrintN {
    public void printNumbers(int n) {
         System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
       
        int n = sc.nextInt();
        PrintN p1 = new PrintN();
        p1.printNumbers(n);
        sc.close();
    }
}