package com.abhay;
import java.util.Scanner;
public class Largestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int num;

        do {
            System.out.println("Enter an Integer (Press 0 to stop): ");
            num = in.nextInt();

            if (num>largest){
                largest=num;

            }
        }while (num!=0);
        if ( largest != Integer.MIN_VALUE) {
            System.out.println("The largest no is " + largest);
        } else{
            System.out.println("No number is added");
    }
        in.close();
}
}


