/******************************************************************************
 *  Purpose:  Program to compute Factors of a number N using prime factorization
method.
 *  @author  Ranjane Supriya
 *  @version 1.24
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class PrimeNumber1 {

	
public static void main(String args[])


{
	

	    // A function to print all prime factors 
	    // of a given number n 
	    public static void primeFactors(int n) 
	    { 
	        // Print the number of 2s that divide n 
	        while (n%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            n /= 2; 
	        } 
	  
	        // n must be odd at this point.  So we can 
	        // skip one element (Note i = i +2) 
	        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	        { 
	            // While i divides n, print i and divide n 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            } 
	        } 
	  
	        if (n > 2) 
	            System.out.print(n); 
	    } 
	  
	    public static void main (String[] args) 
	    { 
	        int n = 315; 
	        primeFactors(n); 
	    } 
	
}
}
