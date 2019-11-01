package AlogarithmPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Utility.*;


public class BinarySearchString 
{
	
	public static Scanner s=new Scanner(System.in);
	public static String[] words_of_file=new String[10];
	//public static String[] convertToArray(Scanner sc)
	//
	
	public static void binaryStringSearch(String[] word_of_file,String search)
	{
		int low=0;
		int high=word_of_file.length-1;
		while(low<=high)
		{
			int mid=(high+low)/2;
			
			int compare_value=search.compareTo(word_of_file[mid]);
			if(compare_value==0) {
				System.out.println("element found at position " +(mid+1));
			    break;}
			if(compare_value>0)
			   low=mid+1;
			if(compare_value<0)
				high=mid-1;
			
		}
		
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
		File file=new File("/home/admin142/Desktop/Janhavi/text");
		Scanner sc=new Scanner(file);
		sc.useDelimiter(" ");
		String storeAs="";
		while(sc.hasNext())
		{
			storeAs=storeAs+sc.next()+" ";
		}
		words_of_file=storeAs.split(" ");
		//System.out.println(words_of_file[1]);
		Arrays.sort(words_of_file);
		System.out.println(words_of_file[0]);
		System.out.println(words_of_file[1]);
		System.out.println(words_of_file[2]);
		System.out.println(words_of_file[3]);
		
		
		//String[] string= {"hema","rima","rekha","tina"};
		System.out.println("Enter the element to be searched");
		String search=Utility.readString();
		binaryStringSearch(words_of_file, search);
				
	}

}
