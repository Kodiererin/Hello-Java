package e_concept_Graph;

import java.util.ArrayList;

public class c_Creation_ListRepresentationArrayList
{
//	We will be using ArrayList of ArrayList to represent graph.
//	We can also use ArrayList of LinkedList to represent graph. But due to cache friendliness we will be using ArrayList of ArrayList to represent a Graph.
//	Lets Start

//	This is creation for Undirected Graph!
	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u  ,int v )
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void showGraph(ArrayList<ArrayList<Integer>> adj)
	{
		for(int i=0 ; i<adj.size() ; i++)
		{
			System.out.print(i+" ---> ");
			for (Integer element : adj.get(i)) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int size = 5;// I am Setting a Size of an array. We can or Cannot set the size of an Array!

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(size);
		for(int i=0 ; i<size ; i++)
		{
			adj.add(new ArrayList<Integer>());				// here we are creating a dynamic size Array List
		}
//		Adding elements to the Array List
		addEdge(adj , 0 , 1);
		addEdge(adj , 0 , 2);
		addEdge(adj , 1 , 2);
		addEdge(adj , 1 , 3);

//		Printing the Graph
		showGraph(adj);
	}


//	Clarification regarding the output :
//	0 ---> 1 2 					0th Selected Graph Element 1 ar 2 se connected h
//	1 ---> 0 2 3 				1th Selected Graph Element 0 , 2 , 3 se connected h
//	2 ---> 0 1 					2th Selected Tmhara 0 ar 1 se connected h
//	3 ---> 1 					3th Selected Tmhara 1 se connected h
//	4 --->


}


