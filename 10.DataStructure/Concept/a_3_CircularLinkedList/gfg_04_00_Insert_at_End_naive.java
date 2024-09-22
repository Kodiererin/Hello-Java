package a_3_CircularLinkedList;

public class gfg_04_00_Insert_at_End_naive
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		display(insLast(Head,99));
	}
	public static Node insLast(Node head , int data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			head.next = head;
		}
		else
		{
			Node curr = head;
			while(curr.next!=head)
			{
				curr = curr.next;
			}
			curr.next = temp;
			temp.next =head;
		}
		return head;
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
