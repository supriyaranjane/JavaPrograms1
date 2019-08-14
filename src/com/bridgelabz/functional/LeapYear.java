/******************************************************************************
 *  
 *  Purpose: Print the year is leap year or not
 *
 *  @author  Supriya Ranjane
 *  @version 1.2
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear
{
   public static void main(String args[])
   {
      // Scanner s = new Scanner(System.in);
       System.out.print("Enter any year:");
       int year = Utility.integervalue();
       boolean flag = false;
       Utility.leapyear(year); 
       
     
   }
}
