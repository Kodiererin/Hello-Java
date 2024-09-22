package c_Concept_TREE;

import java.util.Stack;

public class Q_Iterative_PreOrderTraversal
{
//	We are going to Implement the STACK datastruture.
	public static void iterativePreorder(Node root)
	{
		if(root==null)
			return;
		Stack<Node> st = new Stack<>();
		st.push(root);
		while(!st.isEmpty())
		{
			Node curr = st.pop();
			System.out.print(curr.key+" ");
			if(curr.right!=null)
				st.push(curr.right);
			if(curr.left!=null)
				st.push(curr.left);
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
