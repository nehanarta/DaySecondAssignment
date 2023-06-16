package com.bridglabz;

public class OperatorExamp {
    static void max(int result1,int result2,int result3,int result4) {
        if (result1 > result2 && result1 > result3 && result1 > result4) {
            System.out.println("result1 is max number");
        } else if (result2 > result1 && result2 > result3 && result2 > result4) {
            System.out.println("result2 is max number");
        } else if (result3 > result1 && result3 > result2 && result3 > result4) {
            System.out.println("result3 is max number");
        } else if (result4 > result1 && result4 > result2 && result4 > result3) {
            System.out.println("result4 is max number");
        }
    }


    public static void main(String[] args){

        int a=4;
        int b=8;
        int c=7;
         int Result1= a+b*c;
        System.out.println(Result1);
        int Result2=c+a/b;
        System.out.println(Result2);
        int Result3= a%b+c;
        System.out.println(Result3);
        int Result4= a*b+c;
        System.out.println(Result4);


    }
}
