package a_1_Linked_List;
//import a_1_Linked_List.g_LL06_Reverse;
import java.util.ArrayDeque;
import java.util.Deque;

public class y_LL23_PalindromeList
{
	static class Node
	{
		char data;
		Node next;
		Node(char data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args)
	{
//		Creating two Nodes to Understand UJJWAL
		System.out.println("List 1");
		Node head = new Node('R');
		head.next = new Node('A');
		head.next.next = new Node('D');
		head.next.next.next = new Node('A');
		head.next.next.next.next = new Node('R');
		System.out.println("Naive Method -> Palindrome List?"+isPalindrome(head));
		System.out.println("Efficient Method -> Palindrome List?"+efficient_isPalindrome(head));
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("List2");
		Node head1 = new Node('G');
		head1.next = new Node('E');
		head1.next.next = new Node('E');
		head1.next.next.next = new Node('K');
		System.out.println("Naive Method -> Palindrome List?"+isPalindrome(head1));
		System.out.println("Efficient Method -> Palindrome List?"+efficient_isPalindrome(head1));
	}
//	Naive Method -> By using Stacks.
//	Time complexity - Theta(n)
//	Auxillary Space - Theta(n)
	public static boolean isPalindrome(Node head)
	{
		Deque<Character> stack = new ArrayDeque<>();
		for(Node curr = head ; curr!=null ; curr = curr.next)
		{
			stack.push(curr.data);
		}
		for(Node curr = head ; curr!=null ; curr = curr.next)
		{
			if(stack.pop()!=curr.data)
			{
				return false;
			}
		}
		return true;
	}
//	This method is recommended because
//	Time Complexity = Theta(N) time
//	Auxillary Space = Theta(1) Space.
	public static boolean efficient_isPalindrome(Node head)
	{
		if(head==null)
			return true;
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		Node rev = reverseList(slow.next);
		Node curr = head;
		while(rev!=null)
		{
			if(rev.data != curr.data)
			{
				return false;
			}
			rev = rev.next;
			curr = curr.next;
		}
		return true;
	}
	static Node reverseList(Node head)
	{
		if(head==null)
		{
			return head;
//			System.out.println("Linked List is Empty");
		}
		else
		{
			Node curr = head;
			Node prev = null;
			while(curr!=null)
			{
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;				// this can also be written as curr = curr.next;
			}
			head = prev;
		}
		return head;
	}
}
