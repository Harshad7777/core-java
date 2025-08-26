/*
Q16. Write a Java program to print the ASCII value of a given character.
*/

import java.util.*;
public class 16_ascii
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter given character");
        char ch = sc.next().charAt(0);

        int ascii = (int)ch;

        System.out.println("ascii value of " +ch+ " is " +ascii);
    }
}