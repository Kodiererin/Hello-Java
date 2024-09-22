public class Loop1
{
	public static void main(String[] args)
	{
	String m = "";
	{
		for(int i=1 ; i<=5 ; i++)
		{
			m = m+i+m;
			System.out.println(m);
		}
	}

}
}
//1
//1"2"1
//121"3"121
//1213121"4"1213121
//121312141213121"5"121312141213121