package LinkedList;
class ujjwalNode
{
	int data;
	ujjwalNode next;
	ujjwalNode(int x)
	{
		this.data = x;
		this.next = null;
	}
}
public class C_LinkedList_InsertAtBegin 
{
	static ujjwalNode insertAtBegin(ujjwalNode head , int x)
	{
		ujjwalNode obj = new ujjwalNode(x);
		obj.next = head;
		return head;
	}
	public static int main(String[] args) 
	{
		ujjwalNode head = null;
		head = insertAtBegin(head,10);
		head = insertAtBegin(head,20);
		head = insertAtBegin(head,30);
		head = insertAtBegin(head,40);
		return (0);
	}
	void showmyList(ujjwalNode x)
	{
		if(x.next == null)
			return;
		System.out.println(x.data+" ");
		showmyList(x.next);
	}
}
