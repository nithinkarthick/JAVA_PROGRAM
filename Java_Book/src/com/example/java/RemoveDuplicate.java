package com.example.java;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		
	int	N = 5;
	int[] Array = {1, 2, 2, 4, 5};
	
	int num = remove_duplicate(Array, N);
	System.out.println(num);
	}
	
	
	
	public static int remove_duplicate(int A[],int N){

		int i =0 ;
        
        for(int j=0; j<N ; j++){
            if(A[i]!=A[j]){
                
                i++;
                A[i]=A[j];
            }
        }
        return i+1;
    }
	
	
}
