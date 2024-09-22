import java.util.*;
@SuppressWarnings("serial")
class info
{
	info()
	{
		System.out.println("1. You can create your own Exception class By extending the built in \"Exception\" class in Java");
		System.out.println("2. Real world Programming me aap sirf aur sirf java ke built in Exceptions se nhi deal kr rhe hoge.");
		System.out.println("3. Aim aage dekhiye..... isliye ye zaruri h ki aap apna Exception class bana sike taki aap pta kr ske ki kaise aap real world programming me exceptions me deal kr sko ");
		System.out.println("4. \"public string getMessage()\" ~ This method shows the reason of the exception ");
		System.out.println("5. \"public void printStackTrace() \" ~ This method shows the namme of the exception , reason of exception , and the line at which exception arises ");
		System.out.println("6. \"public String toString() \" ~ This method returns a short description of the exception .");
		
	}
}
class myException extends Exception
{
	public String toString() 
	{
		return "E ka galti kr diye aap, aisa nhi krna tha. \n";
	}
	public String getMessage()
	{
		return "are Bhaiya, age toh 125 se zada nhi na ho skat toh kahe aaaa gye? \n";
	}
//	line 27-30 has been edited @11-05-2022
//	public void printStackTrace()
//	{
//		System.out.println("Kamal Krte h Bhaiya Ji!. Aise thodai chalega.....");
//	}
}
public class concept_Exception_class 
{
	public static void main(String[] args) 
	{
		info in = new info();
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person");
			int age = sc.nextInt();
		if(age>125)		// agar age 125 se zaada hai toh exception maar dena h aur agar choota h toh "Boht Boht Dhanwayad" 
		{
			try
			{
				throw new myException();
//				throw new ArithmeticException("E toh arithmetic exception h ! bah budbak");
			}
			catch(myException e)
			{
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("\n");
				System.out.println("\n Chaliye Khatm krte h");
			}
		}
		System.out.println("\n Chaliye apka Boht boht dhanyawad");
		sc.close();
	}
}
