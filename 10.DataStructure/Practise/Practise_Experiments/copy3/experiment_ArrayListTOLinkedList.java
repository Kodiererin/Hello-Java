//	TypeCasting ArrayList to LinkedList.
package Practise_Experiments.copy3;
import java.util.ArrayList;
import java.util.LinkedList;

public class experiment_ArrayListTOLinkedList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		
		LinkedList<Integer> obj1 = new LinkedList<>();
		obj1.addAll(obj);
		System.out.println(obj1.get(0));
	}
}
