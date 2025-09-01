/*
Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/
import java.util.*;
public class perfectnumber22
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the the number");
			int num = sc.nextInt;
			
			sum = 0;
			
			while (int i<num)
			{	
				if(num%i=0)
				{
					sum =sum+i;
					i++;
					System.out.println("it is a perfect number");
				}
				else
				{
					System.out.println("it is a not perfect number");
				}
			}		
		}
	}
/*
import java.util.*;

public class PerfectNumber22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0; // to store sum of divisors
        int i = 1;

        // find divisors (exclude the number itself)
        while (i <= num / 2) {
            if (num % i == 0) {
                sum += i;   // add divisor
            }
            i++;
        }

        // check if perfect
        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is Not a Perfect Number.");
        }
    }
}
*/