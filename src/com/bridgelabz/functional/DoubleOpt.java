/******************************************************************************
 *  
 *  Purpose: do the Integer operations using precedence operators using Double type of data.
 *
 *  @author  Supriya Ranjane
 *  @version 1.4
 *  @since   1-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {
	
	
	public static void main(String args[]) {
		
	    double a,b,c,value=0,num,result;
	     Scanner sc =new Scanner(System.in);
	 	
		 System.out.println("Enter the value of a:");
		  a =sc.nextInt();
		 

		 System.out.println("Enter the value of b:");
		 b=sc.nextInt();
		 
		 
		 System.out.println("Enter the value of c:");
		 c=sc.nextInt();
		 
		 
		 System.out.println("1. a + b *c");
		 
		 
		 System.out.println("2. a * b + c");
		 
		 System.out.println("3. c + a / b");
		 
		 System.out.println("4.  a % b + c");
		 
		 System.out.println("Enter the Number:");
		 num=sc.nextInt();
		 
		result =Utility.doubleop(a, b, c, num, value);
		
		System.out.println("the result is:"+result);
		 
			sc.close();

     }
}
