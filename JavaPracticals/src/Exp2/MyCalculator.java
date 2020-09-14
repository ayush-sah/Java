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

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = 0;
        for(int i = 2; i <= n/2; i++)
            if(n%i==0)
                sum+=i;
        return sum+1+n;
    }    
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println("I implemented: AdvancedArithmetic\n" + calc.divisor_sum(n));
        
    }
}
