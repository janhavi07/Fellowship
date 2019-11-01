//flip coin program
package BasicPrograms;

import java.util.Scanner;
import java.util.Random;

public class Flipcoin
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int head_count=0;
		int tail_count=0;
		Scanner s=new Scanner(System.in);
		//Random rand=new Random();
		System.out.println("Enter the number of times to flip the coin");
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("*fliping the coin*");
			double rand1=Math.random();
			if(rand1<0.5)
			{
				tail_count++;
			}
			else
			{
				head_count++;
			}
		}
		
		float percent_head=(head_count*100)/a;
		float percent_tail=(tail_count*100)/a;
		System.out.println("%head :" +percent_head);
		System.out.println("%tail :" +percent_tail);
		
		
	}
	
	}


