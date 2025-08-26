/*
Q1. Write a java program to enter length in centimeter and convert into meter and kilometer.
Q2. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
	Formula :- cel = (fah - 32) * 5 / 9;
Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
	Formula :- fah = (cel * 9 / 5) + 32;
Q4. Write a java program to enter two angles of a triangle and find the third angle. 
Q5. Write a java program to calculate area of an equilateral triangle.
Q6. Write a java program to enter marks of five subjects and calculate total marks and percentage.

Q7. Write a java program to calculate the simple intrest. 
Q8. Write a java program to calculate the compound intrest.
Q9. Write a java program swap two number using third variable.
Q10. Write a java program swap two number without using third variable
*/
/*-------------------------------------------------------------------------------------------------------------------------------------
Q1. Write a java program to enter length in centimeter and convert into meter and kilometer.
*/
/*
public class Day2
	{
		public static void main(String x[])
			{
			  double centimeter,meter,kilometer;
			  
			  centimeter = Integer.parseInt(x[0]);
	
				meter = centimeter/100;
			    kilometer = centimeter/100000;
			  
				System.out.println("convert into meter:"+meter);
				System.out.println("convert into kilometer:"+kilometer);
				
			}
	}
*/

/*
import java.util.*;
public class Day2
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value in centimeter:");
		double centimeter = sc.nextDouble();
		
		
		 double meter = centimeter/100;
		 double kilometer = centimeter/100000;
		
		System.out.println("meter :"+meter);
		System.out.println("kilometer :"+kilometer);
	}
}
*/

/*
C:\Program Files\Java\jdk-24\bin>javac Day2.java
C:\Program Files\Java\jdk-24\bin>java Day2
enter value in centimeter:
100
meter :1.0
kilometer :0.001
*/
/*-------------------------------------------------------------------------------------------------------------------------------------
/*
Q2. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
	Formula :- cel = (fah - 32) * 5 / 9;
*/

/*
public class Day2
{
	public static void main (String x[])
	{
		double fah = Double.parseDouble(x[0]);
		
		double cel = (fah - 32) * 5 / 9;
		
		System.out.println("temperature in Fahrenheit and convert to Celsius :"+cel);
	}
}
*/
/*
import java.util.*;
public class Day2
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter temp in Fahrenheit:");
		double fah = sc.nextDouble();
	
		double cel = (fah - 32) * 5 / 9;
		
		System.out.println("temperature in Fahrenheit and convert to Celsius :"+cel);
	}
}
*/

/*
C:\Program Files\Java\jdk-24\bin>javac Day2.java
C:\Program Files\Java\jdk-24\bin>java Day2 100
temperature in Fahrenheit and convert to Celsius :37.77777777777778
*/
/*-------------------------------------------------------------------------------------------------------------------------------------
/*
Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
	Formula :- fah = (cel * 9 / 5) + 32;
*/

// import java.util.*;
// public class Day2
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter temp in Fahrenheit:");
// 		double fah = sc.nextDouble();

// 		double cel = (fah - 32) * 5 / 9;

// 		System.out.println("temperature in Fahrenheit and convert to Celsius :"+cel);
// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java> java Day2      
// enter temp in Fahrenheit:
// 100
// temperature in Fahrenheit and convert to Celsius :37.77777777777778

// ----------------------------------------------------------------------------------------------------------------------------------

// Q4. Write a java program to enter two angles of a triangle and find the third angle. 

// import java.util.*;
// public class Day2
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter first angle:");
// 		double angle1 = sc.nextDouble();

// 		System.out.println("enter second angle:");
// 		double angle2 = sc.nextDouble();

// 		double angle3 = 180 - ( angle1 + angle2);

// 		System.out.println("third angle of triangle :"+angle3);
// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2      
// enter first angle:
// 30
// enter second angle:
// 60
// third angle of triangle :90.0

//-------------------------------------------------------------------------------------------------------------------------------------

// Q5. Write a java program to calculate area of an equilateral triangle.

// import java.util.*;
// public class Day2
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("enter side length:");
// 		double side = sc.nextDouble();

//         double area = (Math.sqrt(3) / 4) * side * side;

// 		System.out.println("area of equilateral triangle :"+area);
// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2
// enter side length:
// 10 
// area of equilateral triangle :43.301270189221924

//-------------------------------------------------------------------------------------------------------------------------------------
// Q6. Write a java program to enter marks of five subjects and calculate total marks and percentage.

// import java.util.*;
// public class Day2
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("enter marks of subject 1:");
// 		double sub1 = sc.nextDouble();

// 		System.out.println("enter marks of subject 2:");
// 		double sub2 = sc.nextDouble();

// 		System.out.println("enter marks of subject 3:");
// 		double sub3 = sc.nextDouble();

// 		System.out.println("enter marks of subject 4:");
// 		double sub4 = sc.nextDouble();

// 		System.out.println("enter marks of subject 5:");
// 		double sub5 = sc.nextDouble();

