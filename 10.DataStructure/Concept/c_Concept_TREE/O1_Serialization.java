package c_Concept_TREE;

import java.util.ArrayList;

//	We will be Using -1 for null.
public class O1_Serialization
{
//	We will be using Empty=-1;
//	We are using ArrayList for Our convenience, we can use String and Arrays also as per out choice.
//	Here if we have n Nodes then we will have n+1 empty nodes in the List
//	Total Space of the Array List will be (n+n+1) -> (2n+1)		<- Total size of the Array List
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void serialize(Node root , ArrayList<Integer> arr , int empty)
	{
		if(root==null)
		{
			arr.add(empty);
			return;
		}
		arr.add(root.key);
		serialize(root.left,arr,empty);
		serialize(root.right,arr,empty);
//		Time Complexity : bigTheta(n)
//		Auxillary Space : bigTheta(n)
	}
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);

		root.right.left = new Node(60);
		root.right.right = new Node(70);

		root.left.left.left = new Node(80);

		serialize(root,arr,-1);

//		System.out.println(arr.size());  			just to confirm.
//		int i=0;
//		while(i<arr.size()) {
//			System.out.println(arr.get(i))  ;
//			i++;}
	}
}
