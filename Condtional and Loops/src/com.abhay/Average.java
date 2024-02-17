package com.abhay;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = in.nextInt();
        int sum =0;

        for (int i =1; i<=n; i++){
            System.out.println("Enter num" + i );
            int num = in.nextInt();
            sum+=num;

        }
        int Average = sum/n;
        System.out.println("The average is " + Average);

    }
}
