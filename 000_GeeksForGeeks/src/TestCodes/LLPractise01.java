package TestCodes;
class Nodes
{
	int info;
	Nodes next;
	Nodes(int info)
	{
		this.info = info;
		this.next= null;
	}
}
class EnterData
{
	public static void Add()
	{
		Nodes head= new Nodes(10);
		head.next = new Nodes(20);
		head.next.next = new Nodes(30);
		head.next.next.next = new Nodes(40);
		display(head);
	}
	public static void display(Nodes head)
	{
		while(head!=null)
		{
			System.out.println(head.info);
			head = head.next;
		}
	}
	public static void deleteNode(Nodes head)
	{
		if(head==null) 
			return null;
		
		
	}
}
public class LLPractise01 
{
	public static void main(String[] args) 
	{
		EnterData x = new EnterData();
		x.Add();
	}
}
