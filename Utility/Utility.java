package Utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import AlogarithmPrograms.*;
import FunctionalPrograms.*;

import LogicalProgram.*;
public class Utility 
{
	public static Scanner s=new Scanner(System.in);
	public static char[][] board=new char[3][3];
	public static char turn='X';
	final private static String REGXNAME="<<name>>";
	final private static String REGXFULLNAME="<<full name>>";
	final private static String REGXMOBILE="xxxxxxxxxx";
	final private static String REGXDATE="01/01/2016";
	/**
	 * To read the integer input
	 * @return integer value
	 */
	public static int readInt()
	{
	return s.nextInt();
	}
	/**
	 * 
	 * To read the double input
	 * @return double
	 */
	public static double readDouble()

	{
		return s.nextDouble();
	}
	/**
	 * 
	 * To read the string input
	 * @return string
	 */
	public static String readString()

	{
		return s.next();
	}
	/**
	 * 
	 * To read the float input
	 * @return
	 */
	public static float readFlaot()

	{
		return s.nextFloat();
	}
	
	/**
	 * Tic-tac-toe program
	 * Purpose: print the 3x3 Board
	 */
    public static void ticTacToe()
     {
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			board[i][j]='_';//printing the board
		}
	}
	play();//play function is called 
    }
    public static void play()
	{
	printBoard(); // Print the board function is called
	boolean playing=true;
	while(playing)
	{
	  System.out.println("Enter the of rows and col in which you want to put");
	  int row=s.nextInt()-1;
	  int col=s.nextInt()-1;
	  board[row][col]=turn;
	  if(checkGame(row,col))//checking if particular row/col is X/O.
	  {
		  playing=false;
		  System.out.println("player " +turn + " wins");
		 printBoard();
		 break;  
	  }
		if(turn=='X')
		   turn='0';
		else 
			turn='X';
		
		printBoard();
	 
	}	 
 }
    /**
     * Printing the 3x3 board
     */
	public static void printBoard()
	 {
		 for(int i=0;i<3;i++)
		 { 
			 System.out.println();
			 for(int j=0;j<3;j++)
			 {
				 if(j==0)
				 {
					 System.out.print("| ");
				 }
				 System.out.print(board[i][j] + " |");	
			 }
		 }
		 
	 }
	/**
	 * To check whether a particular row/ column has X or 0.
	 * @param row
	 * @param col
	 * @return it returns true or false to continue the game or not.
	 */
	public static boolean checkGame(int row,int col)
	 {
	 	if(board[row][0]==board[row][1] && board[row][2]==board[row][0] && board[row][0]!='_')
	 		return true;
	 	else if(board[0][col]==board[1][col] && board[2][col]==board[0][col] && board[0][col]!='_')
	 		return true;
	 	else if(board[0][0]==board[1][1] && board[2][2]==board[0][0] && board[0][0]!='_')
	 		return true;
	 	else if(board[0][2]==board[1][1] && board[2][0]==board[0][2] && board[0][2]!='_')
	 		return true;
	 	else 
	 	return false;

	 }
	/**
	 * Take the inputs for Gambler program.
	 */
	public static void gamblerInput()
	{
		int stake,goal,bet=0,win=0;
	    int trails;
		System.out.println("Enter the stake of user");
		stake=readInt();
		System.out.println("Enter the Goal ");
		goal=readInt();
		System.out.println("enter the trails he wants to go through");
	    trails=readInt();
	    gamblerLogic(stake, goal, bet, win, trails);
		
	}
	/**
	 * Simulates a gambler who start with stake and 
	 * place fair bets until he/she goes broke or reach goal. Keeps track of the 
	 * number of times he/she wins and
	 * the number of bets he/she makes. Run the experiment trails times,
	 * averages the results, and prints them out.

	 * @param stake
	 * @param goal
	 * @param bet
	 * @param win
	 * @param trails
	 */
