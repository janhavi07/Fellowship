package FunctionalPrograms;

import java.util.Scanner;

public class QuadraticEquation
{
	static void roots(int a,int b,int c)
	{
		int delta=b*b-4*a*c;
		double root1=(-b + Math.sqrt(delta))/(2*a);
		double root2= (-b -Math.sqrt(delta))/(2*a);
		System.out.println("ROOTS ARE " +root1+ " and " +root2);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("a*x^2 + b*x +c");
		System.out.println("Enter the a from your eq");
		int a=s.nextInt();
		System.out.println("Enter the b from your eq");
		int b=s.nextInt();
		System.out.println("enter c");
		int c=s.nextInt();
		QuadraticEquation as=new QuadraticEquation();
		as.roots(a,b,c);

	}

}
