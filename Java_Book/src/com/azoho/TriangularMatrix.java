package com.azoho;

import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Read the matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Check if the matrix is upper triangular
        boolean isUpperTriangular = true;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
        }
        
        // Check if the matrix is lower triangular
        boolean isLowerTriangular = true;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
        }
        
        // Determine and print the type of the matrix
        if (isUpperTriangular) {
            System.out.println("Upper Triangular Matrix");
        } else if (isLowerTriangular) {
            System.out.println("Lower Triangular Matrix");
        } else {
            System.out.println("Neither Upper nor Lower Triangular Matrix");
        }
        
        scanner.close();
    }
    
    
//    Program to check whether the given matrix is an upper triangular or lower triangular.
//    The constraint was each element should be visited only once. 
//
//     Input:
//     4 6 1 4
//     0 3 5 9
//     0 0 6 2
//     0 0 0 8
//     
//     Output: Upper Triangular Matrix 
//     
//     Input:
//     1 0 
//     1 1
//     Output: Lower Triangular Matrix
}
