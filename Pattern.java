package com.Bridgelabz;

public class Pattern {
    public static void main(String[] args) {

        // i represnts rows and j represents coloumns
        // row represents the number of rows what i want to print
        int rows = 7;
        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            // inner loop for coloumns
            for(int j=1; j<=i; j++) {
                // print stars
                System.out.print("*");

            }
        }
    }
}
