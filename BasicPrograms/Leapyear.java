//leap year program
package BasicPrograms;

import java.util.Scanner;

public class Leapyear
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		if(year<1000)
		{
		  System.out.println("INVALID YEAR TYPED");	
		}
		else
		{
			if(year%4==0 || year%400==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			
			}
		}

	}

}
