/******************************************************************************
 *  Purpose:  To check the given number is armstrong or not.
 *  @author  Ranjane Supriya
 *  @version 1.24
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class armstrong {

	public static void main(String args[]) {
		
		int sum;
		System.out.println("Enter the number Which we want to check the number is armstrong or not:");
		
	 int n = Utility.integervalue();
	 sum=n;
	 
	 sum =Utility.armstrong(sum);
	 
	 if(sum==n)
	 {
		 System.out.println("It is a armstrong Number");
		 
	 }
	 
	 
	 else
	 {
		 System.out.println("It is not a armstrong Number");
	 }
	}
}
