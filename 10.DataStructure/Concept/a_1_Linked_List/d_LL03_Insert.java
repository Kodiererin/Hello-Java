package a_1_Linked_List;
class Node03
{
	int data;
	Node03 next;
	Node03(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class d_LL03_Insert
{
	static Node03 insertBegin()					// this function is for Insert at Begin
	{
		Node03 head = new Node03(10);
		head.next= new Node03(20);
		head.next.next = new Node03(30);
		head.next.next.next = new Node03(40);
		head.next.next.next.next = new Node03(50);
		return head;
	}
	static Node03 insLast(Node03 head , int data)			// this function is for insert at last.
	{
		Node03 temp = new Node03(data);
		Node03 curr = head;
		if(head==null)
		{
			head = temp;
		}
		while(curr.next!=null)
		{
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	static Node03 insAny(Node03 head , int data , int pos)			// this function is for insertion at any position
	{
		Node03 temp = new Node03(data);
		if(pos==1)
		{
			temp.next = head;
			head = temp;
			return head;
		}
		Node03 curr = head;
		for(int i=0 ; i<=pos-2 && curr.next!=null	; i++ )
		{
			curr = curr.next;
		}
		if(curr == null)
		{
			return head;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
	static void display(Node03 head	)						// this function is for Display.
	{
		Node03 curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data+"----->");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		System.out.println("Kemcho Mota Bhai");
		Node03 head = null;
		head = insertBegin();
			display(head);
		head = insLast(head,60);
			display(head);
		head = insAny(head,99,2);
			display(head);
	}
}
