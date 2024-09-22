//	GFG Lecture 5.
//	Display of the LinkedList by Recursion.
//	Time Complexity = O(n).
//	Auxiliary Space = O(n).
//	Recursion auxiliary space is way more and so it is recommended to use Iteration instead of recursion.

package LinkedList;
class myNode
{
	int data;
	myNode next;
	myNode(int x)
	{
		this.data = x;
		this.next= null;
	}
}
public class B_LinkedList_RecursiveDisplay 
{
	public static void main(String[] args) 
	{
		myNode head = new myNode(10);
		head.next = new myNode(20);
		head.next.next = new myNode(30);
		head.next.next.next = new myNode(40);
		printbyRecursion(head);
	}
	static void printbyRecursion(myNode x)
	{
		if(x==null)
			return;
		System.out.print(x.data+" ");
		printbyRecursion(x.next);
	}
}
