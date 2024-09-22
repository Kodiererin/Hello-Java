package c_Concept_TREE;

public class K_Children_Sum_Property
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
//		root.right.left = new Node(2);

		System.out.println("Children Sum Property = "+isSum(root));
//		System.out.println("Children Sum Property = "+isSum(root));
	}

//	Concept used is : The sum of the left child and the right child - node value
//	IF every Node follows Children Sum property then only The value is returned.
//	The Time Complexity if the Functio is O(n)
//	Auxillary Space -> O(h) where h is the height as (requiered to call for recursion call stack)
	public static boolean isSum(Node root)
	{
		if((root == null) || (root.left==null && root.right == null))
			return true;
		int sum = 0;
		if(root.left!=null)
		{
			sum = sum + root.left.key;
		}
		if(root.right!=null)
		{
			sum = sum + root.right.key;
		}
		return (root.key==sum&&isSum(root.left)&&isSum(root.right));
	}
}
