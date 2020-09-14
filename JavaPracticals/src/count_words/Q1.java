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
import count_words.*;

public class Q1 {
    public static void main(String args[]){
        count c = new count();
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter ths string for which you want to count the words: ");
        String str = sn.nextLine();
        System.out.println("There are " + (c.count_spaces(str)+1) + " words in the string.");
    }
}
