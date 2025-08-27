/*
Q45. Write a java program to find the minimum between two numbers. 
*/

import java.util.*;
public class minimumbtweentwonumbers
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter first numbers");
		int a = sc.nextInt();
		
		System.out.println("enter second numbers");
		int b = sc.nextInt();
		
		if(a<b)
		{
			System.out.println(a +" is  lesser than the " +b);
		}
		else 
		{
			System.out.println( b +" is  lesser than the " +a);
		}	
	}
}


> javac minimumbtweentwonumbers.java

> java minimumbtweentwonumbers
enter first numbers
10
enter second numbers
20
10 is  lesser than the 20