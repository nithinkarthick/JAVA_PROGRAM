package com.example.java;

public class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		int num = 153;
		
		if(armstrong(num)) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}
	
	public static boolean armstrong(int num) {
		int org = num;
		int digits = count(num);
		int sum =0;
		
		while(num>0) {
			int digit = num%10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		
		return sum == org;
		
		
	}
	
	public static int count(int num) {
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		return count;
	}
}
