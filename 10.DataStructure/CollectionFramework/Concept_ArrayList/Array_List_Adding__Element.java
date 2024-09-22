package Concept_ArrayList;
import java.util.ArrayList;
class Array_List_Info
{
	Array_List_Info()
	{
		System.out.println("1. ArrayList is Declared By ~ ArrayList <DataType> objectname = new ArrayList<>();");
		System.out.println("2. add(object) ~ add all the elements from the another object array, it joins the two array");
		System.out.println("3. addAll(index , object) ~ Insert an element al the given Index.");
		System.out.println("----------- to Be Continued in the Next Class -----------------");
	}
}
class Array_List_Adding__Element
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		l1.add(1);
		l1.add(3);
		l1.add(17);
		l1.add(17);
		l1.add(23);
		System.out.println(l1);
		l1.add(3, 999);
		System.out.println(l1);

		l2.add(22);
		l2.add(23);
		l2.add(24);
		l2.add(25);
		l2.add(26);

		l1.addAll(l2);
		System.out.println(l1);
	}
}