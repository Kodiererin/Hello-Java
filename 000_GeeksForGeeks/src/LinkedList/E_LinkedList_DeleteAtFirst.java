//	 This code is incomplete so please redo it.

package LinkedList;
class Node02
{
	int data;
	Node02 v;					// waise v hi next h toh confuse mt hona
	Node02(int x)
	{
		this.data = x;
		this.v = null;
	}
}
public class E_LinkedList_DeleteAtFirst 
{
	static void insertMyNode()
	{
		Node02 head = new Node02(10);
		head.v = new Node02(20);
		head.v.v = new Node02(30);
		deleteMyNode(head);
		showList(head);
	}
	static Node02 deleteMyNode(Node02 x)
	{
		{
			if(x==null)
				return null;
			else
				return x.v;
//			showList(x);
		}
	}
	static void showList(Node02 x)
	{
		while(x!=null)
		{
			System.out.println(x.data);
			x = x.v;
		}
	}
	public static void main(String[] args) 
	{
		insertMyNode();
//		deleteMyNode function is getting initiated automatically.
//		showList function is getting initiated automatically.

	}
}
