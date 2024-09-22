package Practise_Experiments.copy2;
import java.util.*;
import java.util.Scanner;

class Test
{
	String name;
	int regNo;
	void setData(String name , int regNo)
	{
		this.name = name;
		this.regNo = regNo;
	}
}
public class practise_ArrayList_Revision
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Students ");
		Test[] obj = new Test[sc.nextInt()];
		for(int i=0 ; i<obj.length ; i++)
		{
//			obj[i] = new Test(sc.next()	, sc.nextInt());
			obj[i] = new Test();
			obj[i].setData(sc.next(), sc.nextInt());
		}
		sc.close();
		
		for(int j=0 ; j<obj.length ; j++)
		{
			System.out.println(obj[j].name);
			System.out.println(obj[j].regNo);
		}
		Test[] obj2 = new Test[5];
		
	}
}
