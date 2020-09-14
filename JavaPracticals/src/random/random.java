/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author Ayush
 */
import java.util.Random;

public class random {
    public double[] random_numbers(){
        double arr[] = new double[10];
        for(int i = 0; i < 10; i++)
            arr[i] = 0D + new Random().nextDouble() * (9D - 0D);
        return arr;
    }
}
