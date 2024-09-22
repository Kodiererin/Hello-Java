package practise_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class hackerrank_Java_Stack 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Boolean x = true;
		String str;
		while(x!=false)
		{
			System.out.println("Enter String");
			str = sc.next();
			if(str.isEmpty()==true)
			{
				x = false;
			}
			else
			{
				System.out.println(isBalanced(str));
			}
		}
	}
	public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
    
    public static boolean isBalanced(String str){
          
        Deque<Character> s=new ArrayDeque<>(); 
        
        for (int i = 0; i < str.length(); i++)  
        { 
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')  
            {  
                s.add(str.charAt(i)); 
            } 
            else{
            if (s.isEmpty()==true) 
                return false;
            else if(matching(s.peek(),str.charAt(i))==false)
                return false;
            else
                s.pop();
            }
        }    
        return (s.isEmpty()==true); 
    }

}
