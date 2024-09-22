package concept_Queue;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class concept_Queue_LinkedList
{
	static Node Head = null;
	static Node Tail = null;
	public static void insert(int data)
	{
		Node p = new Node(data);
		if(Head == null)
		{
			Head = p;
			Tail = p;
		}
		else
		{
			p.next = Head;
			Head = p;
		}
	}
	public static void delete()
	{
		Node curr = Head;
		while(curr.next.next!=null)
		{
			curr = curr.next;
		}
		curr.next = null;
		Tail = curr;
	}
	public static void display()
	{
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome To Linked List + Array");
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		insert(70);
		delete();
		display();
	}
}
