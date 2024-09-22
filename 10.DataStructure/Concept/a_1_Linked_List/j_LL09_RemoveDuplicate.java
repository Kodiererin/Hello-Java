package a_1_Linked_List;

//import College_MinorProject.Node;

public class j_LL09_RemoveDuplicate
{
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next= new Node(40);
		Head.next.next.next.next.next = new Node(30);
		display(Head);
		removeDuplicate(Head);
	}
	@SuppressWarnings("null")
	public static void removeDuplicate(Node Head)
	{
		Node prev = null;
		for(Node point = Head ; point!=null ; point = point.next)
		{
			prev = point;
			for(Node curr = point ; curr!=null ; curr = curr.next)
			{
				if(point.Data == curr.Data)
				{
					Node temp = curr.next;
					prev.next = temp;
				}
				else
				{
					prev = curr;
				}
			}
		}
		display(Head);
	}
	public static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr =curr.next)
		{
			System.out.print(curr.Data+"--->");
		}
		System.out.println();
	}
}
