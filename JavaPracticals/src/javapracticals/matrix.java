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
public class matrix {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int r1=0, r2=0, c1=0, c2=1;
        while(r1!=c2){
            if(r1!=0){
                System.out.println("Invalid Matrix size....\n");
            }
            System.out.print("Enter the number of rows in first matrix: ");
            r1 = sn.nextInt();
            System.out.print("Enter the number of columns in first matrix: ");
            c1 = sn.nextInt();
            System.out.print("Enter the number of rows in second matrix: ");
            r2 = sn.nextInt();
            System.out.print("Enter the number of columns in second matrix: ");
            c2 = sn.nextInt();
        }
        System.out.println();
        int mat1[][] = new int[r1][c1];
        int mat2[][] = new int[r2][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print("Enter tha number to store at Matrix1["+ (i+1) +"][" + (j+1) + "]: ");
                mat1[i][j] = sn.nextInt();
            }
        }
        System.out.println();
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                System.out.print("Enter tha number to store at Matrix2["+ (i+1) +"][" + (j+1) + "]: ");
                mat2[i][j] = sn.nextInt();
            }
        }
        int ans[][] = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                ans[i][j] = 0;
                for(int k = 0; k < r2; k++)
                    ans[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        System.out.println("\nThe elements in Matrix 1: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe elements in Matrix 2: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe resultant Matrix after Multiplication is: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
