/* Q7. Problem :
 In a sorted array, use binary search to find the position where a given key should be inserted to maintain order.
Example:
 Input:
 arr = {1, 3, 5, 6}, key = 2
 Output: Insert Position = 1
Logic Explanation:
Use binary search to find mid.
If key < arr[mid], move high to mid - 1.
If key > arr[mid], move low to mid + 1.
When loop ends, low will be the correct insert position. */

import java.util.*;

public class InsertPositionBinarySearch_7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to insert: ");
        int key = sc.nextInt();

        int pos = findInsertPosition(arr, n, key);
        System.out.println("Insert Position = " + pos);
    }

    static int findInsertPosition(int arr[], int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;  // key already exists
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // when loop ends, 'low' is the correct insertion index
        return low;
    }
}

