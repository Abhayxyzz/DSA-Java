package com.abhay;
import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // Area of Circle
        /* System.out.println("Enter the radius");
        float radius = in.nextFloat();
        double pi = 3.14159265359;

        float Area_of_Circle = (float)pi*radius*radius;
        System.out.println("Area of Circle is " + Area_of_Circle); */

        //Volume of Pyramid
        System.out.println("Enter length");
        float length = in.nextFloat();
        System.out.println("Ente Width");
        float width = in.nextFloat();
        System.out.println("Enter height");
        float height = in.nextFloat();

        float Vol_of_pyramid = length*width*height/3;
        System.out.println("Volume of pyramid is " + Vol_of_pyramid);

    }

}
