/******************************************************************************
 *  Purpose:  Program on String functions.
 *  @author  Ranjane Supriya
 *  @version 1.31
 *  @since   12-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import java.util.Arrays;

public class StringFunction {
	
	static boolean areAnagram(char[] str1, char[] str2) 
    { 
        
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        
        if (n1 != n2) 
            return false; 
  
       
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
	
	//code for string is palindrome  or not
	
	static boolean isPalRec(String str,  
            int s, int e) 
{ 

if (s == e) 
return true; 

// If first and last  
// characters do not match 
if ((str.charAt(s)) != (str.charAt(e))) 
return false; 

if (s < e + 1) 
return isPalRec(str, s + 1, e - 1); 

return true; 
} 
	
	static boolean isPalindrome(String str) 
    { 
        int n = str.length(); 
  
        if (n == 0) 
            return true; 
  
        return isPalRec(str, 0, n - 1); 
    } 
	
	
	
	 public static void main(String args[]) 
	    { 
		 //code for string is anagram or not
	        char str1[] = { 't', 'e', 's', 't' }; 
	        char str2[] = { 't', 't', 'e', 'w' }; 
	        if (areAnagram(str1, str2)) 
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other"); 
	        
	        
	        
	        // code for to check the string is palindrome or not
	        

	        String str = "geeg"; 
	  
	        if (isPalindrome(str)) 
	            System.out.println("The Strins "  + str +    " is a palindrome"); 
	        else 
	            System.out.println("the String "    + str +  " is not a palindrome"); 
	    } 

}
