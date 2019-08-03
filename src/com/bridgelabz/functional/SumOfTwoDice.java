/****************************************************************************
 *  
 *  Purpose: sum of two dice and genrate the numbers randomly from 1 to 6
 *
 *  @author  Supriya Ranjane
 *  @version 1.8
 *  @since   02-08-2019
****************************************************************************/


package com.bridgelabz.functional;

import java.lang.Math;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
		
		
		int die1,die2,sum;
		
		
	//int SIDES = 6;                                     
	die1 = 1 + (int) (Math.random() * 6);   
	System.out.println("First ramdom value : "+die1);
	die2= 1 + (int) (Math.random() * 6);  
	System.out.println("First ramdom value : "+die2);

    
	sum= Utility.sumoftwodice(die1,die2);
	System.out.println("Sum is:"+sum);                                                    
	
	}

}



