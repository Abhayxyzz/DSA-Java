package com.abhay;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int count = 2;

        while( count <=n){

                int temp = num2;
                num2 = num2 + num1;
                num1 = temp;
                count++;

            }
        System.out.println(num2);
            }

        }



