/****************************************************************************
 *  
 *  Purpose : Takes initials as input and prints the initials
using nine rows of asterisks.
 *
 *  @author  Supriya Ranjane
 *  @version 1.20
 *  @since   06-08-2019
****************************************************************************/

package com.bridgelabz.functional;

public class PrintInitials {


		
		
		
		    // Function to generate the pattern D 
		    static void D_Pattern(int n){ 
		          
		        // loop for rows 
		        for (int i = 0; i < n; i++){ 
		              
		            // loop for columns 
		            for (int j = 0; j <= n; j++){ 
		                  
		                // Logic to generate stars 
		                // for * 
		                if (j == 1 || ((i == 0 || 
		                             i == n-1) && 
		                   (j > 1 && j < n-2)) || 
		                   (j == n-2 && i != 0 &&  
		                               i != n-1)) 
		                    System.out.print("*");  
		                      
		                // For the spaces 
		                else
		                    System.out.print(" ");  
		            } 
		              
		        // For changing line 
		        System.out.println(); 
		        } 
		    } 
		      
		    // Driver Code 
		    public static void main(String[] args) 
		    { 
		        int n = 13; 
		  
		        // Function calling 
		        D_Pattern(n); 
		    } 
		
		  
		// This code is contributed by ChitraNayal. 
		
	}


