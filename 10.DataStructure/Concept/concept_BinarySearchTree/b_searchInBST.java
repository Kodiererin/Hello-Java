package concept_BinarySearchTree;
//	We are going to talk about searh operation in BST.
//	We re given a root of a binary search tree and a key.
//	We need to return a Boolean Value which is true or false.
//	We need to return true if the given key is present in the Binary Search tree.
//	and false if it is not present.
//
//	From here and so on we are going to consider only distict digits in the Binary Search tree.


//	So How do You write a Function.
//
//	We are recursively calling the root everytime and we are comparing the Key everytime inorder to do the comparison.
//


//	→ If the searched key is greater then the Root you go to right.
//	→ If the Searched key is less than the Root you go to the left.
//	We will be  recursively searching the value in the Binary Search tree.
//	If the BST is null then return false.
//	This not only the case when someone passes the empty Tree explicitly but also the Base cases.
//	A key cannot be there in a Empty Tree.

	public class b_searchInBST
	{	// Recursive Code.
		public boolean search(Node root , int x)
		{
			if(root==null)
				return false;
			else if(root.key == x)
				return true;
			else if(root.key<x)
				return search(root.right , x);
			else
				return search(root.left,x);
		}
//		Iterative Code.
		public static boolean IterativeSearching(Node root, int x)
		{
			while(root!=null)
			{
				if(x==root.key)
					return true;
				else if(x>root.key)
					return IterativeSearching(root.right,x);
				else
					return IterativeSearching(root.left,x);
			}
			return false;
		}

//		Steps followed Were.
//		1. We set out root reference to the Topmost node.
//		2. We compare the value of x eith rot key.
//		3. If it matches we return true.
//			If it is greater then we go to the right
//			If it is Smaller then we go to the Left.
//		4. We keep on changing the root reference and we come out of the loop with two conditions.
//			a. When root becomes null. You come out of the loop and return false.
//			b. When root.key matches we not only come out of the loop we also come out of the function.



//	Time Complexity : Height of the Tree. Worst Case Time is Height of the BST. Big-Oh(height)
//						For Recursive and Height of the tree.
//	Auxillary Space : Depends upon function call stack.
//				ie: Auxillary Space : Big-Oh(Height)
//	The Iterative implementation does not requirs any Auxillary Space. It works on the Contant space.


//	Iterative implementation iOverall Iterative implementation is better than Recursive call Implementation because
//	a. It dosent require any auxillary space.
//	b. It runs on Big-Oh(1) Space.
//	c. It dosenot involve any extra function call overhead.
//
//	Note : It is upper bounded by height.
//	But if the Binary Tree is not Balanced where height = number of Nodes.s Better than Recursive Implementtion because it does not require any extra Space.
//	And Doesnot call any function call overhead.

//	Then The time complexity of the Search May Become Big-Oh(n).

//	When we Talk about Normal BST then Height can be n (no of Nodes)
//	But when we talk about self balancing Binary Search Trees then we will make Sure that the height never goes beyound order of Log n

		public static void main(String[] args)
		{
			Node head = new Node(15);
			head.left = new Node(5);
			head.right = new Node(20);

			head.left.left = new Node(3);

			head.right.left = new Node(13);
			head.right.left.left = new Node(16);
			head.right.right = new Node(80);



		}
	}