public static void gamblerLogic(int stake,int goal,int bet,int win,int trails)
	{
		for(int i=1;i<=trails;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
			    bet++;
				if(Math.random()>0.5)
					cash++;
				else
					cash--;	
			}
		  if(cash==goal)
             win++;			
		}
		System.out.println("wins by " +win);
		System.out.println("% of game won " +(100*win/trails));
		System.out.println("average bets " +bet/trails);
	}
   /**
    * Takes two double command-line arguments 
    * temperature and velocity and prints the wind chill
    */
   public static void windChill()
   {
	double temp, velocity,wind_chill=0;
	System.out.println("Enter the temperature");
	temp=readDouble();
	System.out.println("Enyter the velocity");
	velocity=readDouble();
	   if( temp<=50 && velocity<=120 || velocity>=3)
		 {
			 wind_chill=35.74 +0.6215*temp +(0.4275*temp +35.75)*Math.pow(velocity, 0.16);
		 }
		 else
		 {
			 System.out.println("incorrect data");
		 }
		 
		 
		System.out.println("THe value of windchill is :" +wind_chill);
	 
	   
   }
/**
 * Converts the text in a .txt file and converts them into a string array.
 * @return String[]
 * @throws FileNotFoundException
 */
public static String[] wordsToArray() throws FileNotFoundException
{
	File file=new File("/home/admin142/Desktop/Janhavi/text");
	Scanner sc=new Scanner(file);//Scans the text from the file.
	sc.useDelimiter(" ");//Stores the value into the sc object with the spaces in the words
	String storeAs="";//String variable is defined the save string.
	while(sc.hasNext())
	{
		storeAs=storeAs+sc.next()+" ";
	}
	String[] words_of_file=storeAs.split(" ");//converts into the array of string
	return words_of_file;
}

/**
 * Binary Search of a String array.
 * @param word_of_file
 * @param search
 */
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

/**
 * Covert the string to lower-case.
 * @param s1
 * @return
 */
public static char[] convertToLowerCase(String s1)
{
	char[] charArray=s1.toLowerCase().toCharArray();
	return charArray;
}
/**
 * Check whether a string is anagram or not.
 * @param charArray1
 * @param charArray2
 * @return whether is it anagram or not.
 */
public static boolean anagramLogic(char[] charArray1, char[] charArray2) {
	
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	if(Arrays.equals(charArray1, charArray2))
	return true;
	else
	return false;
	
}

/**
 * Print the range of prime numbers.
 * @param lower
 * @param upper
 */
public static void prime(int lower,int upper)
{
	for(int i=lower;i<=upper;i++)
	{
		if(i==0 || i==1)
			continue; //AS 1 is not the prime number it continues as to not print.
	 int flag=1;
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
		System.out.print(" " +i);
	    }
	}
}
/**
 * Takes a command-line argument N, asks you to think of a 
 * number between 0 and N-1, where N = 2^n, and always 
 * guesses the answer with n questions.
 * @param n
 */
public static void guessGame(int n)
{
	int low=0;
	int high=n-1;
	int mid=0;
	while(low<=high)
	{
		mid=(low+high)/2;
		System.out.println("is your number greater than " +mid+ " ,if yes type 1 else 0 " );
		int secret=Utility.readInt();
		 if(secret==1)
			low=mid+1;
		 else if(secret==0)
			high=mid-1;
		 else if(low==(high+1))
				System.out.println("Element is "+high);
				break;	
	}
	
}

/**
 * Sort the string array by insertion sort algorithm.   
 * @param string
 * @param length
 */
