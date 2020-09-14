/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp3;

/**
 *
 * @author Ayush
 */

import java.util.*;
public class library {
    public static void main(String[] args) {
        HashMap<Integer, String> books = new HashMap<>();
        books.put(452,"Core Java");
        books.put(363,"Effective Java");
        books.put(754,"Java: A Beginner's Guide");
        books.put(423,"Java - The Complete Reference");
        books.put(599,"Head First Java");
        books.put(600,"Beginning Programming with Java For Dummies");
        books.put(725,"Java BlackBook");
        books.put(896,"Mastering Java");
        books.put(935,"Learn Java in 1 Day");
        books.put(102,"High Performance Java");
        
        Scanner sn = new Scanner(System.in);
        int i;
        do{
            System.out.print("\n1. Find a Book\n2. Add a Book\n3. Remove a Book\n4. Show all Books\n5. Exit\nEnter ");
            i = sn.nextInt();
            switch(i){
                case 1:
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    int bid = sn.nextInt();
                    System.out.print("Enter the name of the book: ");
                    String bname = sn.next();
                    books.put(bid, bname);
                    break;
                case 3:
                    break;
            }
        }while(i != 4);
    }
}
