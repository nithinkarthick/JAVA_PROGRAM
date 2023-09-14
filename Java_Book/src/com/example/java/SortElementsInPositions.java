package com.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortElementsInPositions {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
sc.close();
		String[] spt = s.split(",");
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();

		for(int i=0;i<spt.length;i++) {
			int num = Integer.parseInt(spt[i]);
			if(i%2==0){
				even.add(num);
			}else {
				odd.add(num);
			}
		}
		
		Collections.sort(odd, Collections.reverseOrder());
		Collections.sort(even);
		
		List<Integer> sorted = new ArrayList<>();
		
		for(int i=0;i<spt.length;i++) {
			if(i%2==0){
				sorted.add(even.remove(0));
			}else {
				sorted.add(odd.remove(0));
			}
		}
		
		
		for(int i=0 ; i<sorted.size();i++) {
			System.out.print(sorted.get(i));
			if(i<sorted.size()) {
				System.out.print(",");
			}
		}
		
	}
}
