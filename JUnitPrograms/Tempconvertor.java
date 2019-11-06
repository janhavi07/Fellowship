package JUnitPrograms;
import Utility.*;
public class Tempconvertor 
{

	public static void main(String[] args) 
	{

		System.out.println("Are your inputing in C or F ?");
		String decide=Utility.readString();
		System.out.println("Enter the temperature");
		float temperature=Utility.readFlaot();
		Utility.tempConvertor(decide, temperature);
	}

}
