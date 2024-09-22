package b_concept_Stack;
//	Arraylist Implementation
//	TimeComplexity - O(1)
//	Due to dynamic size some operations might be costilier and so
//	There might be time-complexity  which is average or amotized O(1)


public class concept_Stack_ArrayList
{
//	Implementation of the Stack using ArrayList
	static java.util.ArrayList<Integer> obj = new java.util.ArrayList<>();
	static int size=0;
	static int top=-1;

	public static void push(int x)
	{
		top = top+1;
		obj.add(x);
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			obj.remove(top);
			top-=1;
		}
	}
	public static void show()
	{
		int c = 0;
		while(c!=obj.size())
		{
			System.out.println(obj.get(c));
			c++;
		}
	}
	public static boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public static void peek()
	{
		System.out.println(obj.get(top));
	}
	public static void main(String[] args)
	{
		push(10);
		push(10);
		push(10);
		push(10);
		show();
		pop()	;
		pop();
		show();

		peek();
		System.out.println(isEmpty());
	}
}
