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
import java.util.Scanner;
public class Employee{
    String name;
    int age, salary;
    
    Employee(){
        name = "unknown";
        age = 0;
        salary = -1;
    }
    void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setInfo(String name, int age, int salary){
        setInfo(name, age);
        this.salary = salary;
    }
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of Employees you want to add: ");
        int n = sn.nextInt();
        Employee emp[] = new Employee[n];
        for(int i = 0; i< n; i++){
            emp[i] = new Employee();
            System.out.print("\nEnter the name of Employee " + (i+1) + ": ");
            String name = sn.next();
            System.out.print("Enter the age of Employee " + (i+1) + ": ");
            int age = sn.nextInt();
            System.out.print("Enter the salary of Employee " + (i+1) + ": ");
            int salary = sn.nextInt();
            emp[i].setInfo(name,age,salary);
        }
        Employee temp = new Employee();
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n;j++){
                if(emp[i].age>emp[j].age){
                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
        System.out.println("\nThe list of employees sorted according to their age is as follows: \n");
        for(int i = 0; i < n; i++){
            System.out.println("Employee " + (i+1) + " name is " + emp[i].name + " and age is " + emp[i].age + " years and he earns ₹ " + emp[i].salary + ".");
        }
    }
}

