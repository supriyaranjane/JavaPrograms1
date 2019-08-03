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



import com.bridgelabz.utility.Utility;

public class SpringSeason {
	
	

	public static void main(String args[]) {
		
	    int month,day;
	
	 	
		 System.out.println("Enter the Month:");
		  month=Utility.integervalue();
		 

		 System.out.println("Enter the Day:");
		 day=Utility.integervalue();
		 
		 
		 
		 Utility.spring(month,day);
		
}
}
