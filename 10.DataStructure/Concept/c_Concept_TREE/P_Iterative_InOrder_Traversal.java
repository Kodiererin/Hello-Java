//	Iterative Solution for In-Order Traversal.

//	Here we are going to use the Stack DataStructure.

package c_Concept_TREE;

import java.util.Stack;

public class P_Iterative_InOrder_Traversal
{
	public static void inorderTraversal(Node root)
	{
		Stack<Node> st = new Stack<>();
		Node curr = root;
		while(curr!=null || !st.isEmpty())
		{
			while(curr!=null)
			{
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.print(curr.key+" ");
			curr = curr.right;
		}
	}
//	Time Compleity -> bigTheta(n)
//	Pushing and Popping an Element in the Datastructure takes O(1) time.
//	Auxillary Space : O(h)			where h is the Height of the tree.

	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);

		root.right.left = new Node(60);
		root.right.right = new Node(70);

		root.left.left.left = new Node(80);
	}
}
