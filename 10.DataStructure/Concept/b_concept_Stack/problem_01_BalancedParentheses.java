//	Recheck the Solution and Proceed Again

package b_concept_Stack;

import java.util.Scanner;

//	Check for the Balanced Parenthesis for the Given String
public class problem_01_BalancedParentheses
{
	public static void main(String[] args)
	{
		problem();
		System.out.println();
		System.out.println("Solution-----------------------------------------------------------------");
		System.out.println();
//		System.out.println(BalancedParenthesis("(())"));
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		String str;
		while(x)
		{
			System.out.println("Enter String");
			str = sc.next();
			if(str.isBlank())
			{
				x = false;
			}
			else
			{
				System.out.println(BalancedParenthesis(str));
			}
		}
	}
	public static boolean matching(Character a , Character b)
	{
		return ((a=='(' && b==')') || a=='{' && b=='}' || a=='['&& b==']');
	}
	public static boolean BalancedParenthesis(String str)
	{
//		We will be using Dequeue DataStructure

		java.util.ArrayDeque<Character> obj = new java.util.ArrayDeque<>();
		for(int i=0 ; i<str.length() ; i++)
		{
			char x = str.charAt(i);
			if(x=='(' || x=='{' || x=='[')
			{
				obj.push(x);
			}
			else
			{
				if(!obj.isEmpty())
				{
					return false;
				}
				else if(!matching(obj.peek(),x))
				{
					return false;
				}
				else
				{
					obj.pop();
				}
			}
		}
		return obj.isEmpty();
	}

	public static void problem()
	{
		System.out.println("This is the most famous Problem and it is asked in most of the Interviews.");
		System.out.println("This problem uses LIFO property. The Bracket which is opened first has to be closed first and the Bracket which is opened last has to closed first");
		System.out.println("What Should we DO?");
		System.out.println("In Stack we will push opening bracket");
		System.out.println("When we see the closing bracket, we will compare if true remove from the stack.");
		System.out.println("Stack becomes empty -> Done");
		System.out.println("But When the top of the stack donot match then return false.");
	}
}
