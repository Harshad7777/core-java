/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

import java.util.*;
public class HappyNumberorNot27
{
    public static int sumOfSquares(int n) 
	{
        int sum = 0;
        while (n > 0) 
		{
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    
    public static boolean isHappy(int n) 
	{
        while (n != 1 && n != 4) 
		{
            n = sumOfSquares(n);
        }
        return n == 1;  
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is NOT a Happy Number.");
        }

        sc.close();
    }
}