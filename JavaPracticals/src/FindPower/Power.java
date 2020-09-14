/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindPower;

/**
 *
 * @author Ayush
 */
public class Power {
    public int exponent(int base, int exp){
        int ans = base;
        for(;exp > 1;exp--){
            ans *= base;
        }
        return ans;
    }
}

