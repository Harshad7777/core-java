/* Q6. Problem:
 Perform binary search to find the index of a given key in a sorted array.
 If the key is not found, print -1.
Example:
 Input:
 arr = {2, 4, 6, 8, 10, 12}
 key = 10
 Output: Index = 4
Logic Explanation:
Set low = 0, high = arr.length - 1.


Find mid = (low + high) / 2.
If arr[mid] == key, element found.
If arr[mid] < key, search right half.
Else, search left half. */

import java.util.*;

public class BinarySearchExample_6 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, n, key);
        System.out.println("Index = " + index);
    }

    static int binarySearch(int arr[], int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // key not found
    }
}

