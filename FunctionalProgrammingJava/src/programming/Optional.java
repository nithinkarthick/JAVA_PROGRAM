package programming;

import java.util.List;
import java.util.function.Predicate;


public class Optional {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("apple","orange", "banana");
		
		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
	
		java.util.Optional<String> optional =  fruits.stream()
			.filter(predicate).findFirst();
		
		
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}
	
	
}
