package a_3_CircularLinkedList;

public class gfg_02CLL_Traverse_Display
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		display(Head);
		display2(Head);
	}
//	method-1 While loop
	public static void display(Node head)
	{
		if(head==null)
			System.out.println("The List is Empty");
		Node curr = head;
		while(curr.next!=head)
		{
			System.out.print(curr.data+"--->");
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
//	method-2 do-While Loop
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
