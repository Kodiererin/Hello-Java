package a_3_CircularLinkedList;

public class gfg_01CLL_Intro
{
	public static void main(String[] args)
	{
//		Creating our first Circular Linked List
//		Cirular Linked List is Same as Linked List but in CLL we have to maintain tail which is the
//		end point of the List and whose next = head..
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);

//		here No need of tail because we are alloting nodes dynamically so...
		Head.next.next.next.next = Head;
	}
}
