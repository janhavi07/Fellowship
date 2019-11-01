//harmonic printing
package BasicPrograms;

import java.util.Scanner;

public class Harmonicprint
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of harmonic :");
		int val=s.nextInt();
		for(int i=1;i<=val;i++)
		{
			int val1=1*i;
			
			System.out.print(" 1/"+val1);
		}
		float val2=0;
		for(float i=1;i<=val;i++)
		{
			val2=val2 + 1/i;
				
		}
		System.out.println();
		System.out.println("value of harmonic is :" +val2);
		

	}

}
