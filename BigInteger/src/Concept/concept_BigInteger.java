package Concept;
import java.math.*;
import java.util.*;
class info_BIG_integer
{
	info_BIG_integer()
	{
		System.out.println("1. BigInteger class is used for the mathematical operation which involves very big integer calculations that are outside the limit of all available primitive data types.\r\n"
				+ "\r\n"
				+ "In this way, BigInteger class is very handy to use because of its large method library and it is also used a lot in competitive programming. \r\n"
				+ "Now below is given a list of simple statements in primitive arithmetic and its analogous statement in terms of BigInteger objects.\r\n"
				+ "\r\n"
				+ "");
		System.out.println("2. Import java.math.* is used ");
		System.out.println("3. See the Below code to understand");
	}
}
public class concept_BigInteger 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First Number ");
		 	BigInteger A = sc.nextBigInteger();
//		 	java.math.BigInteger A = sc.nextBigInteger(); ~ if we dont import Java.math package
		 System.out.println("Enter Another  Number ");
		 	BigInteger B = sc.nextBigInteger();	
//		 	java.math.BigInteger B = sc.nextBigInteger();	~ if we dont import Java.math package
		 System.out.println(A.add(B));
		 System.out.println(A.multiply(B));
	}
}
