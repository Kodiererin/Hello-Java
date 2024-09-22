package a_1_Linked_List;

import java.util.Scanner;

public class g_LL06_Reverse
{
	static Node head;
	static void createList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Data in the Node ");
		int x = sc.nextInt();
		Node temp = new Node(x);
		if(head == null)
		{
			head = temp;
		}
		{
			System.out.println("Do You want to Continue ");
			Node p = head;
			int choice = sc.nextInt();
			if(choice>0)
			{
				while(choice>0)
				{
					temp = new Node(sc.nextInt());
					p.next = temp;
					p = p.next;
					choice = sc.nextInt();
				}
			}
		}
	}
	static void reverseList()
	{
		if(head==null)
		{
			System.out.println("Linked List is Empty");
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
	}
	static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.print(p.Data+" -----> ");
			p = p.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args)
	{
		System.out.println("My Linked List");
		createList();
		display();
		reverseList();
		display();
	}
}
