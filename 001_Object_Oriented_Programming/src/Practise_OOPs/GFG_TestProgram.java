package Practise_OOPs;
public class GFG_TestProgram 
{
//	swap dosent swap i and j
	public static void swap(Integer i, Integer j)
	{
		Integer temp = new Integer(i);
		i=j;
		j = temp;
	}
	public static void main(String[] args) 
	{
//		Integer constructor has been deprecated so.......
		Integer i = new Integer(20);
		Integer j = new Integer(10);
		swap(i , j);
		System.out.println("i = "+i+" j = "+j);
	}
}
