/*
Q17. Write a Java program to convert seconds to hours, minutes and seconds. 
*/

import java.util.*;

public class convertSecondToHours17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter seconds");
		double totalSeconds = sc.nextInt();
		
/*		
		double hours = totalSeconds / 3600;              // 1 hour = 3600 seconds
        double minutes = (totalSeconds % 3600) / 60;     // Remaining minutes
        double seconds = totalSeconds % 60; 
*/		
		double hours = totalSeconds / 3600;
        double minutes = totalSeconds  / 60;  
        double seconds = totalSeconds ; 
		
		System.out.println("seconds to hours"+hours);
		System.out.println("seconds to minutes"+minutes);
		System.out.println("seconds to seconds"+seconds);
		
	}
}
>javac convertSecondToHours17.java
>java convertSecondToHours
enter seconds
3600
seconds to hours1.0
seconds to minutes60.0
seconds to seconds3600.0



>javac convertSecondToHours17.java
>java convertSecondToHours
enter seconds
3600
seconds to hours1.0
seconds to minutes0.0
seconds to seconds0.0

