package hackerRank_Stack;
public class hackerrank_Stack 
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
	static Node head=null;
	public static void insert(char data)
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
	public static char pop()
	{
		char c = head.data;
		head = head.next;
		return c;		
	}
	public static void main(String[] args) 
	{
//		Ascii value of [ - 91
//		Ascii value of ] - 93
//		Ascii value of { - 123
//		Ascii value of } - 125
//		Ascii value of ( - 40
//		Ascii value of ) - 41
		System.out.println((int)'c');
		String x = "";
		System.out.println(x.hashCode());
		
	}
}
