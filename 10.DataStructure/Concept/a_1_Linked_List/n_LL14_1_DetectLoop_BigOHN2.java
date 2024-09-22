package a_1_Linked_List;

public class n_LL14_1_DetectLoop_BigOHN2
{
//	if Tail is Not given then
//	We'll check if any of the element is have the same address to its previous element
	public static boolean detectLoop(Node Head)
	{
		if(Head==null)
			return false;
		else
		{
			for(Node p = Head ; p!=null ; p = p.next)
			{
				for(Node q = Head ; q!=p ; q = q.next)
				{
					if(p.next==q)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);
		Head.next.next.next.next.next = Head.next.next;
//		display(Head);
		System.out.println(detectLoop(Head));
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
