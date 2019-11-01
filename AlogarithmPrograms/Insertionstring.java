package AlogarithmPrograms;

import java.util.Scanner;

public class Insertionstring
{
	static Scanner s=new Scanner(System.in);
//taking the string input//
	static String[] input(int length)
	{
		String[] string=new String[length];//defining the array of string
		System.out.println("enter the strings");
		for(int i=0;i<length;i++)
		{ 
			string[i]=s.next();
			
		}
		return(string);
		
	}
	//sorting logic//
	static void sort(String[] s1,int length)
	{
		for(int i=1;i<length;i++)
		{
			String value=s1[i];
			int hole=i;
			
			while(hole>0 && s1[hole-1].compareTo(value)>0)//comparing the contents
			{
				s1[hole]=s1[hole-1];
				hole=hole-1;
		    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
			s1[hole]=value;
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(s1[i]);//printing of sorted array
		}
	}
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("enter the no of strings");
		int length=s.nextInt();
		String[] s1=input(length);//length input
		sort(s1,length);
		
	}

}
