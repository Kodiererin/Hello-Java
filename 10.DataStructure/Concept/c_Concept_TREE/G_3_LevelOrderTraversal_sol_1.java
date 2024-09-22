package c_Concept_TREE;
import java.util.LinkedList;
import java.util.Queue;
public class G_3_LevelOrderTraversal_sol_1
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

		printLevelNodes(root);
	}
//	Time complexity of the code is : O(h+n) as h is a constant so overall : O(n)
//	Auxillary Space : BigThetha(W) where w is the width of the tree. or Big-Oh(n)						Both are correct.

//	We are Using Queue DataStructure in this.
//	Idea : When you will traverse the last node of the level, your next level is completely there into the queue.
//	When we traverse the current level completely, we push a "null" marker completely.
//	WHen "null" is see by the reference it will go to the new Line.
	public static void printLevelNodes(Node root)
	{
		if(root==null)
			return;
		Queue<Node> obj = new LinkedList<>();
		obj.add(root);
		obj.add(null);
		while(obj.size()>1)
		{
			Node curr = obj.poll();
			if(curr==null)
			{
				System.out.println();
				obj.add(null);
				continue;							// we are using continue because Continue allow the continuation of the loop by skipping the next Statements.
													// We can either use continue or else statement both are correct.
			}
			System.out.println(curr.key);
			if(curr.left!=null)
			{
				obj.add(curr.left);
			}
			if(curr.right!=null)
			{
				obj.add(curr.right);
			}
		}
	}
}
