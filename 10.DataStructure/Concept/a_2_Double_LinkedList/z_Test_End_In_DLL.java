package a_2_Double_LinkedList;

public class z_Test_End_In_DLL
{
	static Node Head;
	static Node End;
	public static void create()
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.prev = Head.next;
		Head.next.next = new Node(30);
		Head.next.next.prev = Head.next.next;
		Head.next.next.next = new Node(40);
		Head.next.next.next.prev = Head.next.next.next;
		End = Head.next.next.next ;
		display(Head , End);
	}
	public static void display(Node Head , Node End)
	{
		for(Node curr = Head ; curr!=End; curr = curr.next)
			System.out.println(curr.data);
		System.out.println(End.data);
	}
	public static void main(String[] args)
	{
		create();
//		display();
	}
}
