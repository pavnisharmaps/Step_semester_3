package main.java.loops.assigment_problems;
import java.util.Scanner;
public class NumberPyramid {
    void printNumberPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        NumberPyramid np = new NumberPyramid();
     
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the n:");
            int n = sc.nextInt();
            np.printNumberPyramid(n);
            sc.close();
    }
}
