/****************************************************************************
 *  
 *  Purpose :  perform various trigonometric operations
 *
 *  @author  Supriya Ranjane
 *  @version 1.14
 *  @since   03-08-2019
****************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double degree;
		
		System.out.println("Enter value of Degree");
		degree=Utility.doublevalue();
		
		
        double rad = Utility.trigop(degree);
		
		System.out.println("Radian is:  "+rad);
		

	}

}
