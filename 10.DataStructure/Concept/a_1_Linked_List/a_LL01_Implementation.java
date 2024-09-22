//		This is the Begining of the DataStructure Linked List. The code has been taken/implemented from GEEKSFORGEEKS.
package a_1_Linked_List;
public class a_LL01_Implementation
{
	public static void main(String[] args)
	{
//		This was the Implementation/ Creation of the Linked List. We can also use loops and other code for Implementation of the
//		Linked List.
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2= new Node(20);
		Node temp3 = new Node(20);
//		head.next=temp1.next=temp2.next=temp3;
		head.next=temp1;
		temp1.next=temp2;
		temp2.next=temp3;
	}
}
