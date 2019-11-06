package JUnitPrograms;
import Utility.Utility;

public class Binarynibble 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=Utility.readInt();
	    String binary=Integer.toBinaryString(number);
	    System.out.println("binary representatio is:"+binary);
	    Utility.swapNibble(number);
	}

}
