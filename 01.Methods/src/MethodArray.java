class MethodArray
{
	static void change(int a)
	{
		a = 98;
	}
	public static void main(String[] args)
	{
		int u = 37;
		change(u);
		System.out.println(u);
	}
//	import java.util.*;
//	public class MethodArray 
//	{
//		static void Kemcho(int[] arg)
//		{
//			arg[0] = 98;
//		}
//		static void Kemcho2(int x)
//		{
//			x = 98;
//		}
//		public static void main(String[] args)
//		{
//			int[] marks = {78,84,92,99,89,91};
//			Kemcho(marks);
//			System.out.println("The Printed statement is "+marks[0]);
						//	ARRAY ME VARIABLE KA VALUE CHANGE HO RHA H LEKIN NON ARRAY ME 
						//		VARIABLE KA VARIABLE CHANGE NHI HOGA
						//		kyuki ARRAY me variable ka duplicate agar bn bhi rha h toh uska location 
						//		hme pta h lekin aisa non array me nhi h usme copy bn rha h jiske kaaran uska capy jaa rha h ar 
						//		process ho rha h?
					
//			int mamu = 55;
//			Kemcho2(mamu);
//			System.out.println("The non array replacement = "+mamu);
//		
//		
//		}
//		
//	}
//
//
//}