/* 
Q32. Write a java program to display 1 to nth Strong Number.
 */
import java.util.*;
public class display1tonthStrongNumber32
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			boolean duck = false;
			int i2=i;
			while(i2>0)
			{
				
				if(i2%10==0)
				{
					duck = true;
					break;
				}
				i2/=10;
			
			}	
				
				if(duck)
				{
					System.out.print(i2+",");
				}
		}
	}
}