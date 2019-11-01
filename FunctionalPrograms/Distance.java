package FunctionalPrograms;

import java.util.Scanner;

public class Distance
{
	static void distance(int x,int y)
	{
		double distance;
		double distance1 =(Math.pow(x, 2)+Math.pow(y, 2));
		distance=Math.sqrt(distance1);
		System.out.println("distance is :" +distance);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the x cordinate");
		int x=s.nextInt();
		System.out.println("enter the y cordinate");
		int y=s.nextInt();
		Distance a=new Distance();
		a.distance(x, y);
		

	}

}
