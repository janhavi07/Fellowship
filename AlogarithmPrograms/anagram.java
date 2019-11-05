//this is a trail anagram program.
package AlogarithmPrograms;

public class anagram
{
	static int count=0;
	public static void anagram(String s1,String s2) 
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("NOT AN ANAGRAM");
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					
					{
						if(s1.charAt(i)==s2.charAt(j))
						{
						  count++;	
						}
						
					}
				}
			}
			
			
		}
		if(count==s1.length())
		{
			System.out.println("it is an anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="heart";
		String s2="earth";
		anagram(s1,s2);
		
		
				}

}



	