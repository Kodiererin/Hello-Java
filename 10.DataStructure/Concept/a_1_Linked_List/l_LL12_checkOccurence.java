//	Doubt about of the recurrence.

package a_1_Linked_List;

public class l_LL12_checkOccurence
{
	public static void main(String[] args)
	{
//		creating a default Node for Learning purpose which can be changed Further
		Node Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(10);
		Head.next.next.next = new Node(50);
		Head.next.next.next.next= new Node(20);
		Head.next.next.next.next.next = new Node(30);
		display(Head);
		checkOccurence(Head);
	}
//	To Display the Number of Occurence of the Elements in the Linked list
	public static void checkOccurence(Node Head)
	{
		for(Node point = Head ; point!=null ; point = point.next)
		{
			int occurence = 0;
			for(Node curr = point.next ; curr!=null ; curr = curr.next)
			{
				if(point.Data == curr.Data)
				{
					occurence++;
				}
			}
			System.out.println("The Occurence of the "+point.Data+" after it is "+occurence);
		}
	}
	public static void display(Node Head)
	{
		for(Node curr = Head ; curr!=null ; curr =curr.next)
		{
			System.out.print(curr.Data+"--->");
		}
		System.out.println();
	}
}
