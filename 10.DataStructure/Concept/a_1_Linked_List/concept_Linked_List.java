//		This code is being taken from Pepcoding Youtube Channel.
package a_1_Linked_List;
public class concept_Linked_List
{
	public static class Node01
	{
		int data;					// data jo save LinkedList Krega woh Integer Datatype Hoga
		Node01 Next;					// points for the second Node01.
	}
//	Node01 n = new Node01();
//	when We create an object of Node01 class then a new Node01 is created.
	public static class LinkedList
	{
		Node01 head;
		Node01 tail;
		int size;
	void addLast(int var)
	{
		if(size==0)
		{
			Node01 n = new Node01();
			n.data = var;
			n.Next = null;
			tail = n;
			head = tail;
		}
		else
		{
			Node01 n = new Node01();
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