package com.azoho;
public class ExtraElementIndex {
    public static int findExtra(int[] A, int[] B) {
        int n = B.length; // Length of array B
        int index = n - 1; // Initialize index to the last element of array B

        for (int i = 0; i < n - 1; i++) {
            if (A[i] != B[i]) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 9, 10, 12};
        int[] B = {2, 4, 6, 8, 10, 12};

        int extraIndex = findExtra(A, B);
        System.out.println("Index of the extra element: " + extraIndex);
    }
    
    
}
