package JUnitPrograms;


import java.util.Arrays;
import java.util.Scanner;

public class ToBinary 
{
	static void bin(int number)
	{
		
		int[] stream=new int[8];
		int[] extra=new int[8];
		int[] copy=new int[8];
		int i=0;
		while(number>0)
		{
		    stream[i]= (number%2);
			number=number/2;	
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(stream[j]);
			extra[j]=stream[j];
			
		}
		
		/*int k=0;
		for (int p= stream.length-1; p>=0 ; p--)
		{
			k = 10 * k + stream[p];
		}
		System.out.println();
		System.out.println(k);
		String s=String.format("%08d",k);
		System.out.println(s);*/
		
	
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want as binary");
		int number=s.nextInt();
		bin(number);

	}

}
