package com.example.java;

public class RemovePalindromeSentences {
	public static String removePalindromes(String input) {
        StringBuilder output = new StringBuilder();
        String[] sentences = input.split("\\.");
        
        for (String sentence : sentences) {
            String cleanedSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!isPalindrome(cleanedSentence)) {
                output.append(sentence.trim()).append(".");
            }
        }
        
        // Remove the trailing period
        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }
        
        return output.toString();
    }
    
    private static boolean isPalindrome(String sentence) {
        int left = 0, right = sentence.length() - 1;
        
        while (left < right) {
            if (sentence.charAt(left) != sentence.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
	    public static void main(String[] args) {
	        String input = "Hello! My name is Anna. I like to racecar. How are you?";
	        String output = removePalindromes(input);
	        System.out.println(output);
	    }
}
