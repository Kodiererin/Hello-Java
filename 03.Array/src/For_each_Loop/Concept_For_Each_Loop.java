
package For_each_Loop;
//import Multidimensional_Array.Find_Max;
class introDe
{
	introDe()
	{
		System.out.println("For-each loop in Java\n");
		System.out.println("For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. \n");
		System.out.println("1. It starts with the keyword for like normal loop");
		System.out.println("2. Instead of declaring and initializing a loop counter variable,\n	you declare a variable that is the same type as the base of the array,");
		System.out.println("	followed by a colon, which is then followed by the array name");
		System.out.println("3. In the loop body, you can use the loop variable you created rather than \n	using an indexed array element");
		System.out.println("4. Its commonly used to iterate over an array or a Collections class (eg. Array List)");
	}
}
class Limitations 
{
	Limitations()
	{
		System.out.println("\n1. Limitations of for-each loop ");
		System.out.println("2. Decision Making               ");
		System.out.println("3. For-Each Loops are not appropiate when you want to modify the array");
//		for (int num : marks) 
//		{
//		    // only changes num, not the array element
//		    num = num*2; 
//		}
		System.out.println("4. For-Each loops donot keep track of Index. So we cannot obtain index of the loops");
//		for (int num : numbers) 
//		{ 
//		    if (num == target) 
//		    {
//		        return ???;   // do not know the index of num
//		    }
//		}
		System.out.println("5. For- Each only iterates forward over the array in single steps.");
		// cannot be converted to a for-each loop
//		for (int i=numbers.length-1; i>0; i--) 
//		{
//		      System.out.println(numbers[i]);
//		}
		System.out.println("6. For-Each cannot process two decision making statements at once");
		// cannot be easily converted to a for-each loop 
//		for (int i=0; i<numbers.length; i++) 
//		{
//		    if (numbers[i] == arr[i]) 
//		    { ...
//		    } 
//		}
		System.out.println("7. For-Each also has some performance overhead over simple iteration\n");
//		/*package whatever //do not write package name here */
//		 
//		import java.io.*;
//		import java.util.*;
//		 
//		class GFG {
//		    public static void main (String[] args) {
//		        List<Integer> list = new ArrayList<>();
//		        long startTime;
//		        long endTime;
//		        for (int i = 0; i < 1000000; i++) {
//		            list.add(i);
//		        }
//		        // Type 1
//		        startTime = Calendar.getInstance().getTimeInMillis();
//		        for (int i : list) {
//		            int a = i;
//		        }
//		        endTime = Calendar.getInstance().getTimeInMillis();
//		        System.out.println("For each loop :: " + (endTime - startTime) + " ms");
//		         
//		        // Type 2
//		        startTime = Calendar.getInstance().getTimeInMillis();
//		        for (int j = 0; j < list.size(); j++) {
//		            int a = list.get(j);
//		        }
//		        endTime = Calendar.getInstance().getTimeInMillis();
//		        System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");
//		         
//		        // Type 3
//		        startTime = Calendar.getInstance().getTimeInMillis();
//		        int size = list.size();
//		        for (int j = 0; j < size; j++) {
//		            int a = list.get(j);
//		        }
//		        endTime = Calendar.getInstance().getTimeInMillis();
//		        System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");
//		     
//		        // Type 4
//		        startTime = Calendar.getInstance().getTimeInMillis();
//		        for(int j = list.size()-1; j >= 0; j--) {
//		            int a = list.get(j);
//		        }
//		        endTime = Calendar.getInstance().getTimeInMillis();
//		        System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
//		    }
//		}
	}
}
class ForArray
{
	public int[] kemcho(int...is)
	{
		int temp;
		for(int hello : is)
		{
			System.out.println(hello+" ");
		}
		return is;
	}
}
public class Concept_For_Each_Loop 
{
	public static void main(String[] args) {
		
	}
	{
		introDe introde = new introDe();
		ForArray fa1  = new ForArray();
		Limitations l1 = new Limitations();
		System.out.println(" "+(fa1.kemcho(34,45,56,67,78,89)));;
	}
}
