package b_concept_Stack;
public class problem_02_ImplementTwoStacks
{
		int arr[];
		int cap,top1,top2;
		problem_02_ImplementTwoStacks(int n)
		{
			cap = n;
			top1 = -1;
			top2 = n;
			arr = new int[n];
		}
		public boolean push(int x)
		{
			if(top1<top2-1)
			{
				top1++;
				arr[top1] = x;
				return true;
			}
			return false;
		}
		public boolean push2(int x)
		{
			if(top1<top2-1)
			{
				top2--;
				return true;
			}
			return false;
		}
		public Integer pop()
		{
			if(top1>-1)
			{
				int x = arr[top1];
				top1--;
				return x;
			}
			return null;
		}
		public Integer pop1()
		{
			if(top2<cap)
			{
				int x = arr[top2];
				top2++;
				return x;
			}
			return null;
		}
		public int size()
		{
			return (top1+1);
		}
		public int size2()
		{
			return (cap-top2);
		}

}
