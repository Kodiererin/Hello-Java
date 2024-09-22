package a_1_Linked_List;

public class h_LL07_RecursiveReverse
{
	public static void display(Node Head)
	{
		Node curr = Head;
		while(curr!=null)
		{
			System.out.print(curr.Data+"--->");
			curr = curr.next;
		}
		System.out.println("null");
	}
//	recursive Reverse of The Linked List Method One
	public static Node recReverse1(Node curr,Node prev)
	{
		if(curr==null)
			return prev;
		Node next = curr.next;
		curr.next = prev;
		return recReverse1(next,curr);
	}
	public static Node recReverse2(Node Head)
	{
		if(Head==null || Head.next == null)
		{
			return Head;
		}
		Node rest_Head = recReverse2(Head.next);
		Node rest_Tail = Head.next;
		rest_Tail.next = Head;
		Head.next = null;
		return rest_Head;
	}
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		System.out.println("The Initial Node ");
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next= new Node(50);
		Head.next.next.next.next.next = new Node(60);
//		first Display the Initial Linked List
		display(Head);
//		Recursive Reverse of the Linked List Part 1
		System.out.println("Recursive Reverse of The Reversed List Method 1");
			Node reverseHead = recReverse1(Head,null);
			display(reverseHead);
//		Recursive Reverse of the Linked List by Recursion Part 2
		System.out.println("Recursive Reverse of The First Reversed List Method 2");
			Node reverseHead2 = recReverse2(reverseHead);
			display(reverseHead2);
	}
}
