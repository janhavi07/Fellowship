package AlogarithmPrograms;

import java.util.Scanner;
import Utility.*;

public class Primerange 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the lower range");
		int lower=Utility.readInt();
		System.out.println("eneter the upper limit");
		int upper=Utility.readInt();
		Utility.prime(lower,upper);

 	}

}
