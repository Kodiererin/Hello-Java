package b_concept_Stack;

public class concept_Stack_ArrayDequeue
{
	public static void main(String[] args)
	{
//		java.util.Stack<Integer> stack = new Stack<>();
		java.util.ArrayDeque<Integer> obj = new java.util.ArrayDeque<>();
		obj.push(20);
		obj.push(10);
		obj.push(32);
		obj.push(43);

		System.out.println(obj.peek());
		System.out.println(obj.peek());
		System.out.println(obj.peek());
	}
}

//	Both Stack and Dequeue have the same function and the timecomplexity is the O(1)

