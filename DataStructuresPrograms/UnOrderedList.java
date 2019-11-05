package DataStructuresPrograms;
import java.io.FileNotFoundException;

import Utility.*;

public class UnOrderedList 
{

	public static <T> void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the word to search from the list");
		String wordToSearch=Utility.readString();
		LinkedList<T> list=new LinkedList<T>();
		list.insertIntolist(Utility.wordsToArray());
		System.out.println("Elements are taken from the file :");
		list.printLinkedList();
		list.search(wordToSearch);
	}

}
