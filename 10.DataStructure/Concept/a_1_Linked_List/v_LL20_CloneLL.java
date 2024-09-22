//	Problem in the Code  Recheck and Verify

package a_1_Linked_List;
import java.util.*;
//	Aim : Clone Linked List with Random Java Reference.
public class v_LL20_CloneLL
{
	static class Node
	{
		int data;
		Node next;
//		creating a random in the Node class
		Node random;
		Node(int x)
		{
			this.data = x;
			this.next = this.random = null;
		}
	}
	public static void main(String[] args)
	{
//		I am creating a LL which have multiple loops
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(45);
		Head.next.next.next = new Node(23);
		Head.next.next.next.next = new Node(54);
		Head.next.next.next.next.next = new Node(97);
//		creating multiple loops of some nodes.
		Head.next = Head.next.next.next;
		Head.next.next.next = Head.next;
		Head.next.next.next.next = Head.next.next;
		Head.next.next = Head.next.next.next.next;

//		Now the question arises how we will make a clone of a Linked List having multiple loops?
//		Method-1 Hashing
//		1. Create a Hashmap m.
//		2. Do following for every node curr in the list -> m.put(curr,newNode(curr.data)))
//		3. Traverse the given list again and do the following,
//				Node clone = m.get(curr);
//				clone.next = m.get(curr.next);
//				clone.random = m.get(curr.random);
//		4. Return m[n]

//		My Hashmap Concept is not clear no I dont know why the code is not running.
		Node clone_hashmap(Node head)
		{
			Map<Node,Node>m = new HashMap<Node,Node>();
			for(Node curr = head ; curr!=null; curr = curr.next)
			{
				m.put(curr , new Node(curr.Data));
			}
			for(Node curr = head ; curr!=null ; curr= curr.next)
			{
				Node clone = m.get(curr);
				clone.next = m.get(curr.next);
				clone.random = m.get(curr.random);
			}
			return m.get(head);
		}

//		Creating an Efficient Solution
//		1. Create Clone Nodes and Insert in the given list in the alternative position.
//		2. Connect the Clone Nodes.
//		3. Seperate Original and Clone Nodes.


		public static Node cloneEfficient(Node head)
		{
//			Step : 1
			Node curr = head;
			while(curr1=null)
			{
				Node next = curr.next;
				curr.next = new Node(curr.Data);
				curr.next.next = next;
				curr = next;
			}
//			Step : 2
			for(Node curr = head; curr!=null ; curr = curr.next.next)
			{
//				creating a random in the Node class
				curr.next.random = (curr.random==null)?null:curr.random.next;
			}
			Node head2 = head.next;
			Node clone = head2;
			for(Node curr = head2 ; curr!=nulll ; curr = curr.next)
			{
				curr.next = curr.next.next;
				clone.next = clone.next?clone.next.next:null;
				clone = clone.next;
			}
			return head2;
		}

	}
}
