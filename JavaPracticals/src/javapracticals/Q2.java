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

class Q2 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int subjects[] = new int[4];
    for(int i = 0; i < 3; i++){
      	System.out.print("Enter marks scored by A in Subject " + (i+1) + ": ");
      	subjects[i] = sn.nextInt();
    }
    A obA = new A(subjects[0],subjects[1],subjects[2]);
    System.out.println("Percentage scored by A is "+obA.getPercentage()+ "%\n");
    
    for(int i = 0; i < 4; i++){
      	System.out.print("Enter marks scored by B in Subject " + (i+1) + ": ");
      	subjects[i] = sn.nextInt();
    }
    B obB = new B(subjects[0],subjects[1],subjects[2],subjects[3]);
    System.out.println("Percentage scored by B is "+obB.getPercentage()+ "%");   
  	}
}

abstract class Marks{
  	abstract int getPercentage();
}

class A extends Marks{
  	int sub1, sub2, sub3;
  	A(int s1, int s2, int s3){
      	sub1 = s1;
      	sub2 = s2;
      	sub3 = s3;
    }
  	int getPercentage(){
      	return (sub1+sub2+sub3)/3;
    }
}

class B extends Marks{
  	int sub1, sub2, sub3, sub4;
  	B(int s1, int s2, int s3, int s4){
      	sub1 = s1;
      	sub2 = s2;
      	sub3 = s3;
      	sub4 = s4;
    }
  	int getPercentage(){
      	return (sub1+sub2+sub3+sub4)/4;
    }
}
