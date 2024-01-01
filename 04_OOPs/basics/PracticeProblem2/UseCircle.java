/*
 * 
    Write an object oriented program to create an entity class called Circle, with an integer data member radius. 
    Provide following methods in your class

1. setRadius(), which should accept an integer as argument and should initialize radius with it.
2. calculateArea(), which should calculate and display area of the circle.
3. calculateCircumference(), which should calculate and display circumference of the circle.

Now design a driver class called UseCircle, 
which should accept radius from user, create and initialize Circle object and should display its area and circumference.
 */


package PracticeProblem2;

import java.util.Scanner;
import java.lang.Math;

class Circle{
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        double area = Math.PI * (radius*radius);
        System.out.println("Area of circle is :"+area);
    }
    public void calculateCircumference(){
        double circum = 2 * Math.PI * radius;
        System.out.println("circumference of circle is :"+circum);
    }
}

public class UseCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int radius = sc.nextInt();
        Circle c1 = new Circle();
        c1.setRadius(radius);
        c1.calculateArea();
        c1.calculateCircumference();
    }
}
