/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticals;

/**
 *
 * @author Ayush
 */
import java.util.Scanner;
public class Painter {
    double length, breadth;
    Painter(double l, double b){
        this.length = l*3.28;
        this.breadth = b*3.28;
    }
    double amount(){return 10*length*breadth;}
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the length of the wall(in meter): ");
        double len = sn.nextDouble();
        System.out.print("Enter the Breadth of the wall(in meter): ");
        double bre = sn.nextDouble();
        
        Painter paint = new Painter(len, bre);
        System.out.println("The total amount to be paid for painting the wall will be ₹ " + paint.amount());
    }
}
