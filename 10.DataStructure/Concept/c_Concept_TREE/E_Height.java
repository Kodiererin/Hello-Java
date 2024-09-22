package c_Concept_TREE;

import c_Concept_TREE.D_PostOrder_Traversal.Node;

public class E_Height
{
//	Already the Node has Been Defined, OS no need.
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.right  = new Node(30);

		System.out.println("The Height of The tree is "+height(root));
	}
//	determining the height of the tree.
	public static int height(Node root)
	{
		if(root!=null)
		{
			return Math.max(height(root.left), height(root.right))+1;
		}
		else
		{
			return 0;
		}
	}
}
