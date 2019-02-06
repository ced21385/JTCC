package chapter08;

import java.lang.System;
import java.lang.String;

public class MultiDimensionalArray(1) {
    public static void main(String[] args) {
    
        int[][] matrix = new int[2][3];  // 2 rows by 3 columns, 8 elements
        matrix[0][0] = 1; matrix[0][1] = 2;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
                
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++)
                System.out.print(matrix[row][column] + " ");
            System.out.println();
        }  // for
        
        System.out.println();
        
        for (int[] r: matrix) {
            for (int i= 0; i < r.length; i++) System.out.print(r[i] + " ");
            System.out.println();
        }  // foreach loop
        
    }  // main()
    
}  // class RaggedArray