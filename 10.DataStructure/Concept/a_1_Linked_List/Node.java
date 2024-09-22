package a_1_Linked_List;

public class Node
{
	public Node next;
	public int Data;							// Data can be of any Datatype (String , char , Long Float , etc.)
	public Node(int data)
	{
		this.Data = data;
		this.next = null;
	}
}