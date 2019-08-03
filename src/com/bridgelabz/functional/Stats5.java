/****************************************************************************
 *  
 *  Purpose: Accept the five random values and calculate the minimum, maximum and average using math functions
 *
 *  @author  Supriya Ranjane
 *  @version 1.9
 *  @since   02-08-2019
****************************************************************************/



package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {
	
	
	public static void main(String args[]) {
		
		int n = 5;
		
		double firstvalue = Math.random();
		double secondvalue = Math.random();
		double thirdvalue = Math.random();
		double forthvalue = Math.random();
		double fifthvalue5 = Math.random();
		
		System.out.println(firstvalue);
		System.out.println(secondvalue);
		System.out.println(thirdvalue);
		System.out.println(forthvalue);
		System.out.println(fifthvalue5);
		
		double min = Math.min(firstvalue, Math.min(secondvalue, Math.min(thirdvalue,Math.min(forthvalue ,fifthvalue5))));
		double max = Math.max(firstvalue, Math.max(secondvalue, Math.max(thirdvalue,Math.max(forthvalue ,fifthvalue5))));
		
		double average=0;
		
		average = Utility.average(n, average, firstvalue, secondvalue, thirdvalue, forthvalue, fifthvalue5); 
		
		
		System.out.println("min is:"+min);
		System.out.println("max is:"+max);
		System.out.println("Average is:"+average);
		
		
		
		
	}

}
