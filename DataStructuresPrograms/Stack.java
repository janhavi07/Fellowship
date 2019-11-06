package DataStructuresPrograms;
import Utility.*;

public class Stack
{
	 char[] stackchar;//this is array where data is manipulated
	 int top;// top the the variable which defines the position of the element in the stack;
	public Stack()
	{
		top=0;
		stackchar=new char[20];
	}
	
	public void push(char character) throws Exception
	{
		stackchar[top]=character;
		top++;
		System.out.println("Value of top is " +top);
		
	}
	public void pop()
	{
		top--;
	   stackchar[top]=0;
	}
	public void show()
	{
		for(char c: stackchar)
		{
			System.out.print(c +" ");
		}
		
	}
	public boolean isEmpty()
	{
		if(top<=0)
			return true;
		else
			return false;
	}
	
}
