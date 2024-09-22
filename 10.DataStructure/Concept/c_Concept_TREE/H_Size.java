package c_Concept_TREE;
//	Time Complexity of the loop = O(n)				As all the nodes are being traversed.
//	Auzillary Space : O(h)
public class H_Size
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

		System.out.println(size(root));
	}
//	This is a recursive Solution
	public static int size(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			return 1+size(root.left) + size(root.right);
		}
	}
}
