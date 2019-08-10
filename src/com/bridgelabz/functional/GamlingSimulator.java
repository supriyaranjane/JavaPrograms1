/****************************************************************************
 *  
 *  Purpose : Program for Gamalar simulator to calculate the win bets and percentages of win and loss.
 *
 *  @author  Supriya Ranjane
 *  @version 1.19
 *  @since   10-08-2019
****************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {
	
	public static void main(String args[]) {
		
		int  goal,stake,number;
		
		System.out.println("Enter the goal:");
		goal = Utility.integervalue();
		

		System.out.println("Enter the Stake amount:");
		stake = Utility.integervalue();
		
		

		System.out.println("Enter the number time goal:");
		number = Utility.integervalue();
		
	 Utility.gamlar(goal ,stake ,number);
		
		
		
	}

}
