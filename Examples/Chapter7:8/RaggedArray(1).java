package chapter08;

import java.lang.System;
import java.lang.String;

public class RaggedArray {
    public static void main(String[] args) {
    
        int[] row1 = {1, 2};
        int[] row2 = {4, 5, 6};
                        
        int[][] matrix = {row1, row2};  // array of 2 arrays
        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++)
                System.out.print(matrix[row][column] + " ");
            System.out.println();
        }
        
        System.out.println();
        
        for (int[] r: matrix) {
            for (int i= 0; i < r.length; i++) System.out.print(r[i] + " ");
            System.out.println();
        }  // foreach loop
        
    }  // main() 

}  // class RaggedArray