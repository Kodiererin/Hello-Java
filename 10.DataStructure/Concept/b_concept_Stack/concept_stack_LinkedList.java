package b_concept_Stack;
//Stack is a Linear DataStructure.
//Insertion Operation is called Push.
//DLL_03_Deletion Operation is called pop.
//isEmpty : boolean value : check if the Stack is empty or not.
//peek() : returns the top value.
//size() : returns the size of the Stack


public class concept_stack_LinkedList
{
	static Node head;
	static class Node
	{
		int Data;
		Node next;
		Node(int data)
		{
			this.Data  = data;
			this.next = null;
		}
	}
	static void push(int data)
	{
		Node p = new Node(data);
		if(head==null)
		{
			head = p;
		}
		else
		{
			p.next = head;
			head = p;
		}
	}
	static void pop()
	{
		head = head.next;
	}
	static void display()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.println(p.Data);
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
		push(70);
		display();
		System.out.println("Popping n Printing");
		pop();
		pop();
		pop();
		display();
	}
}
