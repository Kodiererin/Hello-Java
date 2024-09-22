package a_3_CircularLinkedList;

public class gfg_04_01_Insert_At_End_Eficient
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		display(insLast(Head,999));
	}
	public static Node insLast(Node head , int data)
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
			int t = temp.data;
			temp.data = head.data;
			head.data = t;
			return temp;
		}
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
