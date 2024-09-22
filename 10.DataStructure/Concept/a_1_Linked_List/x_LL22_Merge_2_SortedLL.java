package a_1_Linked_List;

public class x_LL22_Merge_2_SortedLL
{
	public static void main(String[] args)
	{
//		Creating 2 Linked List which are sorted respectively.
		Node head = new Node(10);
		head.next = new Node(34);
		head.next.next = new Node(45);
		head.next.next.next = new Node(56);
		head.next.next.next.next = new Node(87);
		System.out.println("The First List ");
		display(head);
//		--------------------------------------------------------
		Node head2 = new Node(8);
		head2.next = new Node(12);
		head2.next.next = new Node(47);
		head2.next.next.next = new Node(55);
		head2.next.next.next.next = new Node(98);
		System.out.println("The Second List");
		display(head2);
//		---------------------------------------------------------
		display(sortedMerge(head,head2));
	}
	public static Node sortedMerge(Node head1 , Node head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		Node head = null;
		Node tail = null;
		if(head1.Data<head2.Data)
		{
			head = head1;
			tail = head1;
		}
		else
		{
			head = head2;
			tail = head2;
			head2 = head2.next;
			while(head1!=null && head2!=null)
			{
				if(head1.Data<head2.Data)
				{
					tail.next = head1;
					tail = head1;
					head1 = head1.next;
				}
				else
				{
					tail.next = head2;
					tail = head2;
					head2 = head2.next;
				}
			}
//			agar koi bhi list empty ho gya toh uske baad ka element automatically
//			naya list ke saath link ho jaata h
			if(head1==null)
			{
				tail.next = head2;
			}
			else
			{
				tail.next = head1;
			}
		}
		return head;
	}

	public static void display(Node head)
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.Data+"->");
			curr = curr.next;
		}
		System.out.println();
	}
}
