package a_1_Linked_List;

public class q_LL15_DetectLoop_FloydCycle_1
{
//	Floyd Cycle Detection of Loop
//	This is the best technique to detect the loop
//	This technique take : O(1) Auxillary Space and works in O(n) without changing anything of the list.
	public static boolean detectLoop(Node head)
	{
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next;
			if(slow == fast)
				return true;
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
		System.out.println(detectLoop(Head));
	}
}
