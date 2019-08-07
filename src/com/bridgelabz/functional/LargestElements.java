
/******************************************************************************
 *  Purpose: Find the Second Largest and second smallest number in unsorted array without sorting technique.
 *  @author  Ranjane Supriya
 *  @version 1.23
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LargestElements{
	
	public static void main(String[] args)
	{
		int i=0,n = 0;
	
		System.out.println("Enter the Number of elemenets which you want to enter:");
		 n = Utility.integervalue();
		 
		 
		 System.out.println("enter the all element: ");
			int a[]=new int [n];
			for(i=0;i<n;i++)
			{
				a[i]=Utility.integervalue();;
			}
			
			 System.out.println("Second Largest Element is:"+a[n-2]);

		     System.out.println("Second Smallest Element is:"+a[1]);
			
		 
		
		
	
	Utility.largestelements(i,n);
	}


}