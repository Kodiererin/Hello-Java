package a_1_Linked_List;
public class o_LL14_2_1_DetectLoop_BigOh_n
{
//	for Getting Time complexity of BigOh n
	static class Node
	{
		int data;
		Node next;
		boolean visited = false;		// this is the change.
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);
		Head.next.next.next.next.next = Head.next.next;
//		You can set your Node and check.
		System.out.println("The Loop Has been Detected?");
		System.out.println(detectLoop(Head));
	}
//	Now checking
	static boolean detectLoop(Node head)
	{
		for(Node p = head ; p!=null ; p = p.next)
		{
			if(p.next.visited)
				return true;
		}
		return false;
	}
}
