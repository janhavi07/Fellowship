package AlogarithmPrograms;

import java.util.Scanner;
import Utility.*;
import Utility.*;
public class BinarySearchtInt
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the length of an array");
		int length=Utility.readInt();
		int[] arrayofnumber=new int[length];
		System.out.println("Enter the values");
	    arrayofnumber=Utility.toNumberArray(length);
		System.out.println("enter the number to be searched");
		int search=Utility.readInt();
		Utility.binarySearchInt(arrayofnumber, length, search);
		

	}

}
