package College_MinorProject_LL;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class MinorProject_LinkedList 
{
	public static void main(String[] args) 
	{
//		creating a default Node for Learning purpose which can be changed Further
		System.out.println("Before Binary Sorting ");
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next= new Node(40);
		Head.next.next.next.next.next = new Node(30);
//		recursiveDisplay(Head);
		removeDuplicate(Head);			// problem in the code fix it ASAP!
//		removeDup(Head);
	}
	public static Node sort(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			for(Node cNext = curr.next ; cNext!=null ; cNext = cNext.next)
			{
				if(curr.data>=cNext.data)
				{
					int temp = curr.data;
					curr.data = cNext.data;
					cNext.data = temp;
				}
			}
		}
		return Head;
	}
	public static void removeDuplicate(Node head)
	{
		Node copy = sort(head);
		if(head==null)
		{
			System.out.println("The Linked List Is Empty");
		}
		else
		{
			for(Node dup = copy ; dup!=null ; dup = dup.next)
			{
				if(dup.data==dup.next.data)
				{
					dup.next = dup.next.next;
				}
			}
		}
		recursiveDisplay(copy);
	}
//	public static void removeDuplicate(Node head)
//	{
////		Remove Duplicate Element
////		if(head==null)
////		{
////			System.out.println("The List Is Empty");
////		}
//		for(Node check = head ; check.next.next!=null ; check = check.next)				// check the next function as null pointer exception is throwing.
//		{
//			Node prev = check;
//			for(Node curr = check.next ; curr.next!=null && check.next!=null; curr = curr.next)
//			{
//				if(check.data == curr.data)
//				{
//					Node Temp  = curr.next;
//					prev.next = Temp;
////					prev.next = curr.next;
//				}
//				prev = curr;
////				curr = curr.next;
//			}
//		}
////		head = ;
//		recursiveDisplay(head);
//	}
//	Second Code to check occurence of the element
	public static void removeDup(Node Head)
	{
		Node check = Head , curr = null , prev = null;
		while(check!=null)
		{
			prev = check;
			curr = check.next;
			while(curr!=null)
			{
				if(check.data == curr.data)
				{
//					Node Temp  = curr.next;
//					prev.next = Temp;
					prev.next = curr.next;
				}
				else
				{
					prev = curr;
				}
				curr = curr.next;
			}
			check = check.next;
		}
		recursiveDisplay(Head);
	}
//	To display the reference of the second Element
	public static void checkReference(Node Head)
	{
		for(Node curr = Head ; curr!= null ; curr = curr.next)
		{
			int ctr = 0;
			for(Node point = Head ; point!=null ; point = point.next)
			{
				if(point.data == curr.data)
				{
					ctr++;
				}
				
			}
		}
	}
	public static void recursiveDisplay(Node Head)
	{
		if(Head == null)
			System.out.println("The Linked List Is Empty");		
		while(Head!=null)
		{
			System.out.println(Head.data);
			Head = Head.next;
		}
		System.out.println("------------------------");
	}
}
