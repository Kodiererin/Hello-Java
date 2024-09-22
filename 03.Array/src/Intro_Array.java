import java.util.Scanner;
public class Intro_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Arrays - a collecetion of similar type of data ");
		System.out.println("Method 1");
		int [] marks = new	int[5]; // memory allocated of 5, for marks
		marks [0] = 94;
		marks [1] = 98;
		marks [2] = 92;
		marks [3] = 91;
		marks [4] = 97;
		System.out.println(marks[4]);
		System.out.println();
		System.out.println();
		System.out.println("Second Method - ");	// memory allocation and array initialisation both at same time
		int [] marks1 = {97 , 98 , 94 , 99 , 92};
		System.out.println(marks1[2]);
		System.out.println();
		System.out.println();
		System.out.println("Method 3");
		int n = 5;
		int [] marks3 = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println("Enter the Marks = ");
			marks3 [i] = sc.nextInt();
		}
		for(int j = 0 ; j< n ; j++)
		{
			System.out.println(marks3[j]);
		}
		for(int element : marks) // for each loop in java
		{
			System.out.println(element);
		}
		sc.close();
	}

}
