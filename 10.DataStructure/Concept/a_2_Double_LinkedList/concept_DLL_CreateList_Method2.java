package a_2_Double_LinkedList;
import java.util.Scanner;
public class concept_DLL_CreateList_Method2
{
	static Node Head = null;
	public static void create()
	{
		System.out.println("Creating A Doubly Linked List");
		System.out.println("Enter The Data");
		Scanner sc = new Scanner(System.in);
		Node temp = new Node(sc.nextInt());
		if(Head==null)
		{
			Head = temp;
		}
		{
			Node copy = Head;
			System.out.println("Do you want to enter more Data");
			System.out.println("If Yes Then Press 0 else Press Any Key"	);
			int x = sc.nextInt();
			if(x==0)
			{
				while(x==0)
				{
					copy = Head;
					System.out.println("Enter Data That You want to Enter");
					temp = new Node(sc.nextInt());
					temp.next = copy;
					copy.prev = temp;
					Head = temp;
					System.out.println("Do You Want to Continue");
					x = sc.nextInt();
				}
			}
		}
		display(Head);
	}
	static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			System.out.print(curr.data+"==>");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		create();
	}
}
