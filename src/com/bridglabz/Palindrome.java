package com.bridglabz;

public class Palindrome {
    public static void main(String[] args) {
            int number = 121;
            int originalValue = number;
            int reminder = 0;
            int result = 0;

            for(int i=1; (number != 0); i++){
                reminder = number % 10;
                result = result * 10 + reminder;
                number = number / 10;
            }

            if (originalValue == result){
                System.out.println(originalValue + " is palindrome");
            }else {
                System.out.println(originalValue + " is not palindrome");
            }
        }
    }




