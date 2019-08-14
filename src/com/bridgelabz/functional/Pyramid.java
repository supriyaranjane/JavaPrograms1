package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Pyramid {

	public static void main(String args[])
	{
		int row,space,star;
		System.out.println("Enter the number of rows:");
         int n = Utility.integervalue();
		
		for(row=1;row<=n;row++)
		{
			for(space = 4;space>=row;space--)
			{
				System.out.print("  ");
			}
			for(star=1;star<=(2*row-1);star++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		
		}
		
	}
}
