package c_Concept_TREE;
//	Write a function that takes root of a Binary Tree and returns an Integer value : Which is maximun width of a Binary Tree.
//	Idea : Push the level in the Queue
//		-> If (Current Queue Size > previous Queue Size)
//				-> Previous queue size = current queue size
//		-> finally -> we have the final width.

import java.util.LinkedList;
import java.util.Queue;

//	Time complexity -> O(n) and precisely BigTheta (n)
//	Auxillary Space -> BigTheta(w) 		[w is the maximum width of the tree.]
public class M_Maximum_Width
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
		System.out.println("The Maximuum Width of the Tree is "+maxWidth(root));
	}

	public static int maxWidth(Node root)
	{
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int res = 0;
		if(!q.isEmpty())
		{
			int count =0;
			res = Math.max(res, count);
			for(int i=0 ; i<count ; i++)
			{
				Node curr = q.poll();
				if(curr.left!=null)
				{
					q.add(curr);
				}
				if(curr.right!=null)
				{
					q.add(curr.left);
				}
			}
		}
		return res;

	}
}
