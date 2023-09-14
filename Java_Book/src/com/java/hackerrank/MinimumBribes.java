package com.java.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MinimumBribes {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		minimumBribes(arr);
		
	}

	public static void minimumBribes(List<Integer> q) {
	    int bribes = 0;

	    for (int i = q.size() - 1; i >= 0; i--) {
	        int originalPosition = q.get(i) - 1; // Convert to 0-based index
	        int currentPosition = i;

	        if (originalPosition - currentPosition > 2) {
	            System.out.println("Too chaotic");
	            return;
	        }

	        // Count bribes by checking positions from originalPosition to currentPosition - 1
	        for (int j = Math.max(0, originalPosition - 1); j < currentPosition; j++) {
	            if (q.get(j) > q.get(i)) {
	                bribes++;
	            }
	        }
	    }

	    System.out.println(bribes);
	}

	
}
