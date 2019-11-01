package BasicPrograms;

import java.util.Scanner;

public class Factors
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=s.nextInt();
		int[] array=new int[a+1];
		for(int i=1;i<=a;i++)
		{
			
			array[i]=i*1;
			System.out.print(array[i]+" ");			
		}
		
		int[] array1=new int[a+1];
		int[] array2=new int[a+1];
		int[] array3=new int[a+1];
		int j=1;
		for(int i=1;i<=a;i++)
		{
			if(array[i]%2==0 || array[i]%3==0 || array[i]%5==0)
			{
				array1[i]=array[i];
			}
			else
			{
				array2[i]=array[i];
				
			}
		
		}
		System.out.println();
		for(int i=1;i<=array2.length;i++)
		{
			
			if(array2[i]!=0)
			{
				//System.out.println("hi");
				array3[j]=array2[i];
				System.out.println(array3[j]);
				j++;
			}
		}
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		System.out.println("j is " +j);
			
			//System.out.print(array2[i]+ " ");
		
		
		for(int i=1;i<=array3.length+1;i++)
		{
				System.out.println(array3[i]);
			
		}
		
	}
}


