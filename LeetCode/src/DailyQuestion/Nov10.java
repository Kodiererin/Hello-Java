//		You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//	
//	We repeatedly make duplicate removals on s until we no longer can.
//	
//	Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.


//	Input: s = "abbaca"
//	Output: "ca"
//	Explanation: 
//	For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
//	and this is the only possible move.  The result of this move is that the string is "aaca", 
//	of which only "aa" is possible, so the final string is "ca".

package DailyQuestion;

public class Nov10 
{
	public static String removeDuplicates(String s) 
    {
		int i = 0, n = s.length();
		char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) 
        {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) 				// count = 2
            i -= 2;
        }
        return new String(res, 0, i);    
    }
	public static void main(String[] args) 
	{
		System.out.println(removeDuplicates("azxxzy"));
	}
}
