package y_HashMap;

import java.util.HashMap;

public class a_Leetcode_IsSubSequence {
	public static void main(String[] args) {
		System.out.println(isSubsequence("axc", "ahbgdc"));
	}
	public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        for(i=0 ; i<t.length() ; i++) {
        	if(t.charAt(i)==s.charAt(j)) {
        		j++;
        	}
        }
        if(j<s.length()) {
        	return false;
        }
		return true;
    }
}
