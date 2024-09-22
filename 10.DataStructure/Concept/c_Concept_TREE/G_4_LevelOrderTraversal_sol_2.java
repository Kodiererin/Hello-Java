package c_Concept_TREE;
import java.util.LinkedList;
import java.util.Queue;
public class G_4_LevelOrderTraversal_sol_2
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
		if(root==null)
			return;
		Queue<Node> obj = new LinkedList<>();
		obj.add(root);
		while(!obj.isEmpty())
		{
			int count = obj.size();
			for(int i=0 ; i<count ; i++)
			{
				Node curr = obj.poll();
				System.out.println(curr.key+" ");
				if(curr.left!=null)
					obj.add(curr.left);
				if(curr.right!=null)
					obj.add(curr.right);
			}
			System.out.println();
		}
	}
}
