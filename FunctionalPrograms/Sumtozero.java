package FunctionalPrograms;
import Utility.*;

public class Sumtozero
{
	
    public static void main(String[] args) 
	{
		System.out.println("Enter the length of array");
		int length=Utility.readInt();
		System.out.println("Print the elements");
		Utility.sumToZero(Utility.toNumberArray(length),length);
		

		
	}

}
