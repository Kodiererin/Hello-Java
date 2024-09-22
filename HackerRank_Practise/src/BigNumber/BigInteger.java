package BigNumber;
import java.io.*;
import java.util.Scanner;
public class BigInteger 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		java.math.BigInteger A = sc.nextBigInteger();
		java.math.BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
	}
}
