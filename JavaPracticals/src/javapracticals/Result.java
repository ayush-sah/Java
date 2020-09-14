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

abstract class Stu {
  	int roll, subjectmark;
  	String name;
 	Scanner sn = new Scanner(System.in);
  	abstract void Showstudentdata();
  	void Getstudentdata(){
      	System.out.print("Enter the name of the student: ");
      	name = sn.next();
      	System.out.print("Enter the roll no. of the student: ");
      	roll = sn.nextInt();
      	System.out.print("Enter Subject mark: ");
      	subjectmark = sn.nextInt();
    }
}

interface ISport{
  	public final int sportgracemarks = 5;
  	public void Showsportmark();
}

interface IExServiceMan{
  	public final int ExServiceMangracemarks = 10;
  	public void ShowExServiceManmark();
}

class Result extends Stu implements ISport, IExServiceMan{
 	Scanner sn = new Scanner(System.in);
  	int Totalmarks;
    public void Showstudentdata(){
      	System.out.println("The student name is " + name + " and his/her roll no. is " + roll + " and his/her subject mark is " + subjectmark);
    }
    public void Showsportmark(){
		System.out.println("Grace Marks for Sport Category students is " + sportgracemarks);
    }
  	public void ShowExServiceManmark(){
      	System.out.println("Grace Marks for Ex-Service Man student is " + ExServiceMangracemarks);
    }
  	public void Showresult(){
      	Totalmarks = subjectmark + sportgracemarks + ExServiceMangracemarks;
      	System.out.println("Total Marks scored by student after adding grace marks is " + Totalmarks);
    }
    
    public static void main(String args[]){
      	Result obj = new Result();
      
      	obj.Getstudentdata();
      	
      	System.out.println("\nAccording to the data you entered......");
      	obj.Showstudentdata();
      	
      	System.out.println("\nAdditional marks obtained by the students are as follows: ");
      	obj.Showsportmark();
      	obj.ShowExServiceManmark();
      
      	System.out.println("After adding Grace marks.....");
      	obj.Showresult();
    }
}
