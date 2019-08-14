/******************************************************************************
 *  
 /*  Purpose: Finds the root using quadrativ equition
 *
 *  @author  Supriya Ranjane
 *  @version 1.7
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
	
	/*
		double  a = 2;
		double  b = 6;
		double  c = 4;
	 
	 
	*/
        double a,b,c;
		
		
		
		System.out.println("Enter value of a:");
		a = Utility.integervalue();
		
        System.out.println("Enter value of b:");
		b = Utility.doublevalue();
		
		
	    System.out.println("enter value of c :");
	    c= Utility.doublevalue();	
		Utility.quadratic(a,b,c) ;
		
		
		//System.out.println("The roots of the Quadratic Equation \"a*x*x + b*x + c\" are "+root1+" and "+root2);
		
		 
	
	
	
	
	}

}
