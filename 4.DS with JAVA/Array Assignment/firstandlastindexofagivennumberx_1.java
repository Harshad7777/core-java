/* Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
 arr = [2, 4, 4, 4, 6, 7, 9], x = 4
 Output: First = 1, Last = 3
Explanation:
Modify binary search:


To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.


This requires two binary searches.
 */
import java.util.*;
public class firstandlastindexofagivennumberx_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" element");
		for(int i=0; i<a.length; i++)
			{
				a[i] = sc.nextInt();
			}
		//given array
		int left=0, right = (a.length-1), result = -1;
		
		System.out.println("enter "+size+" array is :");
		for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+"\t");
			}
		

		System.out.println("enter the search key");
		int skey = sc.nextInt();
		
		
		while(left<=right)
		{
			int mid = left+(right-left)/2;
			
			if(a[mid]==skey)
			{
				result = mid;
			}
			break;
			
			else if(a[mid]<skey)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		if(result!=-1)
		 { System.out.println("element found");
		 }
		 else
		 {
			  System.out.println("Element not found");
		 }
					
	}
}
