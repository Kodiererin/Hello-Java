//		Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//	
//	An input string is valid if:
//	
//	Open brackets must be closed by the same type of brackets.
//	Open brackets must be closed in the correct order.
//	Every close bracket has a corresponding open bracket of the same type.

package Questions;

import java.util.Stack;

public class a5_validParenthesis 
{
	public static boolean  checkParenthesis(String s) 
	{
		if(s.length()<=1)
			return false;
		else
		{
			Stack<Character> obj = new Stack<Character>();
			for(int i=0 ; i<s.length() ; i++)
			{
				if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
				{
					obj.push(s.charAt(i));
				}
				else if(s.charAt(i)==']' && obj.size()!=0)
				{
					if(obj.peek()=='[')
					{
						obj.pop();
					}
					else
						return false;
				}
				else if(s.charAt(i)=='}' && obj.size()!=0)
				{
					if(obj.peek()=='{')
					{
						obj.pop();
					}
					else
						return false;
				}
				else if(s.charAt(i)==')' && obj.size()!=0)
				{
					if(obj.peek()=='(')
					{
						obj.pop();
					}
					else
						return false;
				}
				else
					return false;
			}
			if(obj.size()!=0)
				return false;
		}
		return true;
	}
	
	
	public static boolean efficientSolution(String s)
	{
		        Stack<Character> stack = new Stack<>();
		        for(int i = 0; i < s.length(); i++) {
		            char a = s.charAt(i);
		            if(a == '(' || a == '[' || a == '{') stack.push(a);
		            else if(stack.empty()) return false;
		            else if(a == ')' && stack.pop() != '(') return false;
		            else if(a == ']' && stack.pop() != '[') return false;
		            else if(a == '}' && stack.pop() != '{') return false;
		        }
		        return stack.empty();
	}
	public static void main(String[] args) 
	{
		System.out.println(checkParenthesis("(()"));
	}
}
