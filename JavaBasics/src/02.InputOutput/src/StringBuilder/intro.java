package StringBuilder;
public class intro 
{
	intro()
	{
		System.out.println("String and String Builder Both are same.");
		System.out.println("When We declare a String Variable then the Variable is stored in Stack Memory ");
		System.out.println("and The Components in the Memory is saved in Heap Memory ");
		System.out.println("So When we make a lot of changes then it takes a lot of memory and time as well. ");
		System.out.println("So, to overcome that thing StringBuilder was introduced so that it could save memory and time complexity as well");
		System.out.println("Almost every this is same as String but String builder is a class and has some more functions than String ");
		System.out.println("So, Enjoy");
	}
	public static void main(String[] args) 
	{
		intro i = new intro();
		StringBuilder obj = new StringBuilder("Ujjwal");
			System.out.println(obj);
		obj.append(" Kumar");								// append ~ last me jod Dena.
			System.out.println(obj);
		obj.delete(2, 3);
			System.out.println(obj);
	}
}
