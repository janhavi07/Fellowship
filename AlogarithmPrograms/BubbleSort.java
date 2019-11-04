package AlogarithmPrograms;

import Utility.Utility;

public class BubbleSort 
{
  public static void main(String[] args)
  {
	  System.out.println("Enter the length of an array");
	  int length=Utility.readInt();
	  int[] arrayofnumber=new int[length];
	  System.out.println("Enter the values");
	  arrayofnumber=Utility.toNumberArray(length);
	  Utility.bubbleSort(arrayofnumber, length); 
	  
  }
}
