package AlogarithmPrograms;

import java.util.Scanner;

public class InsertionInt
{
  static Scanner s=new Scanner(System.in);
  
  static int[] takein(int length)//taking integers as inputs
  {
	  int[] inte=new int[length];
	  for(int i=0;i<length;i++)
		{ 
			inte[i]=s.nextInt();
		}
	  return(inte);
  }
  
  static void logic(int[] in,int length)
  {
	  for(int i=1;i<length;i++)
	  {
		  int value=in[i];
		  int hole=i;
		  while(hole>0 && in[hole-1]>value)
		  {
			  in[hole]=in[hole-1];
			  hole=hole-1;
		  }
		  in[hole]=value;
	  }
	  for(int i=0;i<length;i++)
		{
			System.out.print(in[i]+" ");//printing of sorted array
		}
	  
	  
  }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter the no of intergers");
		int length=s.nextInt();
		int[] in=takein(length);
		logic(in,length);
		
		
	}

}
