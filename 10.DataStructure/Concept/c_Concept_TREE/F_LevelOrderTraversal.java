package c_Concept_TREE;
public class F_LevelOrderTraversal
{
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right  = new Node(30);
		root.left.left = new Node(40);
		root.left.right= new Node(99);
		root.left.left.left = new Node(50);
		root.left.left.right = new Node(60);
		@SuppressWarnings("unused")
		int k = 2;
		print_levelOrder_Traversal(root , 1 );
		System.out.println("-------------------------------");
		print_levelOrder_Traversal(root , 2 );
	}
	public static void print_levelOrder_Traversal(Node root , int k)
	{
		if(root==null)
			return;
		if(k==0)
			System.out.println(root.key+" ");
		else
		{
			print_levelOrder_Traversal(root.left , k-1);
			print_levelOrder_Traversal(root.right, k-1);
		}
	}
}
