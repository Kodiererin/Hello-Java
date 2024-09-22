package a_1_Linked_List;

public class s_LL17_Segregate_Even_Odd_Nodes
{
	public static void main(String[] args)
	{
		Node Head = new Node(17);
		Head.next = new Node(15);
		Head.next.next = new Node(8);
		Head.next.next.next = new Node(12);
		Head.next.next.next.next = new Node(10);
		Head.next.next.next.next.next = new Node(5);
		Head.next.next.next.next.next.next = new Node(4);
		System.out.println("Initial List");
		display(Head);
		System.out.println("\nAfter Segregation");
		display(segregate(Head));
	}
	public static Node segregate(Node head)
	{
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		for(Node curr = head ; curr!=null ; curr = curr.next)
		{
			if(curr.Data%2==0)
			{
				if(evenStart==null)
				{
					evenStart = curr;
					evenEnd = evenStart;
				}
				else
				{
					evenEnd.next = curr;
					evenEnd = evenEnd.next;
				}
			}
			else
			{
				if(oddStart==null)
				{
					oddStart = curr;
					oddEnd = oddStart;
				}
				else
				{
					oddEnd.next = curr;
					oddEnd = oddEnd.next;
				}
			}
		}
//			after for loop
			if(oddStart==null || evenStart == null)
				return head;
			evenEnd.next = oddStart;
			oddEnd.next = null;
			return evenStart;
		}
	public static void display(Node head)
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.Data+"->");
			curr = curr.next;
		}
		System.out.print("null");
	}
}
