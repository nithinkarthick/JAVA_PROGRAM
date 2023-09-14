package programming;

import java.util.ArrayList;
import java.util.List;

public class FP02Functional {


	public static void main(String[] args) {

		List<String> course  = List.of("spring", "spring boot", "API", "PCF", "AWS", "microservice");


		course.stream().forEach(System.out::println); 
		
		course.stream()
			.filter(courses -> courses.contains("spring"))
			.forEach(System.out::println);
	
		course.stream()
		.filter(courses -> courses.length()>3)
		.map(courses -> courses+" ")
		.forEach(System.out::print);
		
		course.stream()
		.map(courses -> courses+" "+courses.length())
		.forEach(System.out::println);

	}

	
	
	
	
}
