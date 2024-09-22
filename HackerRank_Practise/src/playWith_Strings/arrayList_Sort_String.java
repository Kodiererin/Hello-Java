//	Note : This is a HackerRank Question.
//			This Sorting of string is done by using Arraylist ~ objectname.sort(index number) method.

package playWith_Strings;
import java.util.ArrayList;
public class arrayList_Sort_String 
{
	 public static String getSmallestAndLargest(String s, int k)
//	 public static void getSmallestAndLargest(String s, int k)
	 {
		 String largest ="";
		 String smallest = "";
		 ArrayList<String> obj = new ArrayList<>();
		 String temp = "";
		 for(int i=0 ; i<=s.length()-k ; i++)
		 {
			 for(int j=0 ; j<k ; j++)
			 {
				 temp = temp+s.charAt(i);
				 i++;
			 }
			 i-=k;
			 obj.add(temp);
			 temp="";
		 }
		 obj.sort(null);
		 for(int j=0 ; j<obj.size() ; j++)
		 {
			 System.out.println(obj.get(j));
		 }
//		 System.out.println(obj.get(obj.size()-1));
//		 System.out.println(obj.get(0));
		 smallest = obj.get(0);
		 largest = obj.get(obj.size()-1);
		 return smallest + "\n" + largest;
	 }
	public static void main(String[] args) 
	{
		System.out.println("The Sorted String is -----");
		getSmallestAndLargest("welcometojava" , 3);
	}
}
