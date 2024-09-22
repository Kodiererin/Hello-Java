package Practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
	int key;
	Node left;
	Node right;
	Node(int key)
	{
		this.key = key;
	}
}


public class PractiseTrees {
	Node root;
	PractiseTrees(){
		this.root = new Node(10);
		this.root.left = new Node(20);
		this.root.right = new Node(30);

		this.root.left.left = new Node(40);
		this.root.left.right = new Node(50);
		this.root.left.left.left = new Node(60);
		this.root.left.left.right = new Node(70);

		this.root.right.left = new Node(80);
		this.root.right.right = new Node(90);
		this.root.right.right.right = new Node(100);
	}
	public void BFS() {
		Queue<Node> queue = new LinkedList<>();
		if(this.root==null) {
			System.out.println("Empty tree");
		}else {
			queue.add(root);
			while(queue.isEmpty()==false) {
				Node data = queue.poll();
				System.out.println(data.key);
				if(data.left!=null) {
					queue.add(data.left);
				}
				if(data.right!=null) {
					queue.add(data.right);
				}
			}
		}
	}
	
	public void DFS() {
		if(this.root==null) {
			System.out.println("Empty Treee");
		}else {
			Stack<Node> stack = new Stack<>();
			stack.push(root);
			while(stack.isEmpty()==false) {
				Node data = stack.pop();
				System.out.println(data.key);
				if(data.right!=null) {
					stack.push(data.right);
				}
				if(data.left!=null) {
					stack.push(data.left);
				}
				
			}
		}
	}
	public void dfsRec(Node root) {
		if(root==null) {
			return ;
		}else {
			System.out.println(root.key);
			dfsRec(root.left);
			dfsRec(root.right);
		}
	}
	public static void main(String[] args) {
		PractiseTrees trees = new PractiseTrees();
//		trees.BFS();
		System.out.println();
//		trees.DFS();
		trees.dfsRec(trees.root);
	}
}
