/****************************************************************************
 *  
 *  Purpose :  calculate the head percentage of head and tail.
 *
 *  @author  Supriya Ranjane
 *  @version 1.15
 *  @since   03-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class FlipCoin {

	public static void main(String[] args) {
	
		System.out.println("Enter amount of times you want the coin to be tossed :");
		int times=Utility.integervalue();
		
		Utility.flipcoin(times);

	}

}
