package concept_HashSet;

import java.util.HashSet;

class hashsetInfo
{
	hashsetInfo()
	{
		System.out.println("1. HashSet class uses a hasgtable for storing the elements");
		System.out.println("2. It implements the set interface");
		System.out.println("3. Duplicate Values are not allowed");
		System.out.println("4. Before Storing any object, the hashset uses the hashcode() and equals() method to check any duplicate entry in the hash code");
		System.out.println("5. Allows the null Value.");
		System.out.println("6. Best suited for the search operations. \n");
	}
	public void hashsetConstructors()
	{
		System.out.println("1. \"HashSet()\" ~ This constructor is used to create a new empty HashSet that can store 16 elements and have a load factore of 0.75");
		System.out.println("2. HashSet(int initial capacity) ; This constructor is used to create a new HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75");
		System.out.println("3. HashSet(int intialcapacity , float loadFactor ~ This constructor is used to create a new empty HashSet with the capacity & load factor to specified integer and float value");
		System.out.println("4. HashSet(Collection <? extends E> c~  This constructor is used to create a HashSet using the elements of collection c");
		System.out.println("---- Boht saare method ArrayList n LinkedList se match krta h----");
		System.out.println("\n SEE THE METHODS AND ITS USE IN THE CODE \n");
	}
}
public class concept_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> ujjwalHash= new HashSet<>(30);
		ujjwalHash.add(98);
		ujjwalHash.add(88);
		//ujjwalHash.add(88);		// duplicate numbers are not allowed
		ujjwalHash.add(78);			//insertion order same nhi rehta h Hashing Set me...
		ujjwalHash.add(45);
		System.out.println("Ujjwals Array is "+ujjwalHash);
		System.out.println("Ujjwal Array Size "+ujjwalHash.size());
//		
		System.out.println("\nRemoving 88 from the array "+ujjwalHash.remove(88));   // remove() method to remove an element
			System.out.println("The Updated Array "+ujjwalHash);
		System.out.println("\nThis method throws an exception if the number is not found in the array \n"); 
			System.out.println("The Updated Array is "+ujjwalHash);
//		
		System.out.println("\nChecking If an Array is Empty or not "+ujjwalHash.isEmpty()); // isEmpty() checks if the array is empty or not
//		
		System.out.println("\nChecking the size of the array "+ujjwalHash.size());		// checking the array size
//		
//		System.out.println("\nThis method clears the array elements from the list ");
//		ujjwalHash.clear();	// this method clears the method from the array and empties it
//			System.out.println("The Updated Array is "+ujjwalHash);
	}
}
