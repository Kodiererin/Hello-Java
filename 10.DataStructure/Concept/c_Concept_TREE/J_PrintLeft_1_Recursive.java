package c_Concept_TREE;

public class J_PrintLeft_1_Recursive
{
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.left.left = new Node(60);
		root.left.left.right = new Node(70);

		root.right.left = new Node(80);
		root.right.right = new Node(90);
		root.right.right.right = new Node(100);
		printLeft(root,1);
	}
//	we are assigning a global variable for this solution
//	Time complexity : O(n).
//
	static int maxLevel = 0;
	public static void printLeft(Node root , int level)
	{
		if(root==null)
			return;
		if(maxLevel<level)
		{
			System.out.println(root.key+" ");
			maxLevel = level;
		}
		printLeft(root.left , level+1);
		printLeft(root.right , level+1);
	}
}
