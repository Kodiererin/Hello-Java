//	This code will take Theta(N) time complexity.
//	Auxillary Space : O(n) Because Sometimes auxillary space will be constant and sometime auxillary space will be O(n)
//	We are implementing Queue so the size will depend on Queue Space and Width of the Binary space.
//	Therefore Auxillary Space will be Thetha(n) or thetha(w) where w is the width of the tree.

//	This method is also called LevelOrder Traversal or BREADTH FIRST TRAVERSAL
package c_Concept_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class G_2_LevelOrderTraversal_bigOhN_time
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

	public static void printLevelNodes(Node root)
	{
		System.out.println("Level Order Traversal");
		if(root==null)
		{
			return;
		}
		Queue<Node> obj = new LinkedList<>();
		obj.add(root);
		while(!obj.isEmpty())
		{
			Node curr = obj.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				obj.add(curr.left);
			if(curr.right!=null)
				obj.add(curr.right);
		}
	}

}
