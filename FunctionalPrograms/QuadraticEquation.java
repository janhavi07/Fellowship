package FunctionalPrograms;
import Utility.*;
import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String[] args) 
	{
		System.out.println("a*x^2 + b*x +c");
		System.out.println("Enter the a from your eq");
		int a=Utility.readInt();
		System.out.println("Enter the b from your eq");
		int b=Utility.readInt();
		System.out.println("enter c");
		int c=Utility.readInt();
		Utility.quadraticRoots(a, b, c);
	}

}
