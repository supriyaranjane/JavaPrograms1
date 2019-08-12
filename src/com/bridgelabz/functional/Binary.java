/****************************************************************************
 *  
 *  Purpose : convert the decimal into Binary number.
 *  @author  Supriya Ranjane
 *  @version 1.28
 *  @since   12-08-2019
****************************************************************************/



package com.bridgelabz.functional;

public class Binary {
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int a =0,count=0;
		String s=" ";
		while(n >0)
		{
			a=n%2;
			if(a==1)
			{
				count++;
			}
			
		s=s+""+a;
		n=n/2;
			
			
			
		}
		
		System.out.println("The binary Number is:"+s);
		
		
	}

}
