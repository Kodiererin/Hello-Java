package Questions;

class ListNode 
{
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class a6_mergeSortedLinkedList 
{
	public static void check(ListNode a , ListNode b)
	{
		ListNode pointer = null;
		ListNode head = null;
		if(a.val>=b.val)
			pointer = b;
		else
			pointer = a;
		head = pointer;	
//		Do the Code here!
	}
	public static void main(String[] args) 
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2,null);
		head.next.next = new ListNode(4,null);
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(3);
		head2.next.next = new ListNode(4);
		
		check(head,head2);
		
		ListNode pointer = head;
		System.out.println(pointer.val);
		
//		while(head!=null)
//		{
//			System.out.println(head.val);
//			head = head.next;
//		}
//		while(head2!=null)
//		{
//			System.out.println(head2.val);
//			head2 = head2.next;
//		}
	}
}
