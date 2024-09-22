package concept_BinarySearchTree;


public class g_Iterative_Traversal {
	public static void main(String[] args) {
		Node head = new Node(15);
		head.left = new Node(5);
		head.right = new Node(20);

		head.left.left = new Node(3);

		head.right.left = new Node(13);
		head.right.left.left = new Node(16);
		head.right.right = new Node(80);
		
		
	}
	
//	Iterative PreOrder
	public static void iterativePreOrder(Node root) {
		if(root==null)
			System.out.println("The Tree Is Empty");
		else {
			Node curr;
			java.util.Stack<Node> stack = new java.util.Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				curr = stack.pop();
				System.out.println(curr.key);
				if(curr.left!=null) {
					stack.push(curr.left);
				}
				if(curr.right!=null) {
					stack.push(curr.right);
				}
			}
		}
	}
	
//	Iterative Post Order Traversal
	public static void iterativePostOrder(Node root) {
		if(root==null)
			System.out.println("The tree is Empty");
		else {
			Node curr;
			int visited;
			java.util.Stack<Node> stack1 = new java.util.Stack<Node>();
			java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
			
			stack1.push(root);
			stack2.push(0);
			while(!stack1.isEmpty()) {
				curr = stack1.pop();
				visited = stack2.pop();
				if(visited==1) {
					System.out.println(curr.key);
				}else {
					stack1.push(curr);
					stack2.push(1);
					if(curr.left!=null) {
						stack1.push(curr.left);
						stack2.push(0);
					}
					if(curr.right!=null) {
						stack1.push(curr.right);
						stack2.push(0);
					}
				}
			}
		}
	}
	
	
//	Iterative InOrder Traversal
	public static void Iterative_InorderTraversal(Node root) {
		if(root==null) {
			System.out.println("The Tree Is Empty");
		}else {
			Node curr;
			int visited;
			java.util.Stack<Node> stack = new java.util.Stack<Node>();
			java.util.Stack<Integer> visitedStack = new java.util.Stack<Integer>();
			stack.push(root);
			visitedStack.push(0);
			while(!stack.isEmpty()) {
				curr = stack.pop();
				visited = visitedStack.pop();
				if(visited==1) {
					System.out.println(curr.key);
				}else {
					stack.push(curr);
					visitedStack.push(1);
					if(curr.left!=null) {
						stack.push(curr.left);
						visitedStack.push(0);
					}
					if(curr.right!=null) {
						stack.push(curr.right);
						visitedStack.push(0);
					}
				}
			}
		}
	}
}
