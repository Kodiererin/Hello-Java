//	Problem : Implement K Stack sin an array in an Array In Java
//	Solution : Stack number with vakues in the below range[0,1,2,3,4,5...............]

//	Cap : kStacks takes n -> no of capacity as an argument(constructor)
//	Push : push takes stack number as argument as argument and x item which is to be inserted.
//	Pop : Stack number which must be removed from stack.



package b_concept_Stack;

public class problem_03_k_Stacks
{
	int arr[], top[], next[];
	int free_top=0,k,cap;
	problem_03_k_Stacks(int k,int n)
	{
		this.k = k;
		cap = n;
		arr = new int[n];
		top = new int[k];
		next = new int[n];
		for(int i=0 ; i<k ; i++)
		{
			top[i] = -1;
		}
		for(int i=0 ; i<n-1 ; i++)
		{
			next[i] = i+1;
		}
		next[n-1] = -1;
	}
	public void push(int sn,int x)
	{
		int i = free_top;
		free_top = next[i];
		next[i] = top [sn];
		top[sn] = i;
		arr[i] = x;
	}
	public int pop(int sn)
	{
		int i = top[sn];
		top[sn]= next[i];
		next[i] = free_top;
		free_top = i;
		return arr[i];
	}
	public boolean isEmpty(int sn)
	{
		return top[sn] == -1;
	}
}
