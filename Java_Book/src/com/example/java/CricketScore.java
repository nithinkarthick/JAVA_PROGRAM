package com.example.java;

import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	
	int p1=0;
	int p2=0;
	int extra=0;
	char currentPlayer = 'A';
	
	String[] score = input.split(" ");
	
	for(String run : score) {
		if(run.equals("W") || run.equals("N")) {
			extra++;
		}else if(run.equals(".")) {
			
		}
		else {
			int runs = Integer.parseInt(run);
			if(currentPlayer=='A') {
				p1 += runs;
				currentPlayer = 'B';
			}else {
				p2 += runs;
				currentPlayer = 'A';
			}
		}
	}
	

	
	System.out.println("p1 : "+p1);
	System.out.println("ps : "+p2);
	System.out.println("extra: "+extra);
	
	
	}
}


