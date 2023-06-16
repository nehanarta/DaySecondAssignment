package com.bridglabz;
//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
     //   Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
     //   Root 1 of x = (-b + sqrt(delta))/(2*a)
     //   Root 2 of x = (-b - sqrt(delta))/(2*a)
public class Quadratic {
    public static void main(String[] args){
        double a=2.4;
        double b=1.2;
        double c=1.8;
        double delta=b*b-4*a*c;
        double sqrt=Math.sqrt(delta);
        System.out.println("Delta==>"+delta);

        if(delta>0) {
           double  x1 = (-b + sqrt / (2 * a));
            double x2 = (-b + sqrt / (2 * a));
            System.out.println("roots==>"+x1+"and"+x2);
        }else if(delta==0){
            System.out.println("Root is :: "+(-b + sqrt/(2*a)));
        }

    }
}
