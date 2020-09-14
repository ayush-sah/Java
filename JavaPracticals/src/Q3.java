/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
import java.util.Scanner;
import numutil.RevNum;
public class Q3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n = sn.nextInt();
        System.out.println("After reversing the number: " + RevNum.rev_digit(n));
    }
}
