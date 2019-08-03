
/****************************************************************************
 *  
 *  Purpose: Calculate the wind chill .
 *
 *  @author  Supriya Ranjane
 *  @version 1.10
 *  @since   02-08-2019
****************************************************************************/



package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		double temprature,speed,chill1;
		 
		
		System.out.println("Enter value of temprature:");
		temprature = Utility.doublevalue();
		
		System.out.println("Enter value of speed:");
		speed= Utility.doublevalue();
      
		
        System.out.println("Temperature = " + temprature);
        System.out.println("Wind speed  = " + speed);
          
        chill1 = Utility.windchill( temprature, speed);
        
        System.out.println("Wind chill  = " + chill1);
	}

}
