package playWith_Strings;
import java.io.*;
import java.util.*;

public class checkPalindrome
{

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The String that you want to check");
        String A=sc.next();
        int ctr = 0;
        if(A.length()%2==0)
        {
        	for(int i=0 ; i<(A.length())/2 ; i++)
            {
            	if(A.charAt(i)==A.charAt(A.length()-1-i))
            	{
            		ctr++;
            	}
            }
        }
        if(A.length()%2!=0)
        {
        	for(int j=0 ; j<(A.length())/2) ; j++){
        		
        	}
        }
    }
}



