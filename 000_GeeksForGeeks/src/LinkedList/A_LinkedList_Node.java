package LinkedList;
//	GFG Video 4
//	Learning to create a Node and Printing Linked List...
class Node
{	
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next = null;				// this line is optional because in Java byDefault declared Variable is always null.
	}
}
public class A_LinkedList_Node 
{
	public static void main(String[] args) 
	{
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
	}
	public static void printList(Node head)
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}
