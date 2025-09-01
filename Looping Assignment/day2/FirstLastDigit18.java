/*
Q18. Write a java program to find the first and last digit of a number.
*/

import java.util.*;

public class FirstLastDigit18 
{
    public static void main(String x[] )
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Find last digit
        int lastDigit = num % 10;

        // Find first digit
		//We keep dividing the number by 10 until it becomes a single-digit number.
		//because value of first digit grater than 10 become less then got a fist digit
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
/*
>javac FirstLastDigit18.java
>java FirstLastDigit18
Enter a number:
123456
First digit: 1
Last digit: 6
*/



