package e_concept_Graph;
//		In this Code the Source is not given and Graph may be disconnected.
//	This Problem is related to web crawling, where you are given multiple pages where they are connected to each other.
//	There may be group of pages which are not connected to each other  and You  want to traverse all the pages.
//	So that You can Index Them.
//	-- So how you will use a BFS algorithm that will use in BFS manner  if you visit the source the next adjacent will come next,
//	The next to next adjacent will come next and so on....

//	So This time there will be no sourc
import java.util.ArrayList;

public class e_BFS_SourceNotGiven
{

//	Display of Graph
	public static void display(ArrayList<ArrayList<Integer>>obj)
	{
		for(int i=0 ; i<obj.size() ; i++)
		{
			System.out.print(i+"--->");
			for (Integer element : obj.get(i)) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}
	}
	public static void addList(ArrayList<ArrayList<Integer>> obj , int u , int v)
	{
		obj.get(u).add(v);
		obj.get(v).add(u);
	}
//	Creation of Disconnected Graph in Main Function.
	public static void main(String[] args)
	{
		int vertices = 6;
		ArrayList<ArrayList<Integer>> obj = new ArrayList<>(vertices);
		for(int i=0 ; i<vertices ; i++)
		{
			obj.add(new ArrayList<Integer>());
		}
		addList(obj,0,2);
		addList(obj,1,2);
		addList(obj,2,3);
		addList(obj,2,4);

		display(obj);

		int vertices2 = 12;
		ArrayList<ArrayList<Integer>> obj2 = new ArrayList<>(vertices2);
		for(int i=0 ; i<vertices2 ; i++)
		{
			obj2.add(new ArrayList<Integer>());
		}
		addList(obj2,7,8);
		addList(obj2,7,11);
		addList(obj2,8,9);
		addList(obj2,9,10);
		addList(obj2,10,11);

		display(obj2);
	}
//	*******************Main Code Starts Here***********************************

	public static void BFS_disconnected(ArrayList<ArrayList<Integer>>obj , int u , int v)
	{

	}
}
