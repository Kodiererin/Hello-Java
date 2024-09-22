import java.util.*;
public class Check_Datatype {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to check");
			long c = sc.nextLong();
//			int n;
//		double formula = Math.pow(2, (n-1));
//			double veformula = -formula;
//			double eformula = formula-1;
			int n;
		for(int i=1 ; i<= 4 ; i++)
		{
//			to check number is byte or not
			if(i==1)
			{
				
				n = 8*i;
				double formula = Math.pow(2, (n-1));				
				if(c<=(formula-1) && c>=(-formula))
				{
					System.out.println("Byte");
				}
			}
			if(i==2)
			{
//				int n;
				n = 8*i;
				double formula = Math.pow(2, (n-1));
				System.out.println(formula);
				if(c<=(formula-1) && c>=(-formula))
				{
					System.out.println("short");
				}
			if(i==3)
				{
					
					n = 8*i;
					double xyz = (Math.pow(2, (n-1)));		
					System.out.println(xyz);
					if(c<=(xyz-1) && c>=(-xyz))
					{
						System.out.println("Int");
					}
			if(i==4)
					{
//						int n;
						n = 8*i;
						double xyz1 = (Math.pow(2, (n-1)));				
						System.out.println(xyz1);
						if(c<=(xyz1-1) && c>=(-xyz1))
						{
							System.out.println("Long");
						}
			}
		}
	}

		}}}
