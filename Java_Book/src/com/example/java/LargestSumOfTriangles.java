package com.example.java;

public class LargestSumOfTriangles {

	
	public static void main(String[] args) {
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int result = findLargestSum(matrix);
		
		System.out.println(result);
		
		}
	
	public static int findLargestSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int sum1 = 0; // Sum of upper triangle
        int sum2 = 0; // Sum of lower triangle

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i <= j) {
                    // Upper triangle (including the diagonal)
                    sum1 += matrix[i][j];
                } else {
                    // Lower triangle (excluding the diagonal)
                    sum2 += matrix[i][j];
                }
            }
        }

        return Math.max(sum1, sum2);
    }
	
	
	}
