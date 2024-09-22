package Practise_Experiments.copy2;

import java.util.ArrayList;
import java.util.Scanner;

public class practise_ArrayList 
{
	static void practise()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> obj = new ArrayList<>();
		System.out.println("Enter The Number Of Students ");
		int size = sc.nextInt();
		for(int i=0 ; i<size ; i++)
		{
			obj.add(sc.nextInt());
		}
		show(obj);
	}
	static void show(ArrayList<Integer> obj)
	{
		int i=0;
		while(i<obj.size())
		{
			System.out.println(obj.get(i));
			i++;
		}
	}
	static ArrayList<Integer> sort(ArrayList<Integer> obj)
	{
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Kemcho mota Bhai");
		practise();
	}
}
