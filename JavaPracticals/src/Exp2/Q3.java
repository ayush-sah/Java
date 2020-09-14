/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp2;
import java.util.Scanner;
import FindPower.*;
public class Q3 {
    
    public static void main(String[] args) {
        Power p = new Power();
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int b = sn.nextInt();
        System.out.print("Enter the exponential value: ");
        int e = sn.nextInt();
        System.out.println("\n" + b + " raise to " + e + " is " + p.exponent(b, e));
    }
}
