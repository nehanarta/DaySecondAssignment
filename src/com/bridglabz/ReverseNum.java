package com.bridglabz;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 123;
        int rem=0 ;
        int reverse = 0;
        for (; n != 0; n = n / 10) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
        }
            System.out.println(reverse);
        }

        }




