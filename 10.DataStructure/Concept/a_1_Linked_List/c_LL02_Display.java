package a_1_Linked_List;
public class c_LL02_Display
{
	public static void displayLL(Node head)
	{
		Node curr = head;				// in We Java we create a reference of a Node whereas in C we create a pointer of a Node
		while(curr!=null)
		{
			System.out.print(curr.Data+"--->");
			curr = curr.next;
		}
		System.out.println();
	}
//	recursive Display
	public static void recursiveDisplay(Node Head)
	{
		if(Head == null)
			System.out.println("The Linked List Is Empty");
		while(Head!=null)
		{
			System.out.println(Head.Data);
			Head = Head.next;
		}
	}
	public static void main(String[] args)
	{
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		displayLL(head);
		System.out.println("Recursive Display");
		recursiveDisplay(head);
	}
}
