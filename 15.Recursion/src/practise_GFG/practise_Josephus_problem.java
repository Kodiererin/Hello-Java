package practise_GFG;
public class practise_Josephus_problem 
{
	static int i = 1;
	static int m = 10;
	static int var;
	public static int josephus(int n, int k)
    {
		if(i==k)
		{
			m = m*var;
			n = n-m;
			m = 10;
			i=1;
//			josephus(n-m,k);
		}
		m = m*10;
		var = n%10;
		josephus(n/10,k);
		i++;
		return n;
    }
	public static void main(String[] args) 
	{
		System.out.println(josephus(212,3));
	}
}
