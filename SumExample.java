package com.Bridgelabz;

public class SumExample {


   static void sum(){
        int x= 10;
        int y= 20;
        int sum = x+y;
        System.out.println("Sum is = "+sum);
    }
        //Arguments or Parameters
    static int multiply(int x,int y){
       int multiplication = x*y;
       return multiplication;

    }
    public static void main(String[] args) {
        sum();
        int result = multiply(3,7);
        System.out.println("Result => "+result);

        int Result2 = multiply(6,8);
        System.out.println("Result => "+result);

   }
}

