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

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		System.out.println("Enter the element to be searched");
		String search=Utility.readString();
		Utility.binaryStringSearch(Utility.wordsToArray(), search);
				
	}

}
