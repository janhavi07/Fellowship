package AlogarithmPrograms;


import java.util.Scanner;
import Utility.*;

public class Guessgame 
{
	public static void main(String[] args)
	{
		int k=Integer.parseInt(args[0]);
		int n=(int) Math.pow(2, k);
		System.out.println("Guess the number between 0 and " +(n-1));
		Utility.guessGame(n);


	}

}
