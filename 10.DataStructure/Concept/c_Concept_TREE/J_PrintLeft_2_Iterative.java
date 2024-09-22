package c_Concept_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class J_PrintLeft_2_Iterative
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
		printLeft(root);
	}
//	Time complexity : BigTheta(n)
//	Auxillary Space : BigThetha(w) where w = width
	public static void printLeft(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int count = q.size();
			for(int i=0 ; i<count ; i++)
			{
				Node curr = q.poll();
				if(i==0)
					System.out.println(curr.key+" ");
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
		}
	}
}
