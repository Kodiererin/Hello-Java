package concept_BinaryHeap;

//import c_Concept_TREE.B_Inorder_Traversal.Node;

public class i_DeleteN_Node {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static void main(String[] args) {
		Node Root = new Node(8);
		Root.left = new Node(3);
		Root.right = new Node(10);
		
		Root.left.left = new Node(1);
		Root.left.right = new Node(6);
		
		Root.right.right = new Node(14);
		
		Root.left.right.left = new Node(4);
		Root.left.right.right = new Node(7);
		
		Root.right.right.left = new Node(13);
		
		inorder_Traverse(Root);
		deleteNode(Root, 14);
		System.out.println("--------------");
		inorder_Traverse(Root);
		
	}
	
	
	public static Node deleteNode(Node root , int data) {
		if(root==null)
			return null;
		if(root.data>data) {
			root.left = deleteNode(root.left, data);
		}
		else if(root.data<data) {
			root.right = deleteNode(root.right, data);
		}else {
			if(root.left==null)
				return root.right;
			if(root.right==null)
				return root.left;
			else {
				Node succ = getSuccessor(root);
				root.data = succ.data;
				root.right = deleteNode(root.right, data);
			}
		}
		return root;
	}
	
	public static Node getSuccessor(Node root) {
		Node curr = root.right;
		while(curr!=null && curr.left!=null) {
			curr = curr.left;
		}
		return curr;
	}
	
	public static void inorder_Traverse(Node root)
	{
//		inorder-traversal : Left Root Right
		if(root!=null)
		{
			inorder_Traverse(root.left);
			System.out.println(root.data+" ");
			inorder_Traverse(root.right);
		}
	}
}	
