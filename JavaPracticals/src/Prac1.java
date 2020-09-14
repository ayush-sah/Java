/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
import java.util.*;

public class Prac1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ayush");
        names.add("Rajesh");
        names.add("Kripal");
        names.add("Vachya");
        names.add("Bhoomi");
        Scanner sn = new Scanner(System.in);
        int op;
        do{
            System.out.print("\n1. Add name to the list.\n2. Search name in the list.\n3. Show List.\n4. Exit\nEnter action you want to perform: ");
            op = sn.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("\nEnter the name you want to add: ");
                    String n = sn.next();
                    System.out.print("Enter the index where you want to add the name: ");
                    int i = sn.nextInt();
                    names.add(i,n);
                    break;
                case 2:
                    System.out.print("\nEnter the name you to search: ");
                    String s = sn.next();
                    if(names.indexOf(s)==-1)
                        System.out.println("The element you want to search is not present in the list.");
                    else
                        System.out.println("The element " + s +" is present at index no.  " + names.indexOf(s) + " in the list.");
                    break;
                case 3:
                    System.out.println("\nIndex No. - Name\n---------------------");
                    for(String str:names)
                        System.out.println("    " + names.indexOf(str) + "\t  - " + str);
                    break;
                case 4:
                    break;
            }
        }while(op!=4);
    }
}
