package c_Concept_TREE;

public class B_PostOrder_Traversal
{
	static class Node
	{
		int key;
		Node left;
		Node right;
		Node(int key)
		{
			this.key = key;
		}
	}
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right  = new Node(30);
		root.left.left = new Node(40);
		inorder_Traverse(root);
	}
	public static void inorder_Traverse(Node root)
	{
//		inorder-traversal : Left Root Right
		if(root!=null)
		{
			inorder_Traverse(root.left);
			inorder_Traverse(root.right);
			System.out.println(root.key+" ");
		}
	}
}
