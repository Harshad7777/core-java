/* Q29. Write a java program to display 1 to nth Prime Number.
 */
import java.util.*;
public class Primenumber1ton29
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		//1 is not prime number than the start from 2
		for(int i=2; i<=num; i++)
		{
			boolean isprime = true;
			
			for(int j=2; j<=i/2; j++)
			{ 
				if(i%j==0)
				{
				isprime=false;
				break;	
				}
			}
		
			if(isprime)
				{
					System.out.print(i+",");
				}
		}
	}
}

/* >java Primenumber1ton29.java
enter number
20
2,3,5,7,11,13,17,19, */
