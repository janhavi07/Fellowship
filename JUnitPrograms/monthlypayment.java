package JUnitPrograms;

public class monthlypayment 
{
	static void pay(int p,int y,float r)
	{
		double n=12*y;
		float r1=r/12*100;
		double payment=p*r1/(1-Math.pow(1+r1, -n));
		System.out.println("Payement is : " +payment);
		System.out.println("Round off payment : " +Math.round(payment));
	}

	public static void main(String[] args) 
	{
		int principal=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		float rate=Float.parseFloat(args[2]);
		pay(principal,year,rate);
		

	}

}
