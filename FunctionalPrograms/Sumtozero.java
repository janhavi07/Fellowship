package FunctionalPrograms;


public class Sumtozero
{
	void triplet(int[] number, int l)
	{
		for(int i=0;i<l-2;i++)
		{
			for(int j=i+1;i<l-1;i++)
			{
				for(int k=j+1;k<l;k++)
				{
					if(number[i]+number[j]+number[k]==0)
					{
						System.out.print(" " + number[i]);
						System.out.print("");
						System.out.print(" " +number[j]);
						System.out.print("");
						System.out.print(" " +number[k]);
						System.out.print("");
						System.out.println();
						
					}
				}
			}
		}
		
	}
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] number= {0,2,1,-3,-1};
		int l=number.length;
		Sumtozero a=new Sumtozero();
		a.triplet(number,l);
		

		
	}

}
