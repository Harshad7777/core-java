/*
 Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates. 
*/

import java.util.*;
public class removeduplicatedvalues14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		input
		System.out.println("enter "+size+"element");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
		int temp = 0;
		System.out.println("Unique elements = {");
		for(int i=0; i<size; i++)
			{
				
			}
		System.out.println("}");
	}
}

/* import java.util.*;

public class removeduplicatedvalues14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a temporary array to store unique elements
        int temp[] = new int[size];
        int j = 0; // counter for temp array

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in temp
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp
            if (!isDuplicate)
			{
                temp[j] = arr[i];
                j++;
            }
        }

        // Print unique elements
        System.out.print("Unique elements = { ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println("}");
    }
}


 */