/**
 * Methodoverloading
 * 
 * Assignment 
 * 
 * Create a class called Geometry which contains three overloaded versions of the method area(), to calculate area of rectangle, circle and square respectively.
 * Now design the driver class called UseGeometry and ask the user to select a figure. 
 * 
 * Then based on the selected figure accept the dimensions and calculate and print the area.
 * 
 */

 import java.util.Scanner;
 import java.lang.Math;

// class Geometry{
//     public double area(double length,double width){
//          return length*width;
//     }
//     public double area(double radius){
//         return Math.PI * radius * radius;
//     }  
    
// } 
class Geometry {
    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double side, int unusedParameter) {
        return side*side;
    }
}

public class Methodoverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select figure :");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the length of rectangle");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth of rectangle");
                double breadth = sc.nextDouble();
                Geometry rectGeometry = new Geometry();
                double rectArea = rectGeometry.area(length, breadth);
                System.out.println("The Area of rectangle is :"+rectArea);
                break;

            case 2:
                System.out.println("Enter the radius of circle");
                double radius = sc.nextDouble();
                Geometry circGeometry = new Geometry();
                double circArea = circGeometry.area(radius);
                System.out.println("The Area of circle is :"+circArea);
                break;
            case 3:
                System.out.println("Enter the side of square");
                double side1 = sc.nextDouble();
                Geometry sqGeometry = new Geometry();
                double sqArea = sqGeometry.area(side1,0);
                System.out.println("The Area of square is :"+sqArea);
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    }