/****************************************************************************
 *  
 *  Purpose :  Calculate monthly payment over the year
 *
 *  @author  Supriya Ranjane
 *  @version 1.13
 *  @since   03-08-2019
****************************************************************************/

package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;


public class CarLoan {

	public static void main(String[] args) {
		
		double principal , year ,rate; 
		
		principal = Double.parseDouble(args[0]);
		
		
		year =  Double.parseDouble(args[1]);
		
		
		rate =  Double.parseDouble(args[2]);

		 
		double result = Utility.carloan(principal,year,rate);
		
		System.out.println("Result is"+result);
	}

}
