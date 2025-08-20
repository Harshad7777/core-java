/*
Aug-25 Today's Practical Task...

Q1. Write a java program to display message  "This is first java program".
	
Q2. Write a java program to input all basic data types and print its output.
	
	Example :-
	
	Input :-   int a=2 ;              
					char ch='A' ;
					float f=3.14f;
					double d=2.34647;
					long b=1234545;
	
	Output:-	 a=2 ;              
					    ch='A' ;
					    f=3.14f;
					    d=2.34647;
					    b=1234545;
					 
Q 3. Write a java program to enter two numbers and perform all arithmetic operations.
	
Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
	
		Formula -  area= length * breadth;
	 
Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
		Formula :-
					diameter=2 * radius;
					circumference = 2 * 3.14 * radius;
					area = 3.14 * radius * radius;
*/
	

/*Q1. Write a java program to display message  "This is first java program".*/
/*
public class Day1
	{
		public static void main(String x[])
		{
			System.out.println("This is a first java program");
		}
	}
*/
/*	
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1
This is a first java program
*/

/*
Q2. Write a java program to input all basic data types and print its output.
	
	Example :-
	
	Input :-        int a=2 ;              
					char ch='A' ;
					float f=3.14f;
					double d=2.34647;
					long b=1234545;
	
	Output:-	        a=2 ;              
					    ch='A' ;
					    f=3.14f;
					    d=2.34647;
					    b=1234545;
*/
/*
public class Day1
	{
		public static void main(String x[])
		{
				    int a=2 ;              
					char ch='A' ;
					float f=3.14f;
					double d=2.34647;
					long b=1234545;
					
			System.out.println("a= "+a);
			System.out.println("ch= "+ch);
			System.out.println("f= "+f);
			System.out.println("d= "+d);
			System.out.println("b= "+b);
		}
	}
*/	
	
/*	
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1
a= 2
ch= A
f= 3.14
d= 2.34647
b= 1234545
*/

/*Q 3. Write a java program to enter two numbers and perform all arithmetic operations.*/
/*
public class Day1
	{
		public static void main(String x[])
		{
			long a=Integer.parseInt(x[0]);
			long b=Integer.parseInt(x[1]);
			
			long Add =a+b;
			long Sub =a-b;
			long Mul =a*b;
			long Div =a/b;
			long Mod =a%b;
			
			System.out.println("sum :"+Add);
			System.out.println("subtraction :"+Sub);
			System.out.println("multiplcation :"+Mul);
			System.out.println("Division :"+Div);
			System.out.println("Modulas :"+Mod);
		}	
	}
*/
	
/*
C:\Program Files\Java\jdk-24\bin>javac Day1.java

C:\Program Files\Java\jdk-24\bin>java Day1 10 10
sum :20
subtraction :0
multiplcation :100
Division :1
Modulas :0
*/

/*
Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
	
		Formula -  area= length * breadth;
*/
/*
public class Day1
{
	public static void main (String x[])
	{
		int length=Integer.parseInt(x[0]);
		int breadth=Integer.parseInt(x[1]);
		
		int area=length *breadth;
		
		System.out.println("Area of trangle:"+area);
	}
}
*/
/*
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1 10 10
Area of trangle:100
*/

/*
Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
		Formula :-
					diameter=2 * radius;
					circumference = 2 * 3.14 * radius;
					area = 3.14 * radius * radius;
*/
/*
public class Day1
{
	public static void main(String x[])
	{
		double radius = Double.parseDouble(x[0]);
		
		double diameter= 2*radius;
		double circumference= 2*3.14*radius;
		double area =3.14 * radius *radius;
		
		System.out.println("diameter:"+diameter);
		System.out.println("circumference:"+circumference);
		System.out.println("area:"+area);
	}
}
*/

/*
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1 10
diameter:20.0
circumference:62.800000000000004
area:314.0
*/

