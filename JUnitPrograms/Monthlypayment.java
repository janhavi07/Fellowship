package JUnitPrograms;
import Utility.*;

public class Monthlypayment 
{

	public static void main(String[] args) 
	{
		//Taking the input from Command Line Argument.
		int principal=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		float rate=Float.parseFloat(args[2]);
		Utility.monthlyPayment(principal, year, rate);
	
	}

}
