package AlogarithmPrograms;
import Utility.*;
public class Anagram
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the word");
		String string1=Utility.readString();
		System.out.println("Enter the next word");
		String string2=Utility.readString();
		if(Utility.anagramLogic(Utility.convertToLowerCase(string1), Utility.convertToLowerCase(string2)))
			System.out.println("It is an anagram");
		else
			System.out.println("It is not an anagram");	
     }

}



	