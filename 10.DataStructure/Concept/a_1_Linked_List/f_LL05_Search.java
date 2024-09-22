package a_1_Linked_List;

public class f_LL05_Search
{
	static Node head = null;
	static void getData()
	{
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(20);
	}
	static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.print(p.Data+" -----> ");
			p = p.next;
		}
		System.out.println("null");
	}
	static void search(int x)
	{
		if(head==null)
		{
			System.out.println("The Linked List Is Empty");
		}
		else
		{
			int ctr=0;
			Node p = head;
			while(p!=null)
			{
				if(x==p.Data)
				{
					ctr++;
					System.out.println(p.Data+" found at Node No "+ctr);
				}
				else
				{
					ctr++;
				}
				p = p.next;
			}
			if(ctr==0)
			{
				System.out.println(x+" not found in the Linked List ");
			}
		}
	}
	public static void main(String[] args)
	{
		getData();
		display();
		search(20);
	}
}