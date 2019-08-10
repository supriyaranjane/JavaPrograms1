package com.bridgelabz.functional;
import java.util.*;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class happynumber {

	public static void main(String args[])
	{
		  //s=n;
		int s;
		
		System.out.println("Enter a number to check whether it is happy number or not");

		 int n = Utility.integervalue();
		 s=n;
		 
		 
		 while(s>9)
		 {
			 s=Utility.happy(s);
		 }
		 if(s==1)
		 {
			 System.out.println("It is a Happy number");
		 }

		 
		 else
		 {
			 System.out.println("It is not Happy number");
		 }
         
		 
	}
	
}
