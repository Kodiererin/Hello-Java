package TestDSA;

public class Test_GFG_Two_Stacks 
{
	int arr[];
	int cap;
	int arrP1 = -2;
	int arrP2 = -1;
	Test_GFG_Two_Stacks(int x)
	{
		arr = new int[2*x];
		cap = 2*x;
	}
	public void push1(int x)
	{
		arrP1 = arrP1+2;
		if(arrP1<=cap)
		{
			arr[arrP1] = x;
		}
		else
		{
			System.out.println("Overflow");
		}
	}
	public void push2(int x)
	{
		arrP2 = arrP2+2;
		if(arrP2<=cap)
		{
			arr[arrP2] = x;
		}
		else
		{
			System.out.println("Overflow");
		}
	}
	public static void main(String[] args) 
	{
		Test_GFG_Two_Stacks obj = new Test_GFG_Two_Stacks(5);
		obj.push1(1);
		obj.push1(1);
		obj.push1(1);
		obj.push1(1);
	}
}
