package concept_BinarySearchTree;

public class e_Print_SpiralOrder {
	public static void main(String[] args) {
		Node head = new Node(15);
		head.left = new Node(5);
		head.right = new Node(20);

		head.left.left = new Node(3);

		head.right.left = new Node(13);
		head.right.left.left = new Node(16);
		head.right.right = new Node(80);

		
		displaySpiral(head);
	}
//	Display the BST in Spiral Order
	public static void displaySpiral(Node Root) {
//		Declaring 2 roots
		java.util.Stack<Node> stack1 = new java.util.Stack<>();
		java.util.Stack<Node> stack2 = new java.util.Stack<>();
		
		Node temp;
		if(Root!=null) {
			stack1.push(Root);
		}
		while(stack1.size()!=0 || stack2.size()!=0) {
			while(stack1.size()!=0) {
				temp = stack1.pop();
				System.out.println(temp.key);
				if(temp.left!=null) {
					stack2.push(temp.left);
				}
				if(temp.right!=null) {
					stack2.push(temp.right);
				}
			}
			while(stack2.size()!=0) {
				temp = stack2.pop();
				System.out.println(""+temp.key);
				if(temp.left!=null) {
					stack1.push(temp.left);
				}
				if(temp.right!=null) {
					stack1.push(temp.right);
				}
			}
		}
	}
}
