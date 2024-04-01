package com.example.java;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RemoveSpecialCharacters {


	public static void main(String[] args) {

		String input = "Hello!!@#$$%%^&^*(*)*_++{}:?><>[][];';/.,/,~ This is a @Test String 867 !";
		String regex = "[^a-zA-Z0-9\\s]";

		String result =  input.replaceAll(regex, "");

		System.out.println("result: "+result);
		
//        String inputString = "RUA ESTUARIO,21 – COMPL.C/7 – JD MARAJOARA – SÃO PAULO – SP 04645100";
//        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9 .,]", "");
//        System.out.println("Cleaned string: " + cleanedString);
//        
        String originalString =
        	      "RUA ESTUÁRIO,21 – COMPL.C/7 – JD MARAJOARA – SÃO PAULO – SP 04645100";

        	    // Remove diacritic characters
        	    String cleanedString = removeDiacritics(originalString);

        	    System.out.println("Original: " + originalString);
        	    System.out.println("Cleaned:  " + cleanedString);
        
	}
	
	 public static String removeDiacritics(String input) {
		    String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
		    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		    return pattern.matcher(normalized).replaceAll("");
		  }
	 
}
