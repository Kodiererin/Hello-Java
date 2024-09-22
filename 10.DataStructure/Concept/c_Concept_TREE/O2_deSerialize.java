package c_Concept_TREE;
import java.util.ArrayList;
@SuppressWarnings("unused")
public class O2_deSerialize
{
//	Time Complexity : bigTheta(n)
	public static Node deSerialize(ArrayList<Integer> arr , int empty , int index)
	{
		if(index==arr.size())
			return null;
		int val = arr.get(index);
		index++;
		if(val==empty)
			return null;
		Node root = new Node(val);
		root.left = deSerialize(arr,empty,index);
		root.right = deSerialize(arr,empty,index);
		return root;
	}
	public static void main(String[] args)
	{
		O1_Serialization.main(args);
		int i=0;
		while(i<O1_Serialization.arr.size()) {
			System.out.println(O1_Serialization.arr.get(i));
			i++;
		}

		Node root = deSerialize(O1_Serialization.arr,-1,0);
	}
}
