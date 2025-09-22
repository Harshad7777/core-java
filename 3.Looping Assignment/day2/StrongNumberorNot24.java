/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/


import java.util.*;
public class StrongNumberorNot24
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter number");
	
		int rem ;
		int sum=0;
		
		int num = sc.nextInt(); //145
		int temp = num;
		int f = 1;
		
		while(num!=0)
		{	
			 rem = num % 10; //5
			
			while(rem!=0)
			{
			       f=f*rem;
				rem--;
			}
			
			sum+=f;
		
			num/=10;
			
		}
		if(sum==temp)
		{
			System.out.println(temp +" it is a strong number");
		}
		else
		{
			System.out.println(temp + " it is a not strong number");
		}
		
	}	
}		


/*
>javac StrongNumberorNot24.java

>java StrongNumberorNot24
 enter number
145
145 it is a not strong number

*/
			
			
			