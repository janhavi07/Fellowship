package JUnitPrograms;

import java.util.Scanner;

public class VendingMachine 
{
	static void withdraw(int money)
	{
		int[] cash= {1000,500,100,50,20,10,5,2};
		int[] counter=new int[8];
		int no_count=0;
 		if(money>10000)
		{
			System.out.println("you cant withdraw this much amount");
			
		}
		
		else
		{
			for(int i=0;i<8;i++)
			{
				if(money>=cash[i])
				{
					counter[i]=money/cash[i];
					money=money-counter[i]*cash[i];		
					no_count++;
				}
			}
			
		}
 		for(int i=0;i<no_count;i++)
 		{
 			System.out.println(cash[i]+ " : "+ counter[i]);
 		}
 		int sum=0;
		for(int i=0;i<counter.length;i++)
		{
			sum=sum+counter[i];
		}
		System.out.println("So the total no of notes are : " +sum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the money to withdraw less than 10,000");
		int money=s.nextInt();
		withdraw(money);
		

	}

}
