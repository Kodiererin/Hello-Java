//		COunt Nodes In a Complete Binary Tree.
//	We are given a Complete Binary Tree, We need to count no of Nodes in A complete Binary TRee.
//	Binary tree is Called Complete Binary Tree when all the Nodes are files Except possibly the last level and the last level must be filled from left to right.

//	Write A program that Takes Root of a Binary Tree As an srgument and returs the count in the Complete Binary Tree.


package c_Concept_TREE;
public class N_countNodes_CompleteBinaryTree
{
//	Naive Solution.
	public static int count(Node root)
	{
		if(root==null)		return 0;
		else
			return 1+count(root.left)+count(root.right);
	}
//	Efficient Solution : This solution will use the fact that the input tree is the Complete Binary Tree.
//	and using this fact we are going to get the No of Nodes.
//	Time complexity of this operation is : O(Log(n)*log(n))
	public static int countNode(Node root)
	{
		int lh=0;
		int rh=0;
		Node curr = root;
		while(curr!=null) {
			lh++ ;
			curr = curr.left;
		}
		curr = root;
		while(curr!=null) {
			rh++ ;
			curr = curr.right;
		}
		if(lh==rh)
			return (int) (Math.pow(2, lh)-1);
		return 1+countNode(root.left)+countNode(root.right);
	}

	public static void main(String[] args)
	{
//		Note that the tree must be a prefect tree, so My approach is also moving like that only for creating the tree.
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);

		root.right.left = new Node(60);
		root.right.right = new Node(70);

//		Creating a leaf.
		root.left.left.left = new Node(80);

//		if the tree is not a perfect tree then the Efficient Solution will not work.
//		root.right.right.right= new Node(90);



		System.out.println("The Number of Nodes Present in the Tree is "+count(root));
		System.out.println("The Efficient Approach of the Code is, The Number of Nodes present in the tree is "+countNode(root));
	}

}
