/******************************************************************************
 *  Purpose:  Program to compute Factors of a number N using prime factorization
method.
 *  @author  Ranjane Supriya
 *  @version 1.24
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PrimeNumber1 {

	
public static void main(String args[])
{

     System.out.println("Enter the Number Which you want to enter:");
     int n=Utility.integervalue();
       
       Utility.primeFactors(n); 
   
	}
}
