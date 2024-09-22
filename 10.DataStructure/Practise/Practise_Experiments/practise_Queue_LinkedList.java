package Practise_Experiments;
public class practise_Queue_LinkedList 
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	static Node head;
	static Node tail;
	public static void push(int data)
	{
		if(head == null && tail == null)
		{
			Node p = new Node(data);
			head = p;
			tail = p;
		}
		else
		{
			Node p = new Node(data);
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = p;
			tail = p;
		}
	}
	public static void pop()
	{
		head = head.next;
	}
	public static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.println(p.data);
			p = p.next;
		}
	}
	public static void main(String[] args) 
	{
		for(int i=0 ; i<10 ; i++)
		{
			push(i);
		}
		display();
		for(int i=0 ; i<10 ; i = i+3)
		{
			pop();
		}
		System.out.println("----------------------------------");
		display();
	}
}
