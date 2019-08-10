/****************************************************************************
 *  
 *  Purpose : Calculate the sum of prime numbers in between the  1 To 1000.
 *
 *  @author  Supriya Ranjane
 *  @version 1.25
 *  @since   10-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfPrimeNumber {
	
	public static void main(String args[])
	{
	    
	        
	        int n = 2;
	       int c = 0;
	        double sum = 0;
	        while(c < 1000){
	            if(prime(n)){
	                sum =sum + n;
	                c++;
	            }
	            n++;
	        }
	        System.out.println(sum);
	    
	}
	  public static boolean prime(int n){
	         
	        for(int i=2; i<=n/2; i++){
	            if(n % i == 0){
	                return false;
	            }
	        }
	        return true;
			
		
	    }
		
		
		
	    }


