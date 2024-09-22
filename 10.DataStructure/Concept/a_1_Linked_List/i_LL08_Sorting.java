package a_1_Linked_List;

public class i_LL08_Sorting
{
	public static Node binarySort(Node Head)
	{
		Node curr = Head;
		for(;curr!=null ; curr = curr.next)
		{
			for(Node nextCurr = curr.next ; nextCurr!=null ; nextCurr = nextCurr.next)
			{
				if(curr.Data<=nextCurr.Data)
				{
					int temp = curr.Data;
					curr.Data = nextCurr.Data;
					nextCurr.Data = temp;
				}
			}
		}
//		Head = curr;
		return Head;
	}
	public static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr = curr.next)
		{
			System.out.println(curr.Data);
		}
	}
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		System.out.println("Before Binary i_Sorting ");
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next= new Node(50);
		Head.next.next.next.next.next = new Node(60);
//		Before i_Sorting
		display(Head);
//		after i_Sorting
		System.out.println("After Binary i_Sorting");
		Node Sort = binarySort(Head);
		display(Sort);
	}
}
