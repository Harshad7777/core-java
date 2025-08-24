
// Q51. Problem 
// Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
// Example Input
// m = 25, n = 12

// Q52. Problem
// Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
// Example Input
// p = 10, q = 20, r = 15

// Expected Output
// Middle Number 15

// Q53. Take percentage and income of a student
// If percentage = 75 AND income  200000, print Eligible
// Else Not Eligible

// Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.

// Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.

// Example
// Input num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater


// Input num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater

// Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if
// basicSalary = 35000
// taxRate = 12%
// Find netSalary.

// Q57. Question
// If performance rating  8, give 15% bonus; else if rating  5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.



// Q51. Problem 
// Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
// Example Input
// m = 25, n = 12


// import java.util.;
// public class Day7
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println(enter first 25);
// 		int m = sc.nextInt();
		
// 		System.out.println(enter second 12);
// 		int n = sc.nextInt();
		
// 		String msg = (m-n=10)difference is grater than 10difference is not grater 10;
		
// 		System.out.println(+msg);	
// 	}
// }


// CProgram FilesJavajdk-24binjavac Day7.java

// CProgram FilesJavajdk-24binjava Day7
// enter first 25
// 25
// enter second 12
// 12
// difference is grater than 10


// Q52. Problem
// Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
// Example Input
// p = 10, q = 20, r = 15

// Expected Output
// Middle Number 15




// import java.util.;
// public class Day7
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println(enter first 10);
// 		int p = sc.nextInt();
		
// 		System.out.println(enter second 20);
// 		int q = sc.nextInt();
		
// 		System.out.println(enter second 15);
// 		int r = sc.nextInt();
		
// 		int msg = (p  q) 
		
//                          ((p  r)  p  (q  r  q  r)) 
//                          ((q  r)  q  (p  r  p  r));
		
// 		System.out.println(middle value among three distinct integers p, q, and r is +msg);	
		
// 	}
// }


// CProgram FilesJavajdk-24binjavac Day7.java
// CProgram FilesJavajdk-24binjava Day7
// enter first 10
// 10
// enter second 20
// 20
// enter second 15
// 15
// middle value among three distinct integers p, q, and r is15


// Q53. Take percentage and income of a student
// If percentage = 75 AND income  200000, print Eligible
// Else Not Eligible


// import java.util.;
// public class Day7
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println(enter percentage);
// 		int p = sc.nextInt();
		
// 		System.out.println(enter income);
// 		int q = sc.nextInt();
		
	
		
// 		String msg = (p=75) && (q 200000) Eligible Not Eligible;
		
// 		System.out.println(+msg);	
		
// 	}
// }


// CProgram FilesJavajdk-24binjavac Day7.java
// CProgram FilesJavajdk-24binjava Day7
// enter percentage
// 85
// enter income
// 150000
// Eligible


// Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.


// import java.util.;
// public class Day7
// {
// 	public static void main (String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println(enter three-digit number);
// 		int n = sc.nextInt();
		
// 		int first = (n100);
		
// 		int last = (n%10);
		
// 		int msg = (first  last)  firstlast;
		
// 		System.out.println(Larger digit between first and last+msg);	
		
// 	}
// }


// CProgram FilesJavajdk-24binjavac Day7.java
// CProgram FilesJavajdk-24binjava Day7
// enter three-digit number
// 123
// Larger digit between first and last3


// Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
// Input num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater

// Input num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater


// import java.util.Scanner;
// public class Day7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

      
//         System.out.print(Enter a three-digit number );
//         int num = sc.nextInt();

      
//         int first = num  100;         
//         int middle = (num  10) % 10; 
//         int last = num % 10;            


//         String result = (middle  (first + last)) 
//                          Middle digit is greater than sum of first and last 
//                          Middle digit is NOT greater than sum of first and last;

        
//         System.out.println(result);
//     }
// }


// CProgram FilesJavajdk-24binjavac Day7.java
// CProgram FilesJavajdk-24binjava Day7
// Enter a three-digit number 173
// Middle digit is greater than sum of first and last


// Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if
// basicSalary = 35000
// taxRate = 12%
//  Find netSalary.


// import java.util.Scanner;
// public class Day7 {	
	
//     public static void main(String[] args) 
// 	{
//         Scanner sc = new Scanner(System.in);
		
//         System.out.print(Enter a basicSalary );
//         int basicSalary = sc.nextInt();
		
// 		System.out.print(Enter a taxrate );
//         int taxrate = sc.nextInt();
		
// 	    double netSalary = basicSalary;
//        netSalary -= (basicSalary  taxRate  100);
	
			
//         double netSalary = basicSalary - (basicSalary  taxrate100);

//         System.out.println(netSalary+netSalary);
// 		System.out.println(nettax+(basicSalary  taxrate100));
//     }
// }


// CProgram FilesJavajdk-24binjavac Day7.java
// CProgram FilesJavajdk-24binjava Day7
// Enter a basicSalary 35000
// Enter a taxrate 12
// netSalary30800.0
// nettax4200


// Q57. Question
// If performance rating  8, give 15% bonus; else if rating  5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.



// import java.util.Scanner;
// public class Day7 {	
	
//     public static void main(String[] args) 
// 	{
//         Scanner sc = new Scanner(System.in);
		
//         System.out.print(Enter a basicSalary );
//         int basicSalary = sc.nextInt();
		
// 		System.out.print(Enter a rating );
//         int rating = sc.nextInt();
		
// 		double bonus = (rating8)  (basicSalary15100)(rating5)  (basicSalary10100)0;
		
// 		double netSalary = (basicSalary + bonus);
        
//         System.out.println(netSalary+netSalary);
//     }
// }


// CProgram FilesJavajdk-24binjava Day7
// Enter a basicSalary 100000
// Enter a rating 6
// netSalary110000.0



