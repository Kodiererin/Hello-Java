package Practise;
public class incompleteit_practise_shivam_hollowDiamond 
{
	static void column1(int index , int max)
	{
		if(index<=max)
		{
			space1(index , max);
			row1(0,(2*index)+1);
			System.out.println();
			column1(index+1,max);
		}
		if(index>=max)
		{
			return;
		}
	}
	static void row1(int index , int max)
	{
		if(index<=max)
		{
			if(index==0)
			{
				System.out.print("x");
			}
			if(index==max-1)
			{
				System.out.print("x");
			}
			else
			{
				System.out.print(" ");
			}
//			System.out.print("x");
			row1(index+1,max);
		}
		if(index>=max)
		{
			return;
		}
	}
	static void space1(int index , int max)
	{
		if(index<=max)
		{
			System.out.print(" ");
			space1(index,max-1);
		}
		if(index>=max)
		{
			return;
		}
	}
//	recreating the program... of the second triangle printout
	static void rColumn(int index,int max)
	{
		if(index<=max)
		{
			rSpace(0,index);
			rRow(index,max);
			System.out.println();
			rColumn(index+1,max);
		}
		if(index>=max)
		{
			return;
		}
	}
	static void rRow(int index,int max)
	{
		if(index==max)
		{
			System.out.print("x ");
			return;
		}
		if(index!=max)
		{ 
			System.out.print("  ");
			rRow(index+1,max);
		}
	}
	static void rSpace(int index,int max)
	{
		if(index<=max)
		{
			System.out.print(" ");
			rSpace(index+1,max);
		}
		if(index>max)
		{
			System.out.print("x ");
			return;
		}
	}
//	creating the main method and implementing it.
	public static void main(String[] args) 
	{
		System.out.println("Practising Hollow Diamond");
		column1(0,9);
//		column2(0,9);
		rColumn(0,9);
	}
}
