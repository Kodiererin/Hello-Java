package a_1_Linked_List;

import a_1_Linked_List.o_LL14_2_1_DetectLoop_BigOh_n.Node;

public class p_LL14_2_2_DetectLoop_BigOh_n
{
	public static void main(String[] args) {
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);
		Head.next.next.next.next.next = Head.next.next;			// Manual Setup.
//		You can set your Node and check.
		System.out.println("The Loop Has been Detected?");
//		System.out.println(detectLoop(Head));
	}
	public static boolean detectLoop(Node head)
	{
		{
			Node temp = new Node(100);
			Node curr = head;
			while(curr!=null)
			{
				if(curr.next==null)
					return false;
				if(curr.next==temp)
					return true;
				Node temp2 = curr;
				temp = curr.next;
				curr.next = curr.next.next;
			}
			return false;
		}
	}
}
