package concept_BinarySearchTree;

public class f_No_of_Nodes {
	public static void main(String[] args) {
		Node head = new Node(15);
		head.left = new Node(5);
		head.right = new Node(20);

		head.left.left = new Node(3);

		head.right.left = new Node(13);
		head.right.left.left = new Node(16);
		head.right.right = new Node(80);

	}
	
//	No of Leaf Nodes
	public int numLeafNode(Node root) {
		return numLeafNodes(root);
	}
	public int numLeafNodes(Node curr) {
		if(curr==null) {
			return 0;
		}
		if(curr.left==null && curr.right==null)
			return 1;
		else {
			return numLeafNode(curr.left) + numLeafNode(curr.right);
		}
	}
	
//	Number of Full Nodes
//	A Full node is a Node which has a non-null left and non-null right
	public int numFullNodes(Node root) {
		return getFullNodes(root);
	}
	public int getFullNodes(Node root) {
		if(root==null)
			return 0;
		if(root.left!=null && root.right!=null)
			return 1;
		else {
			return getFullNodes(root.left) + getFullNodes(root.right);
		}
	}
	
//	Get The Tree Deapth
	public int TreeDeapth(Node root) {
		return Tree_Deapth(root);
	}
	
	public int Tree_Deapth(Node root) {
		if(root==null)
			return 0;
		else {
			int leftDeapth = Tree_Deapth(root.left);
			int rightDeapth = Tree_Deapth(root.right);
			
			if(leftDeapth > rightDeapth)
				return leftDeapth+1;
			else
				return rightDeapth+1;
		}
	}
}
