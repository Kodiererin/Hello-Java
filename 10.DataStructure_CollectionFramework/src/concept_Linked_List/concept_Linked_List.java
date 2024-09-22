//		This code is being taken from Pepcoding Youtube Channel.
package concept_Linked_List;
public class concept_Linked_List
{
	public static class Node
	{
		int data;					// data jo save LinkedList Krega woh Integer Datatype Hoga
		Node Next;					// points for the second Node.
	}
//	Node n = new Node();
//	when We create an object of node class then a new node is created.
	public static class LinkedList
	{
		Node head;
		Node tail;
		int size;
	void addLast(int var)
	{
		if(size==0)
		{
			Node n = new Node();
			n.data = var;
			n.Next = null;
			tail = n;
			head = tail;
		}
		else
		{
			Node n = new Node();
			n.data = var;
			n.Next = null;
			tail.Next = n;
			tail = n;
			size++;
		}
		
	}
	}
	public static void main(String[] args) 
	{
		System.out.println("Linked List Formation from scratch");
	}
}