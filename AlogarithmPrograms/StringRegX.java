package AlogarithmPrograms;
import AlogarithmPrograms.*;
import Utility.*;
public class StringRegX 
{


	public static void main(String[] args) throws Exception 
	{
		Userdetails user=new Userdetails();
		System.out.println("Enter the first name");
		user.setFirstname(Utility.readString());
		System.out.println("Enter the last name");
		user.setLastname(Utility.readString());
		System.out.println("Enter the mobile no");
		user.setMobileno(Utility.readString());
		System.out.println("Enter the date");
		System.out.println("Enter the date in dd/mm/yyyy format");
		user.setDate(Utility.readString());
		String finalmsg= Utility.patternMatcher(user);
        System.out.println(finalmsg);
	}

}
