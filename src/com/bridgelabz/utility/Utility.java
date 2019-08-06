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

import java.util.Scanner;

public class Utility {
	
	 static Scanner scanner = new Scanner(System.in);
	 
	 
	 public static int integervalue() {
		int  integervalue = scanner.nextInt();
		return integervalue;
		 
	 }
	
		 
	 
	 public static String stringvalue() {
			String stringvalue = scanner.next();
			return stringvalue;
			 
		 }
	 
	 
	 
	 public static char charactervalue() {
			char charactervalue = scanner.next().charAt(0);
			return charactervalue;
			 
		 }
	 
	 
	 
	 public static double doublevalue() {
			double doublevalue = scanner.nextDouble();
			return doublevalue;
			 
		 }
	 
	 public static float floatvalue() {
			float floatvalue = scanner.nextFloat();
			return floatvalue;
			 
		 }
		 
		
	
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
	
	
	/****************************************
	 * @param inputString: it is a input String
	 * @return: Reverse the words of sentence
	 ***************************************/
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
	
  /**
	 * @param year:Accept the year as a parameter
	 * @return:Print the year is Leap or not
	 */
	public static void leapyear(int year)
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

 /**
 * @param m:Accept a Month
 * @param d:Accept a day
 */
public static void spring(int month,int day)
 {   // boolean flag=true;
	 if((month>=3 && month<=6) || (day>=20 && day<=20 ))
	 {
		 //flag =true;
		 System.out.println("True");
	 }
	 
	/* else if(m<=6 && d<=20)
	 {
		 System.out.println("True");
	 }*/
	 
	 else
	 { //flag =false;
		 System.out.println("False");
	 }
 }


/**
 * @param x : enter value of x
 * @param y : enter value of y
 * @return
 */
public static double distance(double x,double y)
{

    // compute distance to (0, 0)
    double dist = Math.sqrt(x*x + y*y);
    
    System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	System.out.println("Power of x and y is :"+Math.pow(x, y));
    
    return 0;

  
}


/**
 * @param a :enter the value of a
 * @param b : enter the value of b
 * @param c :  entert the value of c
 */
public static double quadratic(double a,double b,double c) {
	
	 double delta = Math.sqrt(b * b - 4 * a * c);
	 
     double root1 = (-b +  delta) / (2*a) ;
     double root2 = (-b -  delta) / (2*a) ;

    System.out.println("The roots of the Quadratic Equation \"a*x*x + b*x + c\" are "+root1+" and "+root2);
	
     return 0;
	
}



/**
 * @param die1 : value of dice1
 * @param die2 : value of dice2
 * @return
 */
public static int  sumoftwodice(int die1,int die2 ) {
	
	                  
	int sum = die1 + die2;                                                                     

	return sum;
	
	
}


/**
 * @param n :  Accept the n numbers
 * @param average : Average of five random numbers
 * @param firstvalue : first random value
 * @param secondvalue : second random value
 * @param thirdvalue : third random value
 * @param firthvalue : forth random value
 * @param fifthvalue : fifth random value
 * @return
 */
public static double  average(double n,double average,double firstvalue,double secondvalue,double thirdvalue,double firthvalue,double fifthvalue ) {
	
	
    
 average = firstvalue+secondvalue+thirdvalue+firthvalue+fifthvalue/n;                                                                  

	return average;
	
	
}

/**
 * @param temp  :  enter the temperature 
 * @param speed : enter the wind speed
 * @return : calculate the wind chill
 */
public static double  windchill(double temprature,double speed ) {
	
	
    
double 	 chill= 35.74 + 0.6215*temprature + (0.4275*temprature- 35.75) * Math.pow(speed, 0.16);                                                                  

		return chill;
		
		
	}


/**
 * @param d  :  enter day
 * @param m  :  enter month
 * @param y  :  enter year
 * @return   :   retuen the result as day
 */
public static int dayofweak(int day,int month,int year)
{ 
	
	 int y0 = year- (14-month)/12; 
	 int x = y0 + y0/4 - y0/100 + y0/400;
   	 int  m0 = month + 12 * ((14 - month)/12) - 2;
	 int  d0 = (day + x + 31*m0/ 12) % 7;
	 return d0;

}

/**
 * @param temp
 * @param c
 * @return
 */
/**
 * @param temp : Enter the temperatur
 * @param c : Enter the character
 * @return : Convert   temperatur into  Fahrenheit to Celsius or viceversa
 */
public static int tempratur(int temp ,char c)
{  int Converttemp=0;


	if(c=='f' || c=='F' ) {
		Converttemp=  (temp * 9/5) + 32;

	}
	else if(c=='c' || c =='C')
	{
		Converttemp= (temp - 32) * 5/9 ;
	
	}
	else {
		
		System.out.println("Enter proper input:");
		return 0;
	}
	
	
	
	return Converttemp;
	 
}



public static double carloan(double principal,double year,double rate)
{
	
	
	
	double n = 12 * year;
  double r = rate / ( 12 * 100 );
	
	
	
	 double payment=principal * r / 1 - Math.pow( (1 + r) , (-n) );
     return payment;
	
}



public static double trigop(double degree) {
	
	double rad = Math.toRadians(degree);
	
	double sin = Math.sin(degree);
	
	double cos = Math.cos(degree);
	
	System.out.println("Sin ("+degree+")="+sin);
	//System.out.println(sin);
	
	
	
	System.out.println("Cos ("+degree+")="+cos);
	
	//System.out.println(cos);
	
	
	
	return rad;
}

/*****************************************************************************************************
 * @param times It takes input you want to be tossed.
 * @return 
 *****************************************************************************************************/
public static int flipcoin(int times)
{
	double heads = 0;
	for(int i=0;i<times;i++)
	{
		if (Math.random() > 0.5)
		{
			heads++;
		}
	}
	System.out.println("heads percentage is " + (float) (heads / times) * 100);
	System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
	return 0;
	
}


/**
 * @param i : For incrementing n
 * @param n :Enter n Nubers
 * @return : power of 2^n
 */
public static int powerof2(int i,int n)
{
	
	
     i = 0;              
    int powerOfTwo = 1;       

   
    while (i <= n) {
      System.out.println(i + " " + powerOfTwo);  
        powerOfTwo = 2 * powerOfTwo;                
        i = i + 1;
	
	
    }
	return powerOfTwo;
}


/**
 * @param n Enter the N numbers
 * @return
 */
public static double harmonicnumber(double n)
{
	
	double sum = 0.0;
    for (int i = 1; i <= n; i++) {
        sum += 1.0 / i;
    }

    System.out.println(sum);
    return 0;

	
}


/**
 * @param c : Enter4 the number which is a non-negative number.
 * @return Square root of non negative number
 */
public static double sqrt(double c)
{
	

	double epsilon = 1.0e-15; 
		
	double t = c;
		
		
	while (Math.abs(t - c/t) > epsilon*t)
	{
           t = (c/t + t) / 2.0;
     }

 
        System.out.println(t);
        
        return t;
}


/**
 * @param s1 : Enter the lower limit
 * @param s2 : Enter the upper limit
 * @return   : Return the output as a prime numbers in between the range.
 */
public static int primenumber(int s1,int s2)

{
	int flag = 0,i,j;
	
       System.out.println ("The prime numbers in between the entered limits are :");

	     for(i = s1; i <= s2; i++)
    {
        for( j = 2; j < i; j++)
        {
            if(i % j == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println(i);
        }
        
    }
	     
	     return i;
}




}


