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
public class E1Q3 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter the name of Employee: ");
        String Name = sn.next();
        System.out.print("Enter the age of Employee " + Name +": ");
        int Age = sn.nextInt();
        System.out.print("Enter the Phone number of Employee " + Name +": ");
        long Phone_Number = sn.nextLong();
        System.out.print("Enter the Address of Employee " + Name + ": ");
        sn.nextLine();
        String Address = sn.nextLine();
        System.out.print("Enter the Salary of Employee " + Name +": ");
        int Salary = sn.nextInt();
        System.out.print("Enter the Specialization of Employee " + Name + ": ");
        String specialization = sn.next();
        System.out.print("Enter the Department of Employee " + Name + ": ");
        String department = sn.next();
        
        Member M1 = new Employee(Name, Age, Phone_Number, Address, Salary, specialization, department);
        
        System.out.print("\nEnter the name of Manager: ");
        Name = sn.next();
        System.out.print("Enter the age of Manager " + Name +": ");
        Age = sn.nextInt();
        System.out.print("Enter the Phone number of Manager " + Name +": ");
        Phone_Number = sn.nextLong();
        System.out.print("Enter the Address of Manager " + Name + ": ");
        sn.nextLine();
        Address = sn.nextLine();
        System.out.print("Enter the Salary of Manager " + Name +": ");
        Salary = sn.nextInt();
        System.out.print("Enter the Specialization of Manager " + Name + ": ");
        specialization = sn.next();
        System.out.print("Enter the Department of Manager " + Name + ": ");
        department = sn.next();
        
        Member M2 = new Manager(Name, Age, Phone_Number, Address, Salary, specialization, department);
        
        System.out.println("\nThe name of Employee is " + M1.Name + ".");
        System.out.println("He/She is " + M1.Age + " years old.");
        System.out.println("He/She lives at " + M1.Address + ".");
        System.out.println("We can contact him on  " + M1.Phone_Number + ".");
        M1.printSalary();
        M1.display();
        
        System.out.println("\nThe name of Manager is " + M2.Name);
        System.out.println("The age of Manager is " + M2.Age);
        System.out.println("The Address of Manager is " + M2.Address);
        System.out.println("The Phone Number of Manager is " + M2.Phone_Number);
        M2.printSalary();
        M2.display();
        
    }
}
class Member{
    String Name, Address;
    int Age, Salary;
    long Phone_Number;
    
    void printSalary(){
        System.out.println("The salary of " + Name + " is ₹ " + Salary);
    }
    void display(){}
}
class Employee extends Member{
    public String specialization, department;
    
    Employee(String Name, int Age, long Phone_Number, String Address, int Salary, String specialization, String department){
        super.Name = Name;
        super.Age = Age;
        super.Phone_Number = Phone_Number;
        super.Address = Address;
        super.Salary = Salary;
        this.specialization = specialization;
        this.department = department;
    }
    void printSalary(){
        if(super.Salary < 20000)
            super.Salary = 20000;
        
        super.printSalary();
    }
    void display(){
        System.out.println(super.Name + " specializes in " + specialization + ".");
        System.out.println("He/She is in the " + department + " department.");
    }
}

class Manager extends Member{
    String specialization, department;
    
    Manager(String Name, int Age, long Phone_Number, String Address, int Salary, String specialization, String department){
        super.Name = Name;
        super.Age = Age;
        super.Phone_Number = Phone_Number;
        super.Address = Address;
        super.Salary = Salary;
        this.specialization = specialization;
        this.department = department;
    }
    void printSalary(){
        if(super.Salary < 40000)
            super.Salary = 40000;
        
        super.printSalary();
    }
    void display(){
        System.out.println(super.Name + " specializes in " + specialization + ".");
        System.out.println("He/She is in the " + department + " department.");
    }
}