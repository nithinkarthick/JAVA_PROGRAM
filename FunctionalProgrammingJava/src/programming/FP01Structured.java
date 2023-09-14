package programming;

import java.util.List;

public class FP01Structured {

	
	public static void main(String[] args) {
		
		
		List<Integer> number  = List.of(12,41,44,86,23,14,11,22,1,55,11);
		
		printAllNum(number);
		System.out.println();
		printEven(number);
		
	}
	
	
	public static void printAllNum(List<Integer> numbers) {
		 
		for(int num :numbers)
		{
			System.out.print(num+" ");
		}
	}
	
	public static void printEven(List<Integer> numbers) {
		 
		for(int num :numbers)
		{
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}
	}
	
}
