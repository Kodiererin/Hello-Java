package Practise_Experiments.copy3;

import java.util.ArrayList;
import java.util.Scanner;

class Question1
{
	Question1()
	{
		System.out.println("Question 1: Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.");
	}
}
public class cwh_Question1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Question1 ques = new Question1();
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println("Enter the elements of the Array");
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		ar.add(sc.nextInt());
		
		System.out.println("Elements of the Array by For Loop");
		for(int i=0 ; i<10 ; i++)
		{
			System.out.print(ar.get(i)+" , ");
		}
		
		System.out.println("\nElements of the Array by using foreach loop ");
		for(int element : ar)
		{
			System.out.println(element+"");
		}
	}
}
