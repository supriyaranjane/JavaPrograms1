/****************************************************************************
 *  
 *  Purpose:Print the day of weak.
 *
 *  @author  Supriya Ranjane
 *  @version 1.11
 *  @since   02-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class DayOfWeak {

	public static void main(String[] args) {
		
		int day , month  , year ; 
		

		
		day = Integer.parseInt(args[0]);
		
		month = Integer.parseInt(args[1]);
		
		year = Integer.parseInt(args[2]);

		
		int result=Utility.dayofweak(day, month, year);
		System.out.println(result);
		

	}

}
