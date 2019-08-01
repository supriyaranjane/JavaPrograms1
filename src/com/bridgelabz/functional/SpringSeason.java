/******************************************************************************
 *  
 *  Purpose: 
 *
 *  @author  Supriya Ranjane
 *  @version 1.5
 *  @since   1-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {
	
	

	public static void main(String args[]) {
		
	    int m,d;
	     Scanner sc =new Scanner(System.in);
	 	
		 System.out.println("Enter the Month:");
		  m=sc.nextInt();
		 

		 System.out.println("Enter the Day:");
		 d=sc.nextInt();
		 
		 
		 
		 Utility.spring(m,d);
		 sc.close();
		 

}
}
