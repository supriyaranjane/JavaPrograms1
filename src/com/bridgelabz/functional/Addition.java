/******************************************************************************
 *  
 *  Purpose: Addition of two integers Numbers
 *
 *  @author  Supriya Ranjane
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Addition

{
	
	public static void main(String []args)
	{
		
		int number1,number2,result;
		
		System.out.println("We need to add a two integers");
		
		System.out.println("Enter a first integer:");
		number1 = Utility.integervalue();
		
        System.out.println("Enter a Second integer:");
		number2 = Utility.integervalue();
		
		result=Utility.add(number1,number2) ;
		 
	    System.out.println("Addtion of two integer is:" +result);
	    
		}

}
