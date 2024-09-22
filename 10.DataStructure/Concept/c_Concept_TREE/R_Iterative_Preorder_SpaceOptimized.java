package c_Concept_TREE;

import java.util.Stack;

public class R_Iterative_Preorder_SpaceOptimized
{
//	This code will be space optimized.
//	O(n) Time Complexity & O(h) Auxillary Space.
//	Idea of the Implementation will be that we are going to store the Right Node into the stack and
//	We are going  to print the left node so....which we will not save in the stack.

//	We are going to process left,left,left and we are going to push the right into the Stack.

	public static void iterativePreorder(Node root)
	{
		if(root==null)
			return;
		Stack<Node> st = new Stack<>();
		Node curr = root;
		while(curr!=null || !st.isEmpty())
		{
			while(curr!=null)
			{
				System.out.print((curr.key+" "));
				if(curr.right!=null)
					st.push(curr.right);
				curr = curr.left;
			}
			if(!st.isEmpty())
				curr = st.pop();
		}
	}
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

		iterativePreorder(root);
	}
}
