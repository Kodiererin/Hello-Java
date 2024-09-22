//CodeWithHarry Q). Create an array of 5 floats and calculate their sum.
import java.util.*;
public class CWH4_float5_sum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float sum = 0;
		float [] marks = new float[5];
		System.out.print("Enter marks of Five Students ");
		for(int i=0 ;i<marks.length; i++)
		{
			marks[i] = sc.nextFloat();
			sum = marks[i]+ sum;
		}
		sum = sum/(marks.length);
		System.out.println("Average Marks = "+sum);
	}

}
