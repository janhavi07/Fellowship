package Utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import AlogarithmPrograms.*;
import FunctionalPrograms.*;

import LogicalProgram.*;
public class Utility 
{
	public static Scanner s=new Scanner(System.in);
	public static char[][] board=new char[3][3];
	public static char turn='X';
	//public static String[] words_of_file=new String[1000];
	//reading all integer input
	public static int readInt()
	{
	return s.nextInt();
	}
	//reading all double inputs
	public static double readDouble()

	{
		return s.nextDouble();
	}
	//reading all strings
	public static String readString()

	{
		return s.next();
	}
	//reading all float values
	public static float readFlaot()

	{
		return s.nextFloat();
	}
	
	// @ @ TictacToe Program
    public static void ticTacToe()
     {
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			board[i][j]='_';//printing the board
		}
	}
	play();
    }
    public static void play()
	{
	printBoard();
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

public static String[] wordsToArray() throws FileNotFoundException
{
	File file=new File("/home/admin142/Desktop/Janhavi/text");
	Scanner sc=new Scanner(file);
	sc.useDelimiter(" ");
	String storeAs="";
	while(sc.hasNext())
	{
		storeAs=storeAs+sc.next()+" ";
	}
	String[] words_of_file=storeAs.split(" ");
	return words_of_file;
}
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


public static char[] convertToLowerCase(String s1)
{
	char[] charArray=s1.toLowerCase().toCharArray();
	return charArray;
}

public static boolean anagramLogic(char[] charArray1, char[] charArray2) {
	
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	if(Arrays.equals(charArray1, charArray2))
	return true;
	else
	return false;
	
}


public static void prime(int lower,int upper)
{
	for(int i=lower;i<=upper;i++)
	{
		if(i==0 || i==1)
			continue;
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
	System.out.println("mid is "+mid);
	System.out.println("low is "+low);
	System.out.println("high is "+high);
	
}







}