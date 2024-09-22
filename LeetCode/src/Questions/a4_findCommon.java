package Questions;
import java.util.Stack;

public class a4_findCommon 
{
	public static String longestCommonPrefix(String[] strs) 
    {
		String shortest=strs[0];
        if(strs.length>1)
        {
            for(int i=0 ; i<strs.length ; i++)
            {
            	if(shortest.length()>strs[i].length())
            		shortest=strs[i];
            }
            System.out.println(shortest);
            String m = "";
            for(int i=0 ; i<shortest.length(); i++)
            {
            	String check = shortest.charAt(i)+"";
            	for(int j=0 ; j<strs.length ; j++)
            	{
            		if(check.compareTo(strs[j].charAt(i)+"")!=0)
            		{
            			return m;
            		}
            	}
            	m+=check;
            }
        }
        return shortest;
    }
	public static void main(String[] args) 
	{
		String[] strs = {"flower","flow","flight"};
//		System.out.println(longestCommonPrefix(strs));
		
		String[] strs1 = {"ab","a"};
		System.out.println("Hello World  "+longestCommonPrefix(strs1));
	}	
}
