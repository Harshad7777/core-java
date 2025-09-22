/*
Q1. Write a java program to print all natural numbers from 1 to n. using while loop
*/


import java.util.*;
public class printallnaturalnum1ton1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter value of n");
		int n = sc.nextInt();
		
		int i=1;
	
		while(i<=n)
		{
			System.out.println(i+ "");
			i++;
		}
	}
}



>javac printallnaturalnum1ton1.java

>java printallnaturalnum1ton1
enter value of n
5
1
2
3
4
5