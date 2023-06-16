package com.bridglabz;

public class RevNo1 {
    public static void main(String[] args){
        int n=123;
        int rem;
        int reverse=0;
        while(n>0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
            System.out.println(reverse);
        }

    }

