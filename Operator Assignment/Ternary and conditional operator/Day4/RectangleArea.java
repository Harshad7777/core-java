/*
Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
Formula - area= length * breadth;

*/

import java.util.*;

public class RectangleArea 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        // Formula: area = length * breadth
        int area = length * breadth;

        // Displaying result
        System.out.println("Area of rectangle = " + area);
    }
}

>javac RectangleArea.java

>java RectangleArea
Enter length of rectangle: 10
Enter breadth of rectangle: 20
Area of rectangle = 200
