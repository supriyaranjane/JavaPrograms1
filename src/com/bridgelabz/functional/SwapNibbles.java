/******************************************************************************
 *  Purpose:  Swapping the nibbles and after that prints the decimal number.
 *  @author  Ranjane Supriya.
 *  @version 1.31
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SwapNibbles {
	
	public static void main(String args[])
	{
		 
			 int n=Integer.parseInt(args[0]);
		  
		     int result = Utility.swapnible(n);
		     System.out.println("the decimal number is:"+result);
	}

	}

