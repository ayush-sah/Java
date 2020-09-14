/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp2;

/**
 *
 * @author Ayush
 */
import random.*;
import month.*;

public class Q2 {
    public static void main(String[] args) {
        month m = new month();
        random r = new random();
        String str[] = m.months();
        double ran[] = r.random_numbers();
        double avg = 0;
        for(int i = 0; i < 10; i++){
            System.out.println(str[i] + " : " + ran[i]);
            avg += ran[i];
        }
        System.out.println("\nThe average of 10 decimal values is " + avg/10.0 + ".");
    }
}
