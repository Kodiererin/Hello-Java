package a_1_Linked_List;
class Node04
{
	int data;
	Node04 next;
	Node04(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class e_LL04_Delete
{
	static Node04 insertBegin()					// this function is for Insert at Begin
	{
		Node04 head = new Node04(10);
		head.next= new Node04(20);
		head.next.next = new Node04(30);
		head.next.next.next = new Node04(40);
		head.next.next.next.next = new Node04(50);
		return head;
	}
	static Node04 delBeg(Node04 head)
	{
		if(head==null)
			head = null;
		if(head!=null)
		{
			head = head.next;
		}
		return head;
	}
	static Node04 delEnd(Node04 head)
	{
		if((head==null) || (head.next==null))
		{
			return null;
		}
		Node04 curr = head;
		while(curr.next.next!=null)
		{
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
	static void display(Node04 head	)						// this function is for Display.
	{
		Node04 curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data+" -----> ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Node04 head = insertBegin();
			display(head);
		head = delBeg(head);
			display(head);
		head = delEnd(head);
			display(head);
	}
}
