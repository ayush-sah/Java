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
public class student {
    String name;
    int marks[];
    student(String n, int m[]){
        name = n;
        marks = m;
    }
    int average(){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum+=marks[i];
        }
        return (sum/5);
    }
    void display(){
        System.out.println("\nThe name of the Student is " + name);
        System.out.println("Marks score by " + name + " are as follows: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Paper " + (i+1) + ": " + marks[i] + " marks");
        }
        System.out.println("\nThe average marks scored by " + name + " is " + average() + ".");
    }
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = sn.next();
        int marks[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter marks scored by " + name + " in Paper " + (i+1) + ": ");
            marks[i] = sn.nextInt();
        }
        student obj = new student(name, marks);
        obj.display();
    }
}
