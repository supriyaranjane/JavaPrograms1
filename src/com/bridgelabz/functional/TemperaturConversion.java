
/****************************************************************************
 *  
 *  Purpose : Enter the temperatur  and convert into Fahrenheit to Celsius or viceversa
 *
 *  @author  Supriya Ranjane
 *  @version 1.12
 *  @since   03-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		System.out.println("Enter value of Tempratur in Fahrenheit and  Celsius:");
		
		 int  temp = Utility.integervalue();
		
		 
		 char c = Utility.charactervalue();
		
		int result = Utility.tempratur(temp, c);
		
		System.out.println("Result is:"+result);
	}

}
