/* 
Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found". 
*/

import java.util.*;
public class searchelementinarray21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		//enter key to try to find
		System.out.println("enter the element try to find");
		int key = sc.nextInt();
		
		int index = -1;
		System.out.println("enter "+size+" element");
		for(int i=0; i<size; i++)
			{
				if(a[i] == key)
				{
					index = i;
				}
				
			}
			
			if(inde)
			{
				
			}
		
		
		
		
		
		
		
	}
}