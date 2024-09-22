package Concept;

public class concept_Backtracking 
{
	public static void checkMethods()
	{
		String m = "Ujjwal";
		System.out.println(m.substring(0, 1));
		System.out.println(m.substring(3));
	}
	static void permutationString(String str , String perm , int idx)
	{
		if(str.length() == 0)
		{
			System.out.println(perm);
			return;
		}
		for(int i=0 ; i<str.length() ; i++)
		{
			char currChar = str.charAt(i);
			String newStr = str.substring(0  , i) + str.substring(i+1);
			permutationString(newStr,perm+currChar,idx+1);
		}
	}
	public static void main(String[] args) 
	{
//		checking the methods to understand it.
		checkMethods();
		System.out.println("---------------------------------");
		permutationString("abc","",0);
	}
}
