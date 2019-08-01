/******************************************************************************
	 *  
	 *  Purpose: do the Integer operations using precedence operators using integer type of data.
	 *
	 *  @author  Supriya Ranjane
	 *  @version 1.3
	 *  @since   31-07-2019
	 *
	 ******************************************************************************/


package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class IntOpt {
	
	public static void main(String args[]) {
		
     int a,b,c,value=0,num,result;
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
	 
	result =Utility.integerop(a, b, c, num, value);
	
	System.out.println("the result is:"+result);
	 
		//sc.close();
	 
		

	}
	
	

}
