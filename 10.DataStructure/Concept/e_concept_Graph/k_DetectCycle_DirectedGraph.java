package e_concept_Graph;

import java.util.ArrayList;

public class k_DetectCycle_DirectedGraph {
//	Create Links
	public static void createLinks(ArrayList<ArrayList<Integer>> graph, int u, int v) {
		graph.get(u).add(v);
	}

	public static void main(String[] args) {
		int size = 3;
		ArrayList<ArrayList<Integer>> graph = new java.util.ArrayList<java.util.ArrayList<Integer>>(size);
		for (int i = 0; i < size + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
//		Creating the Links
		createLinks(graph, 0, 1);
		createLinks(graph, 1, 2);
		createLinks(graph, 2, 3);
		createLinks(graph, 3, 1); // There is a cycle from 3 -> 1

		System.out.println(detectCycle(graph, size));
	}

//	Sarting the Algorithm
	public static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int source) {
//		Creating a Visited Array
		boolean[] visited = new boolean[graph.size()];
//		To Find a Back Array initilizing one more back Array
		boolean[] resST = new boolean[graph.size()];

		for (int i = 0; i < graph.get(source).size(); i++) {
			if (visited[i] == false) {
				System.out.println(i);
				if (DFS_RECURSION(graph, visited, resST, i) == true) {
					return true;
				}
			}
		}
		
//		for(int i=0 ; i<resST.length ; i++) {
//			System.out.print(resST[i]+" ");
//		}
		
		return false;

	}

	public static boolean DFS_RECURSION(ArrayList<ArrayList<Integer>> graph, boolean[] visited, boolean[] recST,int source) {
		visited[source] = true;
		recST[source] = true;
		for (int i = 0; i < graph.get(source).size(); i++) {
			if (visited[source] == false && DFS_RECURSION(graph, visited, recST, i)) {
//				System.out.println(source);
				return true;
			}
			else if (recST[i] == true) {
//				System.out.println(i);
				return true;
			}
			else {
			}
		}
		recST[source] = false;
		return false;
	}
}
