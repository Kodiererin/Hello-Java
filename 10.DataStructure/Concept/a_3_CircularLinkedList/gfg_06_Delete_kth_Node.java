package a_3_CircularLinkedList;

public class gfg_06_Delete_kth_Node
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = Head;
		System.out.println("The Updated Head is");
		display(delHead(Head,2));
	}
	public static Node delHead(Node head , int k)
	{
		if(head==null) return null;
		if(k==1)
		{
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
		Node curr = head;
		for(int i=0 ; i<k-1 ; i++)
		{
			curr = curr.next;
		}
		curr.next = curr.next.next;
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
