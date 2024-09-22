package s_1_String;

public class Problem6_SubString {

}

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0 || (s.length() == 0 && t.length() != 0)) {
            return true;
        } else if (s.length() != 0 && t.length() == 0) {
            return false;
        } else {
            int i = 0;
            int j = 0;
            while (j < t.length()) {
                if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i >= s.length();
        }
    }
}
