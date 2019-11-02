package AlogarithmPrograms;

import java.util.Arrays;
import java.util.Scanner;
import Utility.*;
public class Anagram
{
	
	public static void main(String[] args) 
	{
		Anagram anagram=new Anagram();
		System.out.println("enter string 1");
		String s1=Utility.readString();
		System.out.println("enter string 2");
		String s2=Utility.readString();
	    char[] charArray1=Utility.convertToLowerCase(s1);
		char[] charArray2=Utility.convertToLowerCase(s2);
		if(Utility.anagramLogic(charArray1,charArray2)) 
			System.out.println("it is a anagram");
		else
		    System.out.println("not an anagram");
		
		
		
		

	}

}
