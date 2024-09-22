package c_Concept_TREE;
//	Check for Balanced Tree
//	We have to check if the Tree is Height balanced or not.
//	Height Balanced Means : The difference between heights of Left subtree and right Subtree should not be more than 1. And This should be true for every Node.
//	The difference of height from the left subtree and the right subtree <=1
//	We are directly jumping to the Solution 2:
//	1:	It will tell if the particular Subtree is Balanced or not and also tell their heights(@every recursive calls)
//	2: They do 2 things @every recursive calls.
//	3: We can implement this efficient solution by simply returning a pair where first value of the pair is boolean value which tekks you whether the subtree is balanced
//		or not and the other value is the Height.
//	4: This is a tricky Implementaion L It is to return one integer value (-1) if the tree is Unbalanced.
//					And return 0 or +ve if the tree is balanced.
public class L_CheckFor_BalancedTrees
{
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);

		root.left.left = new Node(5);
		root.left.right = new Node(3);

		root.right.right = new Node(1);
		root.right.left = new Node(1);
		root.right.left = new Node(2);
		root.right.left.left = new Node(2);
//		root.right.left.left.left = new Node(2);

		System.out.println("Is the Tree Balanced? "+isBalanced(root));

	}
//	Write a function that returns integer (-1) when the tree is Unbalanced and height when the tree is Balanced.

	public static int isBalanced(Node root)
	{
		if(root==null)
			return 0;
		int lh = isBalanced(root.left);
		if(lh==-1)
			return -1;
		int rh = isBalanced(root.right);
		if(rh==-1)
			return -1;
		if(Math.abs(lh-rh)>1)
			return -1;
		else
			return Math.max(lh, rh)+1;
	}
//	Time Complexity of the function is O(n)
//	Auxillary Space : O(h)
}
