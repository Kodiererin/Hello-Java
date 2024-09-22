// 		PLease note that this is the Data Structure ie: Linked List that has been formed by Collection Framework.\
//		Which we will learn in Semester 3. So,
//		Chaliye shuru krte h!


package concept_Linked_List;
import java.util.LinkedList;

class info_LinkedList
{
	info_LinkedList()
	{
		System.out.println("Linked List");
		System.out.println("1. Linked List is bit different from the ArrayList");
		System.out.println("2. l1.add(indexno , number) ~ this method replaces the number from particular array Index");
		System.out.println("3. l1.addAll(indexno , objectName) ~ This adds a new array to the old array from the index Number Provided");
		System.out.println("4. l1.addFirst(number) ~ This Object adds the number from the first array. 	");
		System.out.println("5. l1.addLast(number) ~ This Object adds the number from the Last array. 	");
		System.out.println("6. remove(indexno ,number) ~ this method removes the array from a particular indes");
		System.out.println("7. set(indexno , number) ~ this method sets the array to a particular array");
//		System.out.println("");
		System.out.println("10. Dhyan Rakhe ~ ki almost saare methods, constructors same h ARRAY LIST ka bs kch methods ar constructors add hua h!......");
	}
}

public class Linked_List_Collection_Framework extends Thread 
{
	public static void main(String[] args) 
	{
		info_LinkedList info = new info_LinkedList();
		System.out.println("\n");
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
			l1.add(30);
			l1.add(39);
			l1.add(47);
			
			l2.add(57);
			l2.add(99);
			l2.add(109);
		System.out.println("The List is "+l1);
		System.out.println("The List is "+l2);
		
		l1.add(0, 5); // 0 is the index number and 5 is the number that is to be placed in that(by overwriting)
		System.out.println("\nThe List is "+l1);
		
		
			l1.addFirst(365);
		System.out.println("\n The updated Array with added element "+l1);
		
			l1.addLast(900);
		System.out.println("\n The updated Array with added element "+l1);
		
			l1.addAll(2 , l2);
		System.out.println("\n The New List is "+l1);
		
		l1.set(1, 500);
		System.out.println("The L1 Array Size is "+l1);
		System.out.println("The Updated Array "+l1);
		System.out.println("99 Has Been Removed from Updated Array"+l1.remove(3));
		System.out.println("The Updated Array is "+l1);
	}
}
