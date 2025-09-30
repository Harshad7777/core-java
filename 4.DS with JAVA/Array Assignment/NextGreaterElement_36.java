/* Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
 */
import java.util.*;
public class NextGreaterElement_36
{
	public static void main(String x[])
	{
		int a[] = new int[]{5, 3, 10, 9, 6, 13};
	
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			int next = -1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					b[i] = a[j];
					break;
				}	
			}
			
			if(b[i]==0)
			{
				b[i] = -1;
			}
			
			System.out.print(b[i]+" ");	
		}
	}
}
/* 
import java.util.*;

public class NextGreaterElement_36 
{
    public static void main(String x[]) 
	{
        int a[] = new int[]{5, 3, 10, 9, 6, 13};
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int next = -1; // assume -1 initially
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[j] > a[i]) {
                    next = a[j];
                    break;
                }
            }
            b[i] = next;
        }

        // Print the result array
        System.out.println("Next Bigger Elements Array:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
 */












