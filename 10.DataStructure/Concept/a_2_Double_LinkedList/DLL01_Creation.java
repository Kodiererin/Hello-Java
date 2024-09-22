
package a_2_Double_LinkedList;

public class DLL01_Creation
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
	}
//	display the Doubly Linked List.
//	The Display method of the linked List is Same as Single Linked List
	static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			System.out.print(curr.data+"==>");
		}
	}

}
