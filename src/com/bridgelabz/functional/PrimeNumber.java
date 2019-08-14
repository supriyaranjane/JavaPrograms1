
/****************************************************************************
 *  
 *  Purpose : Takes a range of number as input and outputs the Prime
Numbers in that range.
 *
 *  @author  Supriya Ranjane
 *  @version 1.21
 *  @since   06-08-2019
****************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class PrimeNumber {

	public static void main(String[] args) {
		 
		int s1, s2, s3, flag = 0, i, j;
	       //  Scanner s = new Scanner(System.in);
	         
		     System.out.println ("Enter the lower limit :"); 
	         s1 = Utility.integervalue();
	       
	         System.out.println ("Enter the upper limit :"); 
	         s2 =  Utility.integervalue();
	        
	      //   System.out.println ("The prime numbers in between the entered limits are :");
	         
	     
	         
	       i=    Utility.primenumber(s1, s2);
	       
	      // System.out.println(result );
	     
	  }
	
		
		

	}


