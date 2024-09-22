package practise_Queue_Stack;

public class practise_Queue_LinkedList 
{
//	Working : FILO principle
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	static Node head = null;
	static Node tail = null;
	static void push(int data)
	{
		Node p = new Node(data);
		if(head == null)
		{
			head = p;
			tail = p;
		}
		else
		{
			Node q = head;
			while(q.next!=null)
			{
				q = q.next;
			}
			q.next = p;
			tail = q.next;
		}
	}
	static void delete()
	{
		head = head.next;
		head.next.prev = null;
	}
	static void display()
	{
		for(Node p = head ; p!= null ; p = p.next)
		{
			System.out.println(p.data);
			p = p.next;
		}
	}
	public static void main(String[] args) 
	{
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		display();
		delete();
		delete();
	}
}
