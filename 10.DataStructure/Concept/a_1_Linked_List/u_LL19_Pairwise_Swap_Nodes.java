package a_1_Linked_List;

public class u_LL19_Pairwise_Swap_Nodes
{
	public static void main(String[] args)
	{
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
		Head.next.next.next = new Node(40);
		Head.next.next.next.next = new Node(50);
		Head.next.next.next.next.next = new Node(60);
		Head.next.next.next.next.next.next = new Node(70);
		System.out.println("This is the Initial Linked List");
		display(Head);
		System.out.println("-----------------------------------------------");
		System.out.println("Paiwrise Swapped Node ");
		display(pairwise_swapData_1(Head));
		System.out.println("-----------------------------------------------");
//		Always go for Efficient Solution. Time Complexity O(N) and Aux. Space = O(1)
		System.out.println("Efficient Pairwise Swapped Node");
		display(pairwise_swapData_2(Head));
		System.out.println("-----------------------------------------------");
	}
//	creating a display method
	public static void display(Node head)
	{
		for(Node curr = head; curr!=null ; curr = curr.next)
		{
			System.out.print(curr.Data+"--->");
		}
		System.out.println("null");
	}
//	Run the loop while we have atleast one Node ahead
//	1). Swap data of current node with next Node.
//	2). Move current two Nodes reference ahead.
//	3).if current.next = null ----> come out of the loop.
//	Time Complexity O(n).

//	Why we should change the nodes instead of data.
//	Because, if the list carry the large data or objects then it would not possible/great to carry such data
//	by this method.
	public static Node pairwise_swapData_1(Node head)
	{
		Node curr = head;
		while(curr!=null && curr.next!=null)
		{
			int temp = curr.Data;
			curr.Data = curr.next.Data;
			curr.next.Data = temp;
			curr = curr.next.next;
		}
		return head;
	}

//	EFFICIENT SOLUTION
//	Time Complexity = O(n) | Auxillary Space = O(1)
//	This method is highly recommended because if we'll take a large object of data then,
//	Swapping Data is not possible. So the better solution is changing the direction of nodes
//	without affecting DATA.
	public static Node pairwise_swapData_2(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node curr = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;
		while(curr!=null && curr.next!=null)
		{
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = curr;
			curr = next;
		}
		prev.next = curr;
		return head;
	}
}
