package a_3_CircularLinkedList;

public class gfg_03_0_Insert_at_Begin_Naive
{
//	Naive Method Time Complexity = O(n)
	public static Node insertBeg(Node head , int data)
	{
		Node temp = new Node(data);
		if(head==null)
			temp.next = temp;
		else
		{
			Node curr = head;
			while(curr.next!=head)
			{
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
		return temp;
	}
//	Efficient Solution Time Complexity = O(1)
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);

		Node tail = new Node(50);
		Head.next.next.next.next = tail;
		tail.next = Head;
//		Head.next.next.next.next = Head;
		System.out.println("Before Insertion ");
		display(Head);
		System.out.println("Naive Solution ");
		display(insertBeg(Head,999));
	}
	public static void display(Node head)
	{
		if(head==null)
			System.out.println("The List is Empty");
		Node curr = head;
		do {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}while(curr.next!=head);
		System.out.println(curr.data);
	}
}
