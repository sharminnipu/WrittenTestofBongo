/*1)Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not. */

import java.util.Arrays;

public class AnagramChecker {
	
	public static boolean isAnagram(String str1, String str2) {  
		
    
        boolean result = true;  
        if (str1.length() != str2.length()) {  
           result = false; 
        	
        	
        } else {  
            char[] word1 = str1.toLowerCase().toCharArray();  
            char[] word2 = str2.toLowerCase().toCharArray();  
           Arrays.sort(word1);  
           Arrays.sort(word2);  
            
           
           result = Arrays.equals(word1, word2); 
        
        }  
       if (result) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        } 
          
        
       return true;
    }  
   
    public static void main(String[] args) {  
    	
   
        isAnagram("bleat", "table");  
        isAnagram("tar", "eat"); 
    	
    }  
	}
