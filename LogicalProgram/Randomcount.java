package LogicalProgram;

import java.util.Random;
import java.util.Scanner;

public class Randomcount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random r=new Random();
		
		Scanner s=new Scanner(System.in);
		int[] random= {1,2,3,4,8,6,7};
		
		int random_count=0;
		for(int i=0;i<random.length;i++)
		{
			int randomno=r.nextInt(10);
			if(randomno==random[i])
			{
				random_count++;
			}
		}
		System.out.println("Random counts : " +random_count);
		
	
		

	}

}
