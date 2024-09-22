//	hamesha us Datatype ka pura naam likhna with the uppercase character of the first letter of the word.
package practise_Generics;
import java.util.Scanner;
class dataTypeArray
{
	public static <E> void printArray(E[] inputArray)
	{
//		for(E element : inputArray)
		for(int i=0 ; i<inputArray.length ; i++)
		{
//			System.out.println(element);
			System.out.println(inputArray[i]);
		}
	}
}
public class practise_AQ_Q5 
{
	public static void main(String[] args) 
	{
//		dataTyeArray obj = new dataTyeArray();			~ static method hai, no need to create an object.
		System.out.println("Select the Datatype that You want to use to print the array");
		System.out.println("1. Integer");
		System.out.println("2. String ");
		System.out.println("3. Double ");
		System.out.println("4. Character ");
		System.out.println("5. Float");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt())
		{
			case 1: System.out.println("Integer Datatype");
					System.out.println("Enter The Size of the Array");
					Integer[] array = new Integer[sc.nextInt()];
					System.out.println("Enter The Elements in the array");
					for(int i=0 ; i<array.length ; i++)
					{
						array[i] = sc.nextInt();
					}
					dataTypeArray.printArray(array);
			break;
			case 2:	System.out.println("String Datatype"  );
					System.out.println("Enter the Size of the Array");
					String[] arr2 = new String[sc.nextInt()];
					System.out.println("Enter The Elements in the Array");
					int j=0;
					while(j<arr2.length)
					{
						arr2[j] = sc.next();
						j++;
					}
					dataTypeArray.printArray(arr2);
			break;
			case 3: System.out.println(" Double Datatype ");
			 		System.out.println("Enter The Size of The Array");
			 		Double[] arr3 = new Double[sc.nextInt()];
			 		System.out.println("Enter The Elements in The Array");
			 		int k=0;
			 		while(k<arr3.length)
			 		{
			 			arr3[k] = sc.nextDouble();
			 			k++;
			 		}
			 		dataTypeArray.printArray(arr3);
			 break;
			case 4: System.out.println("Character Datatype");
			 		System.out.println("Enter The Size of The Array");
			 		Character [] arr4 = new Character[sc.nextInt()];
			 		System.out.println("Enter The Elements in The Array");
			 		int l=0;
			 		while(l<arr4.length)
			 		{
			 			arr4[l] = sc.next().charAt(0);
			 			l++;
			 		}
			 		dataTypeArray.printArray(arr4);	
			 break;
			case 5:	System.out.println("Float Datatype ");
			  		System.out.println("Enter The Size of the Array");
			  		Float[] arr5 = new Float[sc.nextInt()];
			  		System.out.println("Enter The Elements in the Array");
			  		int m = 0;
			  		while(m<arr5.length)
			  		{
			  			arr5[m] = sc.nextFloat();
			  			m++;
			  		}
			  		dataTypeArray.printArray(arr5);
			  break;
			  default : System.out.println("Invalid user Input");
			  break;
		}
	}
}
