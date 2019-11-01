package AlogarithmPrograms;

import java.util.Scanner;


public class binarySInt
{
	public static void binary(int array[],int length,int search)
	{
		int low=0;
		int high=length-1;
		while(low<=high)
		{
			int mid=(high-low)/2;
			if(array[mid]==search)
			{
				System.out.println("Element found at index " +mid+1);
				break;
			}
			else if(array[mid]>search)
			{
				high=mid-1;
			}
			else if(array[mid]<search)
			{
				
				low=mid+1;
				
			}
			
		}
		System.out.println("low "+low);
		System.out.println("high "+high);
		if(low==high)
		{
			System.out.println("search not found");
			
		}
		else
		{
			System.out.println("search not found");
		}
				
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length=s.nextInt();
		int[] array=new int[length];
		System.out.println("Enter the values");
		for(int i=0;i<length;i++)
		{
			array[i]=s.nextInt();
			
		}
		System.out.println("enter the number to be searched");
		int search=s.nextInt();
		binary(array,length,search);
		

	}

}
