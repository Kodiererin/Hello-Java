package Practise_Experiments.copy2;

import java.util.HashSet;

class Question
{
	Question()
	{
		System.out.println("Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.");
	}
}
public class cwh_Queestion2 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> obj = new HashSet();
		obj.add(45);
		obj.add(45);
		obj.add(45);
		obj.add(21);
		obj.add(22);
		obj.add(13);
		obj.add(11);
		obj.add(123);
		obj.add(12313);
		obj.add(132);
		obj.add(1112);
		obj.add(1211);
		obj.add(1232);
		obj.add(12111);
		System.out.println(obj);
		
		
	}
}
