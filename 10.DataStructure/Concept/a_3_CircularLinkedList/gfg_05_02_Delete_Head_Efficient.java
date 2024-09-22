package a_3_CircularLinkedList;

public class gfg_05_02_Delete_Head_Efficient
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		System.out.println("The Updated Head is");
		display(delHead(Head));
	}
	public static Node delHead(Node head)
	{
		if((head==null) || (head.next==null)) return null;
		head.data = head.next.data;
		head.next = head.next.next;
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
