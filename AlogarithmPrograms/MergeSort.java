package AlogarithmPrograms;

import Utility.Utility;

public class MergeSort 
{

	public static void main(String[] args)
	{
		  System.out.println("Enter the length of an array");
		  int length=Utility.readInt();
		  int[] finalarray=new int[length];
		  System.out.println("Enter the values");
		  finalarray=Utility.toNumberArray(length);
		  Utility.mergeSort(finalarray);
          Utility.printArray(finalarray);
	}

}
