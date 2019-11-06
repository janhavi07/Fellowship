package DataStructuresPrograms;
import Utility.*;
public class BalancedParenthesis 
{
	Stack stack;
	public BalancedParenthesis()
	{
		stack=new Stack();//Stack class Object is created to call all the functions of stack.		
		
	}
	public boolean balancedExp(char[] characters)
    {
		for(int i=0;i<characters.length;i++)
		{
			if(characters[i]=='(')
			{
				try
				{
				  stack.push(characters[i]);//if it matches '(' the push method is performed. 
				}
				
				catch(Exception exception)
				{
					System.err.println("ERR");
				}
			}
			if(characters[i]==')')
			{
				stack.pop();//if ')' is present than pop method is called
			}
		}
		System.out.println("To balance out the brackets the length of top should be zero ");
		System.out.println("And the lenght of top is " +stack.top + " therefore, it is ");
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
    }

	public static void main(String[] args)
	{
		BalancedParenthesis obj=new BalancedParenthesis();
		System.out.println("Enter the Expression given");
		char[] characters=Utility.readString().toCharArray();
        if(obj.balancedExp(characters))
        	System.out.print("Balanced Parenthesis");
        else
        	System.out.print("Not Balanced Parenthesis");
	}

}
