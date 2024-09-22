// Aim : By Using recursion We inverse an array.
// Chaliye shuru krte h.
package Practise;
public class practise_reverseNo 
{
	public static int reverse(int x , int y , int length)
	{
		if(length==0)
			return y;
		int temp = x%10*(int)Math.pow(10, length-1);
		y = temp + reverse(x/10 , y , length-1);
		return y;
	}
	public static void main(String[] args) 
	{
		String x = 9876+"";
		int length = x.length();
		int m = reverse(9876, 0, length);
		System.out.println(m);
	}
}
