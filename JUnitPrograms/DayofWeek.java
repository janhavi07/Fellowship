package JUnitPrograms;

public class DayofWeek
{
	static void dayof(int m,int d,int y)
	{
		
		float y0 = y - (14 - m)/12;
		float x = y0 + y0/4 - y0/100 + y0/400;
		float m0 = m + 12 *((14 - m) /12) - 2;
		float d0 = (d+x +31*m0 /12)%7;
		int d00=(int)d0;
        //System.out.println(d0);

        switch(d00)
        {
        case 0:
              System.out.println("Sunday");
              break;
        case 1:
        	  System.out.println("Monday");
        	  break;
        case 2:
        	System.out.println("TUesday");
        	break;
        case 3:
        	System.out.println("Wednesday");
        	break;
        case 4:
        	System.out.println("THursday");
        	break;
        case 5:
        	System.out.println("Friday");
        	break;
        case 6:
        	System.out.println("Saturday");
        	break;
        	
        }

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		int date=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		dayof(month,date,year);
		

	}

}
