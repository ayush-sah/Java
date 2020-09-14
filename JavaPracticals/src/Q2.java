/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ayush
 */
import pack2.*;

public class Q2 {
    public static void main(String args[]){
        pack obj = new pack();
        String s[] = obj.str.split(" ");
        int c = 0;
        System.out.println("Before sorting the elements in String array are: ");
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
            if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z')
                c++;
        }
        for(int i = 0; i < s.length-1; i++){
            for(int j = i+1; j < s.length; j++){
                if(s[i].compareTo(s[j])>0){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("\nAfter sorting the elements in String array are: ");
        for(int i = 0; i < s.length; i++)
            System.out.println(s[i]);
        System.out.println("\nThere are total " + c + " words that start with capital letters.");
    }
}
