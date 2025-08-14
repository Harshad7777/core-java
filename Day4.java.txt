/*
Q31. Write a Java program to check whether a number is even or odd. 
Q32. Write a Java program to check whether a triangle is valid or not.
Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
Q34. Write a Java program to check whether a number is positive , negative or zero.
Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
Q36. Write a Java program to check whether character is alphabetic or not.
Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
Q38. Write a Java program to check whether a year is leap year or not.
Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.
Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.
*/


/*
Q31. Write a Java program to check whether a number is even or odd. 
*/
/*
public class Day4
{
	public static void main(String x[])
	{
		Integer a = Integer.parseInt(x[0]);
		
		String msg =(a%2==0) ? "A is even" : "A is a Odd";
		System.out.println("msg"+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>java Day4 12
msgA is even
*/
/*
Q32. Write a Java program to check whether a triangle is valid or not.
all angle additon 180
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter angle1:");
		int angle1 = sc.nextInt();
		
		System.out.println("enter angle1:");
		int angle2 = sc.nextInt();
		
		System.out.println("enter angle1:");
		int angle3 = sc.nextInt();
		
		int totalangle = angle1+angle2+angle3;
		
		String msg = (totalangle==180) ? "triangle is valid":"triangle is not valid";
		System.out.println(""+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java
C:\Program Files\Java\jdk-24\bin>java Day4
enter angle1:
30
enter angle1:
60
enter angle1:
90
triangle is valid

C:\Program Files\Java\jdk-24\bin>javac Day4.java
C:\Program Files\Java\jdk-24\bin>java Day4
enter angle1:
1
enter angle1:
2
enter angle1:
3
triangle is not valid
*/

/*
Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side1:");
		int side1 = sc.nextInt();
		
		System.out.println("enter side2:");
		int side2 = sc.nextInt();
		
		System.out.println("enter side3:");
		int side3 = sc.nextInt();
	
		String msg = (side1==side2&&side2==side3&&side3==side1) ? "triangle is equilateral":(side1==side2)||(side1==side3)||(side2==side3)?"isoscale":"scalene";
		System.out.println(""+msg);
	}
}
*/


/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
enter side1:
12
enter side2:
12
enter side3:
12
triangle is equilateral

C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
enter side1:
12
enter side2:
13
enter side3:
12
 isoscale or scalene
 */
 
 /*
 Q34. Write a Java program to check whether a number is positive , negative or zero.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int a = sc.nextInt();
		
	    String msg = a>0?"positive":a<0?"negative":"zero";
		
		System.out.println(""+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
enter the value:
0
zero
*/


/*
Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int a = sc.nextInt();
		
	    String msg = (a%5==0)&&(a%11==0)?"divisible by 5 and 11":"Not divisible by 5 and 11";
		
		System.out.println(""+msg);
	}
}
*/

/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
enter the value:
12
Not divisible by 5 and 11
*/

/*
Q36. Write a Java program to check whether character is alphabetic or not.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		char a = sc.next().charAt(0);
		 
		 String msg = a>='A'&& a<='Z'|| a>='a'&& a<='z'?"character is alphabetic":"character is not alphabetic";
	  
		System.out.println(""+msg);
	}
}
/*
/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
enter the value:
a
character is alphabetic

C:\Program Files\Java\jdk-24\bin>java Day4
enter the value:
2
character is not alphabetic
*/
/*
Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("cost price of Product:");
		int a = sc.nextInt();
		System.out.println("selling price of Product:");
		int b = sc.nextInt();
		
		String msg = (a<b) ? "profit":"loss";
		
		System.out.println(""+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java
C:\Program Files\Java\jdk-24\bin>java Day4
cost price of Product:
10
selling price of Product:
9
loss
*/
/*
Q38. Write a Java program to check whether a year is leap year or not.
*/
/*
import java.util.*;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year:");
		int a = sc.nextInt();
		//leap year = 4year|| 400 days
		
		String msg = a%4==0 || a%100!=0 && (a%400==0) ? "leap year":"not leap year"; 
		
		System.out.println(""+msg);
	}
}
/*
/*
C:\Program Files\Java\jdk-24\bin>java Day4
enter year:
2024
leap year
C:\Program Files\Java\jdk-24\bin>java Day4
enter year:
2025
not leap year
/*

/*
Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.

*/
/*
import java.util.Scanner;
public class Day4
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the alphabet:");
		char ch = sc.next().charAt(0);
		
		ch = Character.toLowerCase(ch); //covert to lowercase

		 String msg = (ch>='a'&& ch<='z')?((ch=='a' || ch =='e' || ch =='i' || ch =='o'||ch =='u') ?"vowel":"consonant"):"Invalide input!";
	  
		System.out.println(""+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>java Day4
Enter the alphabet:A
vowel

C:\Program Files\Java\jdk-24\bin>java Day4
Enter the alphabet:b
consonant

C:\Program Files\Java\jdk-24\bin>java Day4
Enter the alphabet:1
Invalide input!

C:\Program Files\Java\jdk-24\bin>
*/
/*
Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.
*/
/*
import java.util.*;
public class Day4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
	
		String msg = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ? "Alphabet" :(ch >= '0' && ch <= '9') ? "Digit" : "Special Character";
	 
		System.out.println(""+msg);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>javac Day4.java

C:\Program Files\Java\jdk-24\bin>java Day4
Enter any character
A
Alphabet

C:\Program Files\Java\jdk-24\bin>java Day4
Enter any character
a
Alphabet

C:\Program Files\Java\jdk-24\bin>java Day4
Enter any character
1
Digit

C:\Program Files\Java\jdk-24\bin>java Day4
Enter any character
@
Special Character
*/
