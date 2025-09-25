/* Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.

 */
 
import java.util.*;
public class reversearray7
{
	 public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		
		//for input
		System.out.print("enter "+ size + " element :");
		for(int i=0; i<size; i++)
			{
				 a[i] = sc.nextInt();
			}		
		//display output reverse
		System.out.print("reverse arry element :");
		int mid = size/2;
		int end = size-1;
		
		for(int i=0; i<mid; i++)
			{
				int temp = a[i];
				a[i] = a[end];
				a[end] = temp;
				end--;		
			}
			 
			 for(int i=0; i<size; i++)
				{
					System.out.print(a[i]+" "); 
				} 
		/* for(int i=size - 1; i>=0; i--)
			{
				 System.out.print(a[i]+" "); 
			} */
	}		
}	
/* 
>java reversearray7.java
enter the size
5
enter 5 element : 1 2 3 4 5
reverse arry element : 5 4 3 2 1	 */
		
