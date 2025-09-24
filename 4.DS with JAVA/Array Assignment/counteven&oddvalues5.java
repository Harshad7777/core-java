Q5. Write a Java program to count even & odd values from an array.
/* Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed. */

import java.util.*;
public class countevenoddvalues5
{
	 public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter "+size+" element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int evencount = 0;
		System.out.println("Values at Even Index");
		for(int i=0; i<size; i++)
		{
			if(i%2==0)
			{
				evencount++;
			}
		}
		int oddcount = 0;
		System.out.println("Values at Odd Index");
		for(int i=0; i<size; i++)
		{
			if(i%2==1)
			{
				oddcount++;
			}
		} 
	}
}
