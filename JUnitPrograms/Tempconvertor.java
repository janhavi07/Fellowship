package JUnitPrograms;

import java.util.Scanner;

public class Tempconvertor 
{
	static void temp(String d,float t)
	{
		switch(d)
		{
		case "c":
			float f= t*9/5 + 32 ;
			System.out.println("TEMPERATURE IN FAHRENHITE IS :" +f);
			break;
		case "f":
			float c=(t-32)*5/9;
			System.out.println("TEMPERATURE IN CELCIUS IS : " +c);
			break;
		
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Are your inputing in C or F ?");
		String d=s.next();
		System.out.println("Enter the temperature");
		float t=s.nextFloat();
		temp(d,t);
	}

}
