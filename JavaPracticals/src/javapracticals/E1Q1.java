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

class cows{
    String name, dob, recent_calving;
    int id;
    double milk_produced;
    static double total = 0;
    
    Scanner sn = new Scanner(System.in);
    
    cows(){
        System.out.print("Enter the name of the cow: ");
        name = sn.next();
        System.out.print("Enter the ID number of "+name+": ");
        id = sn.nextInt();
        System.out.print("Enter the Date of birth of "+name+": ");
        dob = sn.next();
        System.out.print("Enter the Date of "+name+"'s most recent calving: ");
        recent_calving = sn.next();    
        milk_production();
    }
    void milk_production(){
        System.out.print("Enter the milk production of "+name+": ");
        milk_produced = sn.nextDouble();
        total += milk_produced;
    }
    void get_total(int n){
        System.out.println("\nThe total milk output of the herd is: "+ total + " litres, and the average milk production is: " + (total/n) + "litres");
    }
  	
  	void set_zero(){
      	milk_produced = 0;
      	total = 0;
    }
}


class E1Q1{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of cows in your herd: ");
        int num = sn.nextInt();
        cows cow[] = new cows[num];
        for(int i = 0; i < num; i++){
            System.out.println("\nEnter details of Cow #" + (i+1));
            cow[i] = new cows();
        }
        cow[num-1].get_total(num);
      	for(int i = 0; i < num; i++){
            cow[i].set_zero();
        }
      	System.out.println("\nAfter resetting milk values.");
        cow[num-1].get_total(num);
    }  	
}
