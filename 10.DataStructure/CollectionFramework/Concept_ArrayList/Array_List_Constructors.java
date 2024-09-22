package Concept_ArrayList;
import java.util.ArrayList;

class ArrayList_Constructors_Info
{
	ArrayList_Constructors_Info()
	{
		System.out.println("We are going to talk about the constructors in the array list");
		System.out.println("1. \"ArrayList<Integer> c1 = new ArrayList<>(5);\" ~ here new ArrayList<>(5) represents that there will be minimum 5 array size , which can be increased further ");
	}
}
public class Array_List_Constructors
{
	public static void main(String[] args)
	{
		ArrayList<Integer> c1 = new ArrayList<>(5);
		c1.add(45);
		c1.add(45);
		c1.add(45);
		c1.add(45);
		c1.add(45);
		c1.add(45);
		c1.add(45);
		System.out.println("The Initial Size of the array is "+c1.size());
	}
}
