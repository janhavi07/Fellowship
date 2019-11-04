package JUnitPrograms;

import java.util.Scanner;

public class Binarynibble 
{
static void swap(int number)
{
	int newnum;
	newnum=((number & 0x0F)<<4 | (number & 0xF0)>>4);
	System.out.println("number after nibble swapping :" +newnum);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
	    String d=Integer.toBinaryString(number);
	    System.out.println("binary representatio is:"+d);
	    swap(number);
	    
	 
		
		

	}

}
