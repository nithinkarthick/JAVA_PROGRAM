package com.azoho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchFinder {

	 public static void main(String[] args) {
	        List<Person> people = new ArrayList<>();

	        // Read input
	        Scanner scanner = new Scanner(System.in);
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            if (line.isEmpty()) {
	                break;
	            }
	            String[] parts = line.split(", ");
	            String name = parts[0];
	            String gender = parts[1];
	            String father = parts[2];
	            String mother = parts[3];
	            people.add(new Person(name, gender, father, mother));
	        }

	        // Find matches for each person
	        String personName = "Alex"; // Person for whom matches need to be found
	        List<String> matches = findMatches(people, personName);
	        
	        // Output matches
	        System.out.println("Matches for " + personName + ":");
	        for (String match : matches) {
	            System.out.println(match);
	        }
	    }

	    public static List<String> findMatches(List<Person> people, String personName) {
	        List<String> matches = new ArrayList<>();
	        Person person = null;
	        
	        // Find the person object corresponding to the given name
	        for (Person p : people) {
	            if (p.getName().equals(personName)) {
	                person = p;
	                break;
	            }
	        }

	        // Find matches based on gender
	        if (person != null) {
	            for (Person p : people) {
	                if (!p.getName().equals(personName)) {
	                    if (person.getGender().equals("Male")) {
	                        if (p.getFather().equals(person.getFather()) && !p.getMother().equals(person.getMother())) {
	                            matches.add(p.getName());
	                        } else if (p.getMother().equals(person.getMother()) && !p.getFather().equals(person.getFather())) {
	                            matches.add(p.getName());
	                        }
	                    } else if (person.getGender().equals("Female")) {
	                        if (p.getFather().equals(person.getFather()) && !p.getMother().equals(person.getMother())) {
	                            matches.add(p.getName());
	                        } else if (p.getMother().equals(person.getMother()) && !p.getFather().equals(person.getFather())) {
	                            matches.add(p.getName());
	                        }
	                    }
	                }
	            }
	        }

	        return matches;
	    }
	    
	    
	    
//	    For a male, a match will be his father’s sister’s daughter or his mother’s brothers’ daughter.
//	    For a female, a match will be her father’s sister’s son or her mother’s brother’s son.
//	    Names are unique.
//	    Input format:
//	    <person's name>, <gender>, <father's name>, <mother's name>
//
//	    Input:
//	    John, Male, Brad, Lisa
//	    Emma, Female, Brad, Lisa
//	    Alex, Male, John, Jenny
//	    Emily, Female, Steve, Emma
//	    Rachel, Female, Steve, Emma
//
//	    Person name: Alex
//	    Output: Emily, Rachel
}
