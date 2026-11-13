package main.java.sorting_algorithms.assigment_problems;

import java.util.Arrays;

public class HeightLineUp {

    public static void lineUp(int[] heights) {

        int pass = 1;
        boolean swapped;

        do {
            swapped = false;

            for (int j = 0; j < heights.length - 1; j++) {

                if (heights[j] > heights[j + 1]) {

                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": "
                    + Arrays.toString(heights));

            pass++;

        } while (swapped);
    }

    public static void main(String[] args) {

        int[] heights = {4, 2, 5, 1};

        lineUp(heights);
    }
}