// 		double total = sub1 + sub2 + sub3 + sub4 + sub5;
// 		double percentage = (total / 500) * 100;

// 		System.out.println("total marks :"+total);
// 		System.out.println("percentage :"+percentage);
// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java    
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2      
// enter marks of subject 1:
// 70
// enter marks of subject 2:
// 70
// enter marks of subject 3:
// 80
// enter marks of subject 4:
// 90
// enter marks of subject 5:
// 95
// total marks :405.0
// percentage :81.0

//-------------------------------------------------------------------------------------------------------------------------------------

//  Q7. Write a java program to calculate the simple intrest. 

// import java.util.*;
// public class Day2
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("enter principal amount:");
// 		double  principal_amount = sc.nextDouble();

// 		System.out.println("enter interest rate:");
// 		double interest_rate = sc.nextDouble();

// 		System.out.println("enter period:");
// 		double  period = sc.nextDouble();

// 		double total = (principal_amount * interest_rate * period) / 100;
// 		System.out.println("total interest :"+total);
// 	}
// }

// import java.util.Scanner;
// public class Day2
// 	{
// 		public static void main(String x[])
// 			{
// 				Scanner sc = new Scanner(System.in);

// 				System.out.println("enter the amount:");
// 				double PrincipalAmount = sc.nextDouble();

// 				System.out.println("enter the intrest:");
// 				double Intrest = sc.nextDouble ();

// 				System.out.println("enter time:");
// 				double Time = sc.nextDouble ();

// 				double calculatethesimpleintrest = (PrincipalAmount*Intrest*Time)/100;

// 				double Amount = PrincipalAmount*Math.pow((1 + Intrest/100),Time);
// 				double compundInterest = Amount - PrincipalAmount;

// 				System.out.println("intrest is a:"+calculatethesimpleintrest);
// 				System.out.println("compundInterest is a:"+compundInterest);

// 			}
// 	}

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2      
// enter the amount:
// 10000
// enter the intrest:
// 12
// enter time:
// 2
// intrest is a:2400.0
// compundInterest is a:2544.000000000002

//-------------------------------------------------------------------------------------------------------------------------------------
// Q8. Write a java program to calculate the compound intrest.

// import java.util.Scanner;

// public class Day2 {
// 	public static void main(String x[]) {
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("enter the amount:");
// 		double PrincipalAmount = sc.nextDouble();

// 		System.out.println("enter the intrest:");
// 		double Intrest = sc.nextDouble();

// 		System.out.println("enter time:");
// 		double Time = sc.nextDouble();

// 		double calculatethesimpleintrest = (PrincipalAmount * Intrest * Time) / 100;

// 		double Amount = PrincipalAmount * Math.pow((1 + Intrest / 100), Time);
// 		double compundInterest = Amount - PrincipalAmount;

// 		System.out.println("intrest is a:" + calculatethesimpleintrest);
// 		System.out.println("compundInterest is a:" + compundInterest);

// 	}
// }

// 	PS C:\Users\harsh\Downloads\
// 	java course notes\java\
// 	Operator Assignment>
// 	javac Day2.java        
// PS C:\Users\harsh\Downloads\
// 	java course notes\java\
// 	Operator Assignment>
// 	java Day2
// 	enter the amount:10000
// enter the intrest:12
// 	enter time:4
// 	intrest is a:4800.0
// 	compundInterest is a:5735.193600000006


// -------------------------------------------------------------------------------------------------------------------------------------
// Q9. Write a java program swap two number using third variable.

// import java.util.Scanner;

// public class Day2 {
// 	public static void main(String x[]) {
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("first variable");
// 		int fv = sc.nextInt();

// 		System.out.println("second variable");
// 		int sv = sc.nextInt();

// 		System.out.println("variable before Swapping");
// 		System.out.println("a="+ fv + ",b="+sv);

// 		int temp = fv;
// 		fv = sv;
// 		sv= temp;

// 		System.out.println("after Swapping variable");
// 		System.out.println("a="+fv+ ",b="+sv);

// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> javac Day2PSPPPPPS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> java Day2       
// first variable
// 10
// second variable
// 20
// variable before Swapping
// a=10,b=20
// after Swapping variable
// a=20,b=10

//-------------------------------------------------------------------------------------------------------------------------------------
// Q10. Write a java program swap two number without using third variable
// 
// import java.util.Scanner;

// public class Day2 {
// 	public static void main(String x[]) {
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("first variable");
// 		int a = sc.nextInt();

// 		System.out.println("second variable");
// 		int b = sc.nextInt();

// 		System.out.println("variable before Swapping");
// 		System.out.println("a="+ a + ",b="+b);

// 		a = a + b;
// 		b = a-b;
// 		a = a-b;
		
// 		System.out.println("after Swapping variable");
// 		System.out.println("a="+a+ ",b="+b);

// 	}
// }

// PS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> javac Day2.java
// PS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> java Day2      
// first variable
// 10
// second variable
// 20
// variable before Swapping
// a=10,b=20
// after Swapping variable
// a=20,b=10

