package LinkedList;
class Node01
{
	String Data;
	Node01 next;
	Node01(String x)
	{
		this.Data = x;
		this.next = null;
	}
}
public class D_LinkedList_InsertAtLast 
{
	public static Node01 insertLast(Node01 head , String x)
	{
		Node01 obj = new Node01(x);
		if(head==null)					// if this condition is not checked then JAVA will throw
			return obj;					// NULL POINTER EXCEPTION
		Node01 curr = head;
		while(curr.next!=null)
			curr = curr.next;
		curr.next = obj;
		return head;
	}
	static void displayNode(Node01 x)			// doubt : NullPointerException is getting thrown...
	{
//		Node01 xyz = x;
		while(x!=null)
		{
			System.out.println(x.Data+" ");
			x = x.next;
		}
	}
	static void recursivePrint(Node01 x)			// null Pointer exception is not getting thrown.
	{
		if(x==null) return;
		System.out.println(x.Data+" ");
		recursivePrint(x.next);
	}
	public static void main(String[] args) 
	{
		Node01 head = null;
		head = insertLast(head,"SANJAY ");
		head = insertLast(head,"KUMAR ");
		head = insertLast(head,"MANDAL ");
		displayNode(head);				// doubt : NullPointerException is getting thrown...
//		recursivePrint(head);			// null Pointer exception is not getting thrown.
	}
}
