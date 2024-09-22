package e_concept_Graph;

import java.util.*;


public class l_TopologicalSorting {
//	Create Links
	public static void createLinks(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).add(v);
	}

	public static void main(String[] args) {
		int size = 4;
		ArrayList<ArrayList<Integer>> graph = new java.util.ArrayList<java.util.ArrayList<Integer>>(size);
		for (int i = 0; i < size + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
//		Creating the Links
		createLinks(graph, 0, 1);
		createLinks(graph, 1, 3);
		createLinks(graph, 2, 3);
		createLinks(graph, 2, 4);
		createLinks(graph, 3, 4);
		
		initialize(graph);
	}
//	Check the output and Proceed Again
	public static void initialize(ArrayList<ArrayList<Integer>> graph) {
		System.out.println("Starting the Topolocial Sort");
		Stack<Integer> s = new Stack<Integer>();
//		int source = 0;
		boolean[] visited = new boolean[graph.size()];
//		visited[source] = true; 
		for(int i=0 ; i<graph.size() ; i++	) {
			DFS_Algorithm(graph, s, visited, i);
		}
		System.out.println();
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
//	DFS
	public static void DFS_Algorithm(ArrayList<ArrayList<Integer>> graph , Stack s , boolean[] visited , int source) {
		visited[source] = true;
		System.out.println("Source"+source);
		for(int i=0 ; i<graph.get(source).size() ; i++) {
			
			if(visited[i]==false) {
				DFS_Algorithm(graph, s, visited, i);
			}
		}
		s.push(source);
	}
}
