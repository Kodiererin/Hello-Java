package a_3_CircularLinkedList;

//	Time Complexity -> O(N)
//	But it takes some auxillary Space.so...

public class gfg_03_1_Insert_At_Begin_Efficient
{
//	by Maintaining A tail pointer we can make the time complexity of Insert at Begin O(1)
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Node tail = new Node(60);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = new Node(50);
		Head.next.next.next.next.next= tail;
		tail.next = Head;
		System.out.println("After Insertion");
		display2(Head);

		System.out.println("After Insertion");
		display2(insBeg(Head,tail,999));
	}
	public static Node insBeg(Node head , Node tail , int data)
	{
		if(head==null)
		{
			head = new Node(data);
			tail = head;
		}
		else
		{
			Node p = new Node(data);
			p.next = head;
			tail.next = p;
			head = p;
		}
		return head;
	}
	public static void display2(Node head)
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
