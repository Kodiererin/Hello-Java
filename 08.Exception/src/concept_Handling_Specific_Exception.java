// this class is made to show how user can handle the specific exceptions and handle it with  different approach
//	with respect to the different exceptions.
// 	SO ALL THE BEST.
import java.util.*;
public class concept_Handling_Specific_Exception 
{
	public static void main(String[] args) 
	{
		int[] marks = new int[3];
		marks[0] = 7;
		marks[1] = 10;
		marks[2] = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Index");
			int x = sc.nextInt();
		System.out.println("Enter The Value of the Number ");
			int num = sc.nextInt();
		try
		{
			System.out.println("The Value of Array Index is "+marks[x]);
			System.out.println("The Value of Array Number is "+marks[x]/num);
		}
		catch(ArithmeticException aen)
		{
			System.out.println("Arithmetic Exception Occured "+x+"   "+num);
			System.out.println("The Exception is "+aen);
		}
		catch(ArrayIndexOutOfBoundsException aioe)
		{
			System.out.println("Array Index out of bound occured "+x+"   "+num);
			System.out.println("The Exception is "+aioe);
		}
		catch(Exception e)
		{
			System.out.println("Some Other Exception occured ");
			System.out.println("The Exception is "+e);
		}
//	Aap eek hi catch method me bohoth saare exceptions ko jod ke  ek object ke saath aap isme daal skte ho
//	Ye java jdk version 7 me aaya tha toh is vajah se aap ise use kr skte ho.
//	Isme se jo v error aayega woh obj identify krke show kr dega  ar apko bta dega............
//  comment out to see the result.
//		catch(ArithmeticException|ArrayIndexOutOfBoundsException| NullPointerException aioee)
//		{
//			System.out.println("Some Other Exception occured ");
//			System.out.println("The Exception is "+aioee);
//		}
		sc.close();
		
		
	}
}
