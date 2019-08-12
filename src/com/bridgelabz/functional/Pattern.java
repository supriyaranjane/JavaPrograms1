package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Pattern {
	public static void main(String args[]){
		System.out.println("Enter tne Number");
		int row=Utility.integervalue();
		//int row=3;
				int k=0;
		for(int i=1;i<=row;++i, k=0)
		{
			for(int j=1;j<=row-1;++j){
				System.out.print("  ");
			} 
			while(k != 2 * i - 1)
			{
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}
				
		
		
	}

}
