package a_1_Linked_List;

public class k_LL10_SecondLargestElement
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
//		findSecondLargest(Head);
		findSecondLargestElement2(Head);
	}
	public static void findSecondLargest(Node Head)
	{
//		int element=0;
//		int secondElement=0;
		for(Node point = Head ; point!=null ; point = point.next)
		{
			for(Node curr = point.next ; curr!=null ; curr = curr.next)
			{
				if(point.Data<=curr.Data)
				{
					int data = curr.Data;
					curr.Data = point.Data;
					point.Data = data;
				}
			}
		}
		System.out.println("The Second Largest Element is "+Head.next.Data);
	display(Head);
	}
	public static void findSecondLargestElement2(Node Head)
	{
		int first = 0;
		int second;
		for(Node p = Head ; p!=null ; p = p.next)
		{
			for(Node q = Head ; q!=null ; q = q.next)
			{
				if(p.Data>=q.Data)
				{
					first = p.Data;
				}
				else
					first = q.Data;
			}
		}
		System.out.println(first);
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
