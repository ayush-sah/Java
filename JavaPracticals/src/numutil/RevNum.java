/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ayush
 */
package numutil;
public class RevNum {
    public static int rev_digit(int n){
        int rev = 0;
        while(n>0){
            rev *= 10;
            rev += n%10;
            n/=10;
        }
        return rev;
    }
}
