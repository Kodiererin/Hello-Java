package a_2_Double_LinkedList;

public class DLL_03_Deletion
{
	public static void main(String[] args)
	{
//		Just A Sample For Demostration Purpose
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.prev = Head.next;
		Head.next.next = new Node(30);
		Head.next.next.prev = Head.next.next;
		Head.next.next.next = new Node(40);
		Head.next.next.next.prev = Head.next.next.next;
		display(Head);
		delFirst(Head);
		delLast(Head);
	}
	public static void delFirst(Node Head)
	{
		if(Head==null)
			System.out.println("The Linked List is Empty");
		if(Head.next == null)
			System.out.println("The Next Node Is Emtpy");
		else
		{
			Head = Head.next;
			Head.prev = null;
			display(Head);
		}
	}
//	delLast Function
	public static void delLast(Node Head)
	{
		if(Head ==null)
			System.out.println("THe List Is Empty");
		if(Head.next == null)
			System.out.println("The List Has only One Node");
		Node curr = Head;
		while(curr.next.next!=null)
		{
			curr = curr.next;
		}
		curr.next = null;
		display(Head);
	}
//	Display the Node
	static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			System.out.print(curr.data+"==>");
		}
		System.out.println();
	}
}
