package com.example.java;

public class FirstUniqueChar {

	public static void main(String[] args) {
		
		String s  = "llooppooz";
		
		int[] findInd = new int[26];
		
		for(char ch : s.toCharArray()) {
			System.out.println(findInd[ch-'a']++);
			
		}
		
		for(int i=0 ;i<s.length();i++) {
			System.out.println("loop--> "+findInd[s.charAt(i)-'a']);
			if(findInd[s.charAt(i)-'a']==1) {
				System.out.println("index: "+i); 
			}
		}
		
	//	System.out.println(-1);
	}
	
	
	
	/*
	  
	   Map<Character, Integer> res = new HashMap<>();

        for(char ch : s.toCharArray()){
            res.put(ch, res.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(res.get(s.charAt(i))==1){
                return i;
            }
        }
        
	 */
	
	
}
