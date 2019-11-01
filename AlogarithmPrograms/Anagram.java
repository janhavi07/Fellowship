package AlogarithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	static boolean Anagram(char[] charArray1,char[] charArray2)
	{
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return(Arrays.equals(charArray1, charArray2));
		
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=s.next();
		System.out.println("enter string 2");
		String s2=s.next();
		char[] charArray1=s1.toLowerCase().toCharArray();
		char[] charArray2=s2.toLowerCase().toCharArray();
		if(Anagram(charArray1,charArray2)) {
			System.out.println("it is a anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
		
		
		

	}

}
