package LogicalProgram;
import Utility.*;



public class Randomcount {

	public static void main(String[] args)
	{
		System.out.println("Enter the length of coupoun number");
		int length=Utility.readInt();
		System.out.println(" ---For accurate results enter number between 1-10---");
		System.out.println("Enter the Coupon number");
		Utility.randomCount(Utility.toNumberArray(length), length);
	
	}

}
