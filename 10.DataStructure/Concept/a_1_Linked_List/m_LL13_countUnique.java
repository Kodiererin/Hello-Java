package a_1_Linked_List;

public class m_LL13_countUnique
{
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);
		display(Head);
		countUnique(Head);
	}
	public static void countUnique(Node Head)
	{
		for(Node point = Head ; point!=null ; point = point.next)
		{
			int ctr=0;
			for(Node curr = Head ; curr!=null ; curr = curr.next)
			{
				if(point.Data == curr.Data)
				{
					ctr++;
				}
			}
			if(ctr==1)
			{
				System.out.println(point.Data);
			}
		}
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
