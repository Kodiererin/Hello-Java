package Concept_Array_Dequeue;

import java.util.ArrayDeque;

class ArrayDequeue_Info
{
	ArrayDequeue_Info()
	{
		System.out.println("ArrayDequeue ~ ka concept ye kehta h ki jb aap dono side array ka insertion aur deletion kroge toh kaise hoga, liked array ar arraylist se krna possible nhi h");
		System.out.println("Toh isliye ArrayDeque ka idea aata hai jha pe internally woh bohoth saara idea implements use krta h !");
		System.out.println("So all the best buddy!");
		System.out.println("Code Padh ar dekh samajh me aa jayega");
		System.out.println("Java Documentation ek baar dekhna zarur!");
		System.out.println("You can do it bro, Just Do it");
	}
}
public class Array_Dequque 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
			ad1.add(12);
			ad1.add(21);
			ad1.add(45);
			ad1.add(90);
			ad1.add(56);
//		Insertion at front
		System.out.println("Insertion at front");
			
		System.out.println(ad1);
			ad1.offerFirst(53);
		System.out.println(ad1);
			ad1.addFirst(34);
		System.out.println(ad1);
		System.out.println("----------------------------------");
		System.out.println("Insertion at End");
			ad1.addLast(999);
		System.out.println(ad1);
			ad1.offerLast(888);
		System.out.println(ad1);
		System.out.println("------------------------------------");
		System.out.println("Accessing an Element from the Head of the Dequeue Array");
		System.out.println(ad1.getFirst());
		System.out.println(ad1.peekFirst());
		System.out.println("Accessing an Element from the Last of the Dequeue Array");
		System.out.println(ad1.getLast());
		System.out.println(ad1.peekLast());
		System.out.println("-----------------------------------------");
		System.out.println("Removing an element ");
			try
			{
				ad1.removeFirst();
			}
			catch(Exception e)
			{
				System.out.println("The Array does not exist");
			}
		System.out.println(ad1);
		try
		{
			ad1.pollFirst();
		}
		catch(Exception e)
		{
			System.out.println("The Array does not exist");
		}
		System.out.println(ad1);
		
	}
}
