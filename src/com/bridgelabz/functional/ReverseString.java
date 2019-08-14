/****************************************************************************
 *  
 *  Purpose : Reverse  the string.
 *
 *  @author  Supriya Ranjane
 *  @version 1.26
 *  @since   10-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import java.io.*;
public class ReverseString {

	public static void main(String args[])
	{
		String str=" Hello Supriya How are you";;
		//System.out.println("Enter a string:");
		System.out.println("Reverse of String" + str );
		int i=str.length();
		
		while(i>0)
			
		{
			System.out.println(str.charAt(i-1));
			i--;
		}
		
		
   }

}

