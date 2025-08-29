
/*-----------------------7 problem --------------------//
Assignment 7

A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.
Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).
You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
Input Format
•	The first and only line of input will contain a single integer XX, the current IQ of Chef.

Output Format
•	For each testcase, output in a single line "Yes" or "No"
•	You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Constraints
100<=X<=169

Sample1
Input			Output
165			Yes

Explanation
After learning a musical instrument, Chef's final IQ will be 165+7=172. Since 172 >= 170 Chef can beat Einstein.
Sample2
Input			Output
120			No

Explanation:
After learning a musical instrument, Chef's final IQ will be 120+7=127120+7=127. Since 127    127<170, Chef cannot beat Einstein

--------------------------7 code-------------------------*/

import java.util.Scanner;
public class aug22DecisionMakingStatement64
{
    public static void main(String x1[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter iq of chefs");
        int x = sc.nextInt();

        if(x+7>170)
        {
            System.out.println("yes");
        }

        else
        {
            System.out.println("no");
        }
    }
}

/*------------------------------7output--------------------------------//

>javac aug22DecisionMakingStatement64.java
>java aug22DecisionMakingStatement64
enter iq of chefs
165
yes

>java aug22DecisionMakingStatement64
enter iq of chefs
120
no
*/