package practise_LinkedList;
public class DLL_Operation_Exams 
{
	static Node head = null;
	static Node tail = null;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	static void creation(int data)
	{
		Node p = new Node(data);
		if(head==null)
		{
			head = p;
			tail = p;
		}
	}
	static void insertBeg(int data)
	{
		if(head == null)
		{
			creation(data);
		}
		else
		{
			Node p = new Node(data);
			p.next = head;
			head.prev = p;
			head = p;
		}
	}
	
	static void display(Node x)
	{
		if(x==null)
			return;
		else
			System.out.println(x.data);
		display(x.next);
	}
	static void insLast(int data)
	{
		if(head==null)
			creation(data);
		else
		{
			Node p = new Node(data);
			Node q = tail;
			tail.next = p;
			p.prev = tail;
			tail = p;
		}
	}
	static void sort()
	{
		for(Node q = head ; q!= null ; q = q.next)
		{
			for(Node r = head ; r!=null ; r = r.next)
			{
				if(q.data > r.data)
				{
					int temp = q.data;
					q.data = r.data;
					r.data = temp;
				}
			}
		}
	}
	static int count(int count, Node x)
	{
		if(x==null)
			return count;
		else
			return count(count+1,x.next);
	}
	static void insAny(int data, int pos)
	{
		if(pos==1)
			insertBeg(data);
		else if(pos == count(0,head))
			insLast(data);
		else
		{
			int i=0;
			Node q = head;
			while(i<pos-1)
			{
				q = q.next;
				i++;
			}
			Node insert = new Node(data);
			insert.prev = q;
			insert.next = q.next;
			q.next.prev = insert;
			q.next = insert;
		}
	}
	static void removeDup()
	{
		Node 
		for(Node p = head ; p!=null ; p = p.next)
		{
			
		}
	}
	public static void main(String[] args) 
	{
		creation(20);
		insertBeg(10);
		insertBeg(30);
		insertBeg(30);
		insertBeg(40);
		insertBeg(40);
		insertBeg(50);
		insertBeg(60);
		
		insLast(100);
		insLast(999);
		display(head);
		System.out.println("Sorting ");
		sort();
		display(head);
		
		System.out.println("The Number of elements in the Linked List is "+count(0,head));
		insAny(98758,3);
		display(head);
		
	}
}
