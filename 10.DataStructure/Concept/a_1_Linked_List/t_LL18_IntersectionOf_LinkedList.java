package a_1_Linked_List;

//	Given the Linked List
//	We have to find the Intersection Point
//	Two references of the Linked list is given and we have to find the interction point.
public class t_LL18_IntersectionOf_LinkedList
{
//	Method 1 -> By using Hash Table
	public static void hshTable(Node head , Node head2)
	{
//		this will take O(m)Time and O(n) auxillary space
	}
//	Method 2 -> Time complexity O(m+n) and Auxillary Space O(1)
	public static void lessSpace(Node head1 , Node head2)
	{
//		1. Count the number of nodes in both the list.
//			Let the count be c1 and c2.
//		2. Traverse the Bigger list (c2-c1) times.
//		3.	Traverse both the listy6 simultaneously until we get a common node.
	}
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);

		Node Head2 = new Node(99);
		Head2.next = Head.next;
		display(Head);
		System.out.println("------------------");
		display(Head2);
	}
	public static void display(Node Head)
	{
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.Data);
			curr = curr.next;
		}
	}
}
