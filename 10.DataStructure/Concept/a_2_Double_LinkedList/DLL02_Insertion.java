package a_2_Double_LinkedList;

public class DLL02_Insertion
{
	public static void main(String[] args)
	{
//		Just A Sample For Demostration Purpose
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.prev = Head.next;
		Head.next.next = new Node(30);
		Head.next.next.prev = Head.next.next;
		Head.next.next.next = new Node(40);
		Head.next.next.next.prev = Head.next.next.next;
		display(Head);
		InsertBeg(Head,90);
		InsertLast(Head,99);
		InsertAny(Head,22,2);
	}
//	Insert At Begining
	public static void InsertBeg(Node Head , int data)
	{
		Node curr = Head;
		Node Temp = new Node(data);
		Temp.next = curr;
		curr.prev = Temp;
		Head = Temp;
		display(Head);
	}
//	Insert At Last
	public static void InsertLast(Node Head , int data)
	{
		Node temp = new Node(data);
		Node curr = Head;
		while(curr.next!=null)
		{
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		display(Head);
	}
//	Insert At Any Node
	public static void InsertAny(Node Head , int data , int pos)
	{
		Node temp = new Node(data);
		if(pos==1)
		{
			temp.prev = null;				// not so important line although temp prev and next is by default set as null by me.
			temp.next = Head;
			Head.prev = temp;
			Head = temp;
		}
		Node curr = Head;
		for(int i=0 ; i<=pos-2 && curr!=null; i++)
		{
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next.prev = temp;
		curr.next = temp;
		temp.prev = curr.next;
		display(Head);
	}
//	Display the Node
	static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			System.out.print(curr.data+"==>");
		}
		System.out.println();
	}
}