public static void insertionSortString(String[] string,int length)
{
	for(int i=1;i<length;i++)
	{
		String value=string[i];
		int hole=i;
		
		while(hole>0 && string[hole-1].compareTo(value)>0)//Comparing the contents
		{
			string[hole]=string[hole-1];
			hole=hole-1;
	    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		string[hole]=value;
	}
	for(int i=0;i<length;i++)
	{
		System.out.print(string[i] +" ");//printing of sorted array
	}
}
/**
 * Convert the integer inputs into integer array
 * @param length
 * @return integer array
 */
public static int[] toNumberArray(int length)
{
	int[] array=new int[length];
	for(int i=0;i<length;i++)
		array[i]=Utility.readInt();
	return array;
	
}
/**
 * Binary search of Integer array
 * @param array
 * @param length
 * @param search
 */
	public static void binarySearchInt(int array[],int length,int search)
	{
		int low=0;
		int high=length-1;
		while(low<high)
		{
			int mid=(high+low)/2;
			if(array[mid]==search)
			{
				System.out.println("Element found at index " +(mid+1));
				break;
			}
			else if(array[mid]>search)
				high=mid-1;
			else if(array[mid]<search)
				low=mid+1;
		}
		if(low==high)
			System.out.println("search not found");			
	}
/**
 * Sorting the array using bubble sort algorithm.
 * @param array
 * @param length
 */
public static void bubbleSort(int array[],int length)
{
	for(int i=0;i<length-1;i++)
	{
		for(int j=0;j<length-i-1;j++)
		{
			if(array[j]>array[j+1])
			{
				int temp=array[j];//swapping logic
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	System.out.println("The sorted array is : ");
	printArray(array);
}
/**
 * to print an array
 * @param array
 */
public static void printArray(int[] array)
{
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i] + " ");
	}
}
/**
 * This function is used to merge the sorted elements into a sorted array.
 * @param left
 * @param right
 * @param finalarray
 */
public static void merge(int[] left,int[] right,int[] finalarray)
{
	int i=0,j=0,k=0;
	while(i<left.length && j<right.length)
	{
		if(left[i]<right[j]) //compares the elements of both the arrays.
		{
			finalarray[k]=left[i];
			i++;
		}
		else
		{	
			finalarray[k]=right[j];
			j++;
		}
		k++;	
	}
	while(i<left.length) //this loop is used to merge the last element remaining in the sorted array.
	{
		finalarray[k]=left[i];
		i++;
		k++;
	}
	while(j<right.length)//this loop is used to merge the last element remaining in the sorted array.
	{
		finalarray[k]=right[j];
		j++;
		k++;
	}
	//printArray(finalarray);
}
/**
 * Purpose of this method is to divide the array to a single unit by calling 
    it recursively.
 * @param finalarray
 */
public static void mergeSort(int[] finalarray)
{
	int length=finalarray.length;
	if(length<2) // this condition is used to exit from the recursion loop.
		return;//if it is divided equal to one then it exits the loop.
	else
	{
		int mid=length/2;
		int[] left=new int[mid];//array to store the left elements
		int[] right=new int[length-mid];//array to store the right elements.
		for(int i=0;i<mid;i++)
		{
           left[i]=finalarray[i];//stores the elements left of mid to left array.
		}                        		
		
		for(int j=mid;j<length;j++)
		{
		    right[j-mid]=finalarray[j];//stores the elements to right of mid to right array.
		}                     
		mergeSort(left);//calls the function recursively.
		mergeSort(right);//calls the function recursively.
		merge(left,right,finalarray);//calls the function to merge the sorted 2 arrays.
		
	}
	
}
public static String wordsfromfile() throws FileNotFoundException
{
	File file=new File("/home/admin142/Desktop/Janhavi/text");
	Scanner sc=new Scanner(file);//Scans the text from the file.
	sc.useDelimiter(" ");//Stores the value into the sc object with the spaces in the words
	String wordsfile="";//String variable is defined the save string.
	while(sc.hasNext())
	{
		wordsfile=wordsfile+sc.next()+" ";
	}
	return wordsfile;
}
/**
 * Match the pattern and do the require changes in the message inputed from 
   the text file.
 * @param user
 * @return
 * @throws Exception
 */
public static String patternMatcher(Userdetails user ) throws Exception
{
	String message=wordsfromfile();//taking in the message string.
	
	
	Pattern pattern=Pattern.compile(REGXNAME);
	Matcher matcher=pattern.matcher(message);
	message=matcher.replaceAll(user.getFirstname());//matching the compile text with the data in the message.
	pattern=Pattern.compile(REGXFULLNAME);
	matcher=pattern.matcher(message);
	message=matcher.replaceAll(user.getFirstname() + " " + user.getLastname());
	pattern=Pattern.compile(REGXMOBILE);
	matcher=pattern.matcher(message);
	message=matcher.replaceAll(user.getMobileno());
	pattern=Pattern.compile(REGXDATE);
	matcher=pattern.matcher(message);
	message=matcher.replaceAll(user.getDate());
	
	return message;
	
}

public static void arrayOfObjects(TaskDetails[] details)
{
   for(int i=0;i<details.length;i++)
	   details[i]=new TaskDetails(); //Allocating memory to the details.
   for(int i=0;i<details.length;i++)
   {
	   System.out.println("Enter the details");
	   details[i].getData();
   }
   for(int i=0;i<details.length;i++)
   {
	   details[i].putdata();
   }
	
}

public static void putWordsintoLinkedList(String[] words_of_file )
{
	
	
}


}
