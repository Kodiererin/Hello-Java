package c_Concept_TREE;
public class C_PreOrder_Traversal
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
	public static void preorder_Traverse(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			preorder_Traverse(root.left);
			preorder_Traverse(root.right)  ;
		}
	} 
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right  = new Node(30);
		root.left.left = new Node(40);
		preorder_Traverse(root);
	}
}
