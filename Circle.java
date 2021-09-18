package com.circle;

import java.util.Scanner;

public class Circle {

        Scanner scan = new Scanner(System.in);
        final double pi = 3.14;
        public void user() {
            System.out.println("-----------*************--------------");
            System.out.println("Say Radius,I will give your \"Circle\"");
            System.out.println("-----------*************--------------");
            System.out.println();
            System.out.print("Radius of your Circle: ");
            double radius = scan.nextDouble();
            double area = pi*(radius*radius);    //Area of Circle formula
            System.out.println();
            System.out.println("Area of Circle: "+area+" cm2");
            double diameter = radius*2;//Diameter of  circle  formula
            System.out.println();
            System.out.println("Diameter of Circle: "+(int)diameter+" cm");
            System.out.println();
            double circumference = 2*pi*radius; //Circumference of Circle formula
            System.out.println("Circumference of Circle: "+(int)circumference+" cm");
        }

        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.user();
        }
    }

