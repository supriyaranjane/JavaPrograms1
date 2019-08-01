/******************************************************************************
 *  
 *  Purpose: We done the code here for the purpose of reuse.
 *
 *  @author  Supriya Ranjane
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.utility;

public class Utility {
	
	/**
	 * @param number1: First integer number
	 * @param number2: Second integer number
	 * @return :Addition of first number and second number
	 */
	public static int add(int number1,int number2)
	{
		int sum=number1+number2;
		return sum;
	}
	
	
	/******************************************************************************
	 *  
	 *  Purpose: for reuse we create this method.
	 *
	 *  @author  Supriya Ranjane
	 *  @version 1.1
	 *  @since   31-07-2019
	 *
	 ******************************************************************************/
	
	
	/**
	 * @param inputString: it is a input String
	 * @return: Reverse the sentence
	 */
	public static String reverseSentence(String inputString)
	 {
		 String[] words = inputString.split("\\s");
		 
		 String outputString ="";
		 
		 for(int i=words.length-1;i>=0;i--)
		
		{
			 outputString = outputString + words[i] + " ";
		 }
		 
		 return outputString;
	 }
	
	
	/******************************************************************************
	 *  
	 *  Purpose: for reuse we create this method.
	 *
	 *  @author  Supriya Ranjane
	 *  @version 1.2
	 *  @since   31-07-2019
	 *
	 ******************************************************************************/
	
	
	
	
	 /**
	 * @param year:Accept the year as a parameter
	 * @return:Print the year is Leap or not
	 */
	public static void lpyear(int year)
     { 
		 boolean flag=true;
	if(year>=1582 && year<10000)   
      	 {      

     if(year % 400 == 0)
     {
         flag = true;
     }
     else if (year % 100 == 0)
     {
         flag = false;
     }
     else if(year % 4 == 0)
     {
         flag = true;
     }
     else
     {
         flag = false;
     }
     if(flag)
     {
         System.out.println("Year "+year+" is a Leap Year");
     }
     else
     {
         System.out.println("Year "+year+" is not a Leap Year");
     }
    		 } 

			else
			{
                         System.out.println("Year should be less than 1582");			
			}
     }



/******************************************************************************
 *  
 *  Purpose: for reuse we create this method.
 *
 *  @author  Supriya Ranjane
 *  @version 1.3
 *  @since   31-07-2019
 *
 ******************************************************************************/

/**
 * @param a:Parameter for accepting the First Integer number
 * @param b:Parameter for accepting the Second Integer number
 * @param c:Parameter for accepting the Third Integer number
 * @param num:for Number
 * @param value: For returning the value
 * @return: print the Integer operations using Precedence operators.
 */
	
	
	public static int integerop(int a, int b, int c, int num,int value)
{ 
	if(num==1)
	{
		value=a + b *c;
		//return value;
	}
		
	
	
	else if(num==2)
	{
		value= a * b + c;
		//return value;
	
	}
	
	else if(num==3)
	{
		value=  c + a / b;
		//return value;
	}
	
	
	

	else if(num==4)
	{
		value= a % b + c;
		//return value;
	}
	 
	
	return value;
	
	}








/******************************************************************************
 *  
 *  Purpose: for reuse we create this method.
 *
 *  @author  Supriya Ranjane
 *  @version 1.4
 *  @since   1-08-2019
 *
 ******************************************************************************/


	/**
	 * @param a:Parameter for accepting the First Double number
	 * @param b:Parameter for accepting the Second Double number
	 * @param c:Parameter for accepting the Third Double number
	 * @param num:for Number
	 * @param value: For returning the value
	 * @return: print the double operations using Precedence operators.
	 */

public static double doubleop(double a, double b, double c, double num,double value)
{ 
	if(num==1)
	{
		value=a + b *c;
		//return value;
	}
		
	
	
	else if(num==2)
	{
		value= a * b + c;
		//return value;
	
	}
	
	else if(num==3)
	{
		value=  c + a / b;
		//return value;
	}
	
	
	

	else if(num==4)
	{
		value= a % b + c;
		//return value;
	}
	 
	
	return value;
	
	}





/******************************************************************************
 *  
 *  Purpose: for reuse we create this method.
 *
 *  @author  Supriya Ranjane
 *  @version 1.5
 *  @since   1-08-2019
 *
 ******************************************************************************/

 /**
 * @param m:Accept a Month
 * @param d:Accept a day
 */
public static void spring(int m,int d)
 {
	 if(m>=3 && d>=20)
	 {
		 System.out.println("True");
	 }
	 
	 else if(m<=6 && d<=20)
	 {
		 System.out.println("True");
	 }
	 
	 else
	 {
		 System.out.println("False");
	 }
 }



}






