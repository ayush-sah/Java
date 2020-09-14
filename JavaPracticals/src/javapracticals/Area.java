/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticals;

/**
 * Find out area of geometric shapes with the given input attributes like length, breadth, height, radius etc.
 * Design a program to print area of square, rectangle, circle and triangle. Use Method Overloading.
 * @author Ayush
 */
import java.util.Scanner;
public class Area {
    int area(int side){return side*side;}
    int area(int length, int breadth){return length* breadth;}
    double area(double radius){return 3.14*radius*radius;}
    double area(double base, double height){return (base*height)/2;}
    public static void main(String args[]){
        Area obj = new Area();
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter the side of square: ");
        int side = sn.nextInt();
        System.out.println("The area of square is " + obj.area(side));
        
        System.out.print("\nEnter the length of rectangle: ");
        int length = sn.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sn.nextInt();
        System.out.println("The area of rectangle is " + obj.area(length, breadth));

        System.out.print("\nEnter the radius of circle: ");
        double radius = sn.nextDouble();
        System.out.println("The area of circle is " + obj.area(radius));
        
        System.out.print("\nEnter the base of triangle: ");
        double base = sn.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double height = sn.nextDouble();
        System.out.println("The area of triangle is " + obj.area(base, height));
        
    }
}
