package a_1_Linked_List;

//1. Detect Loop Using Floyds Detection algorithm.
//2. Move The slow reference to the beginiing of the Linked List,and keep the fast reference to the meeting point.
//3. Now move the slow and fast reference at a same speed. They both will meet at the first point of the loop.
public class r_LL16_Detect_n_RemoveLoop
{
	public static void detect_N_remove(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				break;
		}
		if(slow!=fast)
			return;
		slow=head;
		while(slow.next!=fast.next)
		{
			slow = slow.next;
			fast = fast.next;
		}
		fast.next=null;
		display(head);
	}
	static void display(Node head)
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.println(curr.Data);
			curr = curr.next;
		}
	}
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next = new Node(20);
		Head.next.next.next.next.next = new Node(30);
		Head.next.next.next.next.next.next = Head.next.next;
//		System.out.println(detectLoop(Head));
		detect_N_remove(Head);
	}
}
