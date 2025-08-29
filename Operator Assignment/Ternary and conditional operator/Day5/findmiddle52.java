/*
Q52. Problem:
Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
Example Input:
p = 10, q = 20, r = 15
*/

import java.util.*;

public class findmiddle52 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int p = sc.nextInt();

        System.out.println("enter second number");
        int q = sc.nextInt();

        System.out.println("enter third number");
        int r = sc.nextInt();

        // Find middle using ternary operator
        //int msg = (p > q) 
                 //   ? ((p < r) ? p : (q > r ? q : r)) 
                 //   : ((q < r) ? q : (p > r ? p : r));
				 
				 int middle;
				 
				 if((p>q && p<r) || (p>r && p<q))
				 {
					 middle= p;
				 }
				else if((q>p && q<r)||(q>r && q<p))
				{
					middle = q;
				}
				else
				{
					middle = r;
				}

        System.out.println("Middle value among three distinct integers is " + middle);
    }
}

>java findmiddle52.java
enter first number
10
enter second number
20
enter third number
15
Middle value among three distinct integers is 15


