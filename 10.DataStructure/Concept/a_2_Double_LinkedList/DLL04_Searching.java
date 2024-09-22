package a_2_Double_LinkedList;

public class DLL04_Searching
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
		Node Tail = new Node(50);
		Head.next.next.next.next = Tail;
		Tail.prev = Head.next.next.next;
		displayMethod2(Head , Tail);
		search(Head , Tail , 20);
		search(Head , Tail , 50);
		search(Head , Tail , 5);
		search(Head , Tail , 30);
	}
	public static void search(Node Head , Node Tail , int data)
	{
		Node curr = Head;
		Node leg = Tail;
		if(curr.data == data)
		{
			System.out.println("The Element Found at the Begining ");
		}
		if(leg.data == data)
		{
			System.out.println("The Element found At the Last");
		}
		else
		{
			int ctr=0;
			while(curr!=null)
			{
				ctr++;
				if(curr.data==data)
				{
					System.out.println("The Element Found at "+ctr);
					break;
				}
				else
					curr  = curr.next;
			}
			if(ctr==0)
			{
				System.out.println("The Element Not Found");
			}
		}
	}
	static void displayMethod2(Node Head , Node Tail)
	{
		for(Node curr = Head ; curr!=Tail; curr = curr.next)
		{
			System.out.print(curr.data+"-->");
		}
		System.out.println(Tail.data);
	}
}
