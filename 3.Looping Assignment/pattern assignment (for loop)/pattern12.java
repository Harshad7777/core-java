/*
Q3. Write a java program to print this pattern.

	*						*
	*	*				*
	*	*	*		*
	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*	*
	*	*	*	*	*	*	*


*/



public class pattern12
{
	public static void main (String x[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if( i>=j || j==8-i)
				{
					System.out.print("* ");
				} 
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
