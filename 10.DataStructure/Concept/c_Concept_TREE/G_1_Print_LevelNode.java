package c_Concept_TREE;

//	This code has a very high time complexity. O(n+h*n) h = height of the tree and n = no of nodes.
//	So use of this code is not recommended.
public class G_1_Print_LevelNode
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

		int height = getHeight(root);
		levelOrderTraversal(root,height);					// Again use of this method is not recommended.
	}

	public static void levelOrderTraversal(Node root , int height)
	{
		for(int i=0 ; i<height ; i++)
		{
			kOrderTraversal(root,i);
		}
	}
	public static int getHeight(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			return Math.max(getHeight(root.right), getHeight(root.left))+1;
		}
	}

	public static void kOrderTraversal(Node root , int k)
	{
		if(root==null)
			return;
		if(k==0)
			System.out.println(root.key);
		else
		{
			kOrderTraversal(root.left , k-1);
			kOrderTraversal(root.right , k-1);
		}
	}


}
