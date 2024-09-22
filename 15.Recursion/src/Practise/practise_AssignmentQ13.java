//	13. Write a recursive method in Java to find the binary equivalent of a positive decimal integer.
package Practise;
public class practise_AssignmentQ13 
{
	static void binaryEQ(int x , String y)
	{
		if(x==0)
		{
//			return y;
			System.out.println(y);
		}
		if(x>0)
		{
			int m = x%2;
			y = m+y;
			x = x/2;
			binaryEQ(x,y);
		}
//		return y;
	}
	static String Experiment(int x, String y)
	{
		if(x<=0)
		{
			return y;
		}
		int m = x%2;
		return Experiment(x/2 , y+m);
	}
	public static void main(String[] args) 
	{
		System.out.println("Binary Equivalent of a Positive Integer");
		binaryEQ(123456789,"");
//		System.out.println(binaryEQString(123456789,"",1));
		System.out.println(Experiment(123456789,""));
	}
}
