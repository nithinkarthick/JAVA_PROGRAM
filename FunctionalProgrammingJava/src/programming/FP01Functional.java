package programming;

import java.util.List;

public class FP01Functional {


	public static void main(String[] args) {

		List<Integer> number  = List.of(12,41,44,86,23,14,11,22,1,55,11);

	//	printAllNum(number);
	//	System.out.println();
	//	printEvenNum(number);
	//	squareOfNum(number);
		cubeOddNumb(number);
	}

	
	
	public static void printAllNum(List<Integer> numbers) {

		numbers.stream().forEach(System.out::print); //:: method reference
	}
	
	public static void printEvenNum(List<Integer> numbers) {

		numbers.stream()
			.filter(a -> a%2==0 )
			.forEach(System.out::println); //:: method reference
	}
	
	public static void printOddNum(List<Integer> numbers) {

		numbers.stream()
			.filter(a -> a%2!=0 )
			.forEach(System.out::println); //:: method reference
	}
	
	
	public static void squareOfNum(List<Integer> numbers) {

		numbers.stream()
			//.filter(a -> a%2!=0 )
			.map(number -> number * number)
			.forEach(System.out::println); //:: method reference
	}
	
	public static void cubeOddNumb(List<Integer> numbers) {

		numbers.stream()
			.filter(a -> a%2!=0 )
			.map(number -> number * number * number)
			.forEach(System.out::println); //:: method reference
	}
	
	
}
