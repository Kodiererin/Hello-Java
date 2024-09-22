package learn_OOPs;
import java.util.*;
class Test3
{
	private String name; // we have implement private access modifier for attributes name
	private int id; // we have implemented private access modifier for attributes id
	
	public String getName() // to show the output (maybe) am also confused
	{
		return name;
	}
	public void setname(String x) // to get the input
	{
		name = x;
	}
	public int getId()	// to show the output(confused.....)
	{
		return id;
	}
	public void setId(int y) // to get the input
	{
		id = y;
	}
}
public class Concepts_GettersNSetters 
{
	public static void main(String[] args)
	{
		Test3 t3 = new Test3();
		t3.setname("Ujjwal");			// Setters ~ SetId to give the input to the private attribute
		t3.setId(53);					// setters ~ to give the input to the private attribute
		System.out.println(t3.getName());	// Setters ~ getId to show the output
		System.out.println(t3.getId()); // getters ~ getId to show the output
	}
}
