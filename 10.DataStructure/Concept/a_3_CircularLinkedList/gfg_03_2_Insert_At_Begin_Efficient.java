package a_3_CircularLinkedList;

public class gfg_03_2_Insert_At_Begin_Efficient
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		display(insBeg(Head,999));
	}
//	Optimising the Code
	public static Node insBeg(Node head , int data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			temp.next = temp;
			return temp;
		}
		else
		{
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return head;
		}
	}
	public static void display(Node head)
	{
		Node curr = head;
		while(curr.next!=head)
		{
			System.out.print(curr.data+"--->");
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
}
