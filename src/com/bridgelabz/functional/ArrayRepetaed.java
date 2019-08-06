/****************************************************************************
 *  
 *  Purpose : Takes a range of number as input and outputs the Prime
Numbers in that range.
 *
 *  @author  Supriya Ranjane
 *  @version 1.22
 *  @since   06-08-2019
****************************************************************************/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class ArrayRepetaed {
	
/*
	
	void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } */
  
    public static void main(String[] args)  
    { 
        ArrayRepetaed repeat = new ArrayRepetaed(); 
        int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
        int arr_size = arr.length; 
        Utility.printRepeating(arr, arr_size); 
        
       
    } 
	
}


