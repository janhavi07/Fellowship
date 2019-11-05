package DataStructuresPrograms;
import Utility.*;

public class LinkedList <T>
{
	Node<T> head;
    
	public <T> void insertIntolist(String[] words_of_file)
	{
		Node newnode;//New-node is being defined.
		for(int i=0;i<words_of_file.length;i++)
		{
			newnode=new Node<T>(words_of_file[i]);
			if(head==null)
				head=newnode;
			else
			{
				Node toTransverse=head;
				//Temporary totransverse node is define to transverse from head to last node.
				while(toTransverse.next!=null)
				{
					toTransverse=toTransverse.next;
				}
				//when it exits the while loop new_node is being assigned to the next value of
				//previous node.
				toTransverse.next=newnode;
			}
			
		}
	}
	public<T> void printLinkedList()
	{
		 System.out.println();
		 System.out.println("The list of elements are :");
		 System.out.println();
		 Node toTransverse=head;
		 while(toTransverse.next!=null)
		 {
			 System.out.println(toTransverse.word);
			 toTransverse=toTransverse.next;
		 }
		 System.out.println(toTransverse.word);
		 
		 
	}
	public <T> void addAtEnd(String wordToSearch)
	{
		Node toTransverse=head;
		Node insertword=new Node<T>(wordToSearch);
		while(toTransverse.next!=null)
		{
			toTransverse=toTransverse.next;
		}
		toTransverse.next=insertword;
		insertword.next=null;
		printLinkedList();
	}
	
	public<T> void search(String wordToSearch)
	{
		Node toTransverse=head;
		int position=0,flag=0;
		System.out.println("Word to search is the list is : " +wordToSearch);
		System.out.println("*******Searching********");
		while(toTransverse.next!=null)
		{
			position++;
			if(toTransverse.word.equals(wordToSearch))
			{
				flag=1;//If the search is found then flag is set to one and it exits the loop.
				break;
			}
			toTransverse=toTransverse.next;
		}
		if(flag==1) 
		{
			System.out.println("Word found at position ");
			System.out.print(position);
			deletefrom(position);
		}
		else
		{
		  System.out.println();
		  System.out.println("Word not found ");
		  System.out.println(" '*Therefore we are adding to the list*' ");
		  System.out.println("Now,");
		  addAtEnd(wordToSearch);
		}
		
	}
		
	
	public<T> void deletefrom(int index)
	{
		//If the index is at first position.
		if(index==0)
			head=head.next;//head is assigned to head.next.
		else
		{
			Node toTransverse=head;
			Node nextNode=null;
			for(int i=0;i<index-2;i++)
			{
				toTransverse=toTransverse.next;
			}
			nextNode=toTransverse.next;
			toTransverse.next=nextNode.next;
		}
		System.out.println();
		System.out.println("After deleting the element ");
		printLinkedList();
		
	}
	
	

}
