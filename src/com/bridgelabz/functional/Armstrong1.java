
/******************************************************************************
 *  Purpose:  To check the given number is armstrong or not.
 *  @author  Ranjane Supriya
 *  @version 1.30
 *  @since   12-08-2019
 *
 ******************************************************************************/package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Armstrong1 {

	public static void main(String[] args)
	{
		System.out.println("Enter the number which you want to check the number is armstrong or not:");
		int n=Utility.integervalue();
		
		
		int s1=n;
		int length=0;
		
		while(s1!=0)
		{
			length=length+1;
			s1=s1/10;
		}
		System.out.println(length);
		
		int s2=n;
		int rem,arm=0;
		
		while(s2!=0)
		{
			int mul = 1;
			rem=s2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
				
			}
			arm=arm+mul;
			s2=s2/10;
		}
		if(n==arm)
		{
			System.out.println("The number is aarmstrong number");
		}
		else
		{
			System.out.println("The number is not a armstrong number");
		}
		
		//Utility.armstrong1(n);
	}
	
}
