package Practise_Experiments.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practise_RevisionArrayList 
{
	public static void main(String[] args) 
	{
//		ArrayList
		Scanner sc = new Scanner(System.in);
		ArrayList<String> obj = new ArrayList<>();
		System.out.println("Enter The Name of the Students 5");
		for(int i=0 ; i<5 ; i++)
		{
			obj.add(sc.nextLine());
		}
		Collections.sort(obj);
		for(int j=0 ; j<5 ; j++)
		{
			System.out.println(obj.get(j));
		}
	}
}
