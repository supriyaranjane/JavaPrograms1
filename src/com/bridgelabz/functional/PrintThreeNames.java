/******************************************************************************
 *  
 *  Purpose: Takes Three name as input and prints out a sentence with the names in the reverse order
 *
 *  @author  Supriya Ranjane
 *  @version 1.1
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintThreeNames {
	
	 
	 public static void main(String args[])
	 {
		 
	 Scanner sc =new Scanner(System.in);
	
		 System.out.println("Enter the Three Names:");
		 
		 String inputString = sc.nextLine();
		 
		 String outputString = Utility.reverseSentence(inputString);
		 
		 System.out.println("Input String :" +inputString);
		 
		
		 System.out.println("Output String : "+"Hi"+" " + outputString);
         
		 sc.close();
	 }

}
















