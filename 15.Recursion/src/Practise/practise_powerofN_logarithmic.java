// Aacha Question Hai
//	Calculate Power using Recursion (Logarithmic) | Recursion in JAVA
// Peepcoding
// Yha pe stack log(n) tk hi jayega! ie : Space Complexity is used
package Practise;
public class practise_powerofN_logarithmic 
{
	public static void main(String[] args) 
	{
		System.out.println(power(2,4));
		System.out.println(peepcodin_ans(2,4));
		
	}
	public static int power(int x, int n)
	{
		if(n==0)
			return x;
		if(n%2!=0)
			return x*power(x , (n-1)/2);
		else
			return x*power(x,n/2);
    }
	public static int peepcodin_ans(int x , int n)
	{
		if(n==0)
			return 1;
		int x_n_p_nby2 = peepcodin_ans(x , n/2);
		int xn = x_n_p_nby2 * x_n_p_nby2;
		if(n%2==1)
		{
			xn = xn*x;
		}
		return xn;
	}
}
