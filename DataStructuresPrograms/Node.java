package DataStructuresPrograms;

public class Node<T>
{
	 String word;
	 int data;
	 Node<T> next;
	 Node(String word)
	 {
		 this.word=word;
		 next=null;
	 }
	 Node(int data)
	 {
		 this.data=data;
		 next=null;
	 }
	
}
