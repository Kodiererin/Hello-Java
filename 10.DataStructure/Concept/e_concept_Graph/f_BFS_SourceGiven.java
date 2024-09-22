package e_concept_Graph;

import java.util.ArrayList;

public class f_BFS_SourceGiven {
//	We will be using ArrayList of ArrayList to represent graph.
//	I am using ArrayList to Test the graph.
	public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String[] args) {
		int size = 5;

		java.util.ArrayList<java.util.ArrayList<Integer>> adj = new java.util.ArrayList<>(size);

		for(int i=0 ; i<size ; i++) {
			adj.add(new java.util.ArrayList<Integer>());
		}

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 0, 3);
		addEdge(adj, 2, 3);

//		Printing the Graph
//		printGraph(adj);


		breadthFirstSearch(adj , 0);
	}


//	Printing the Graph
	public static void printGraph(java.util.ArrayList<java.util.ArrayList<Integer>> adj) {
		for(int i=0 ; i<adj.size() ; i++) {
			System.out.print(i+"--->  ");
			for (Integer element : adj.get(i)) {
				System.out.print(element+" ");
			}System.out.println();
		}
	}

//	Starting with Breadth First Search
	public static void breadthFirstSearch(java.util.ArrayList<java.util.ArrayList<Integer>> adj , int source) {
		java.util.Queue<Integer> queue = new java.util.LinkedList();
		boolean[] visitedArray = new boolean[adj.size()];
//		Entering the Source
		queue.add(source);
		visitedArray[source] =  true;

		while(!queue.isEmpty()) {
			int next = queue.poll();
			System.out.println(next);
			for(int i=0 ; i<adj.get(next).size() ; i++) {
				if(!visitedArray[adj.get(source).get(i)]) {
					visitedArray[adj.get(source).get(i)]=true;
					queue.add(adj.get(source).get(i));
				}
			}
		}



	}
}
