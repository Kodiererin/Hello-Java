package ArrayQuestion;

import java.util.Hashtable;

public class InsertAtAny {
	public static void main(String[] args) {
		String m = "xaabacxcabaaxcabaax";
		System.out.println("Hello World");
		System.out.println("Result is "+new InsertAtAny().longestPalindrome(m));
	}
	public String longestPalindrome(String s) {
        return getPalindrome(s);
    }

	public static String getPalindrome(String str){
        // adding Base cases
		int i=0;
        if(str.length()<=1)
            return str;
        if(str.length()==2 && str.charAt(0)!=str.charAt(1))
            return str.charAt(0)+"";
        if(checkName(str)==false) {
        	for( ; i<str.length() ; ) {
            	if(str.charAt(0)==str.charAt(i)) {
            		i++;
            	}
            	else break;
            }
            String finalString=str.substring(0,i);
//            System.out.println(finalString);
            i=0;
            while(i<str.length()-1){
                int j=i+1;
                String m = "";
                while(j<str.length()-1 && str.charAt(j)!=str.charAt(i)){
                    j++;
                }
                m = str.substring(i,j+1);
                System.out.println(m);
                if(checkPalindrome(m)==true && m.length()>=finalString.length()){
                    finalString = m;            }
                i++;
            }
            return finalString;
        }else {
        	return str;
        }
    }

    // Substep of First Step
    public static boolean checkPalindrome(String str){
    	if(str.length()==0 || str.length()==1)
    		return true;
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
//    Check Palindrome
    public static boolean checkName(String str) {
    	int j=str.length()-1;
    	for(int i=0 ; i<=j;i++) {
    		if(str.charAt(i)!=str.charAt(j))
    		{
    			return false;
    		}
    		j--;
    	}
    	return true;
    }
}
