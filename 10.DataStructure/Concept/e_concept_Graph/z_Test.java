package e_concept_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class z_Test
{
	public static void addEdge(ArrayList<ArrayList<Integer>>obj , int u , int v)
	{
		obj.get(u).add(v);
		obj.get(v).add(u);
	}

	public static void main(String[] args)
	{
		System.out.println("Number Of Vertices = 8");
		int vertices = 8;
		ArrayList<ArrayList<Integer>> obj = new ArrayList<>(8);
		for(int i=0 ; i<vertices ; i++)
		{
			obj.add(new ArrayList<Integer>());
		}
//		addList(obj,0,1);
//		addList(obj,0,3);
//		addList(obj,1,2);
//		addList(obj,1,3);
//		addList(obj,2,3);
//		addList(obj,2,6);
//		addList(obj,3,4);
//		addList(obj,3,5);
//		addList(obj,5,7);
//		addList(obj,6,7);
		addEdge(obj,0,1);
    	addEdge(obj,0,2);
    	addEdge(obj,1,2);
    	addEdge(obj,2,3);
    	addEdge(obj,1,3);
    	addEdge(obj,3,4);
    	addEdge(obj,2,4);

//		display(obj);
		bfs(obj,2);
		System.out.println("------------------------");
		breadthFirstSearch(obj,2);
	}

	public static void display(ArrayList<ArrayList<Integer>>obj)
	{
		for(int i=0 ; i<obj.size() ; i++)
		{
			System.out.print(i+"--->");
			for (Integer element : obj.get(i)) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

//	Code 1
	public static void bfs(ArrayList<ArrayList<Integer>> obj , int source)
	{
		boolean[] arr = new boolean[obj.size()];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = false;
		}
		arr[source] = true;
		System.out.println(source);
		for (Integer element : obj.get(source)) {
			arr[element]=true;
			System.out.println(element);
		}
		for (ArrayList<Integer> element : obj) {
			for (Integer element2 : obj.get(i)) {
				if(!arr[element2])
				{
					arr[element2] = true;
					System.out.println(element2);
				}
			}
		}
	}
//	Code 2
	public static void breadthFirstSearch(ArrayList<ArrayList<Integer>> obj , int source)
	{
		Queue<Integer> queue = new LinkedList<>();
		boolean[] arr = new boolean[obj.size()];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = false;
		}
		queue.add(source);
		arr[source] = true;
		while(!queue.isEmpty())
		{
			int u = queue.poll();
			System.out.print(u+" ");
			for (Integer element : obj.get(u)) {
				if(!arr[element])
				{
					arr[element]=true;
					queue.add(element);
				}
			}
		}
	}
}
