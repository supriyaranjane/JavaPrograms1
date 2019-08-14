/******************************************************************************
 *  
 *  Purpose: Calculate the euclidean distance using math function
 *
 *  @author  Supriya Ranjane
 *  @version 1.6
 *  @since   1-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {
 public static void main(String[] args)
    
 {        double x,y;
	
    	 System.out.println("Enter the value of x:");
		  x=Utility.integervalue();
		 

		 System.out.println("Enter the value of y:");
		 y=Utility.integervalue();
		 
		 
		 
		 
		  Utility.distance(x,y);
		  
		
    }   
}

