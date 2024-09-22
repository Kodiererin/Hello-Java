package c_Concept_TREE;

public class I_MaximumNo
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
		System.out.println(getMax(root));

	}
//	Time Complexity : O(n)
//	Auxillary Space : O(n) [ atmost O(n+1) will be done at the functional Call ]
	public static int getMax(Node root)
	{
		if(root==null)
			return Integer.MIN_VALUE;	// we are writing Integer.MIN_VALUE to return the minimum possible Integer so that any intger when compared will be greater than it.
		else
			return Math.max(root.key, Math.max(getMax(root.right), getMax(root.left)));
	}

//	This is a recursive method which will perform best when the tree is perfect tree.
//	We can also Implement Iteration by loops which will take same time but Auxillary space will be O(W), but will perform best in Squed Tree.
//	Squeed Tree : Tree having only one node at its successors!
}
