package com.abhay;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* System.out.println("Enter a natural no. ");
        int Naturalno = in.nextInt();


        for (int i = 1; i <= 100; i++) {
            if ((Naturalno % i) == 0) {
                System.out.println("Factor is " + i);
            }


        }*/
        int ans = 0;
        while (true) {
            System.out.println("Enter a no. ");
            int num = in.nextInt();
            if (num ==0){
                break;
            }
            ans+=num;


        }
        System.out.println("Ans is " + ans);
    }
}