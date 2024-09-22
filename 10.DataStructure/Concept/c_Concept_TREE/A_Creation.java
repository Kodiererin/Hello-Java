package c_Concept_TREE;


//	This was about creation of the Tree.
public class A_Creation
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
	}
}

