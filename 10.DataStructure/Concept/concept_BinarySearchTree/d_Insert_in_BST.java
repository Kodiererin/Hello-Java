//		The Root is changed when the Tree is empty.
//		Else The Root is Not Changed.
//		Our Function show modify the Root node and should return the Modified Root Node,.
package concept_BinarySearchTree;

public class d_Insert_in_BST {
	public static void main(String[] args) {
		int[] arr = {1,4,2,3,5,7,15,3,10};
		Node Head = new Node(arr[0]);
		for(int i=1 ; i<arr.length ; i++)
		{
			Head = insertData(Head,arr[i]);
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			display(Head,i);
			System.out.println();
		}
	}
//	Write a Code to Insert the code of Insertion Function
//	Recursive Java Implementation
	public static Node insertData(Node Root, int x)
	{   // BigOh oh H extra space.
		if(Root==null) return new Node(x);
		if(Root.key>x) { Root.left = insertData(Root.left,x);}
		else if(Root.key<x) { Root.right = insertData(Root.right,x);}
		return Root;
	}
//	Iterative Insert
	public static Node iterativeInsert(Node root , int x)
	{  // BigOg(1) Extra Space.
		Node temp = new Node(x);
		Node parent = null;
		Node curr = root;
		while(curr!=null)
		{
			parent = curr;
			if(curr.key>x) curr = curr.left;
			else if(curr.key<x) curr = curr.right;
			else {return root;}
		}
		if(parent==null) return temp;
		if(parent.key>x) parent.left = temp;
		else parent.right = temp;
		return root;
	}
	public static void display(Node root , int k)
	{
		if(root==null)
			return;
		if(k==0)
			System.out.print(root.key+" ");
		else
		{
			display(root.left , k-1);
			display(root.right, k-1);
		}
	}
}
