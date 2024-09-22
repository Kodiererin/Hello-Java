package e_concept_Graph;

import java.util.ArrayList;
import java.util.Queue;


//	Recheck the Code and Try Again.

public class ii_ShortestPath {
	public static void createList(java.util.ArrayList<java.util.ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void main(String[] args) {
//		Creating The ArrayList
		int size = 7;
		java.util.ArrayList<java.util.ArrayList<Integer>> graph = new java.util.ArrayList<>(
				size);

		for (int i = 0; i < size; i++) {
			graph.add(new java.util.ArrayList<Integer>());
		}

//		Creating a List
		createList(graph, 0, 1);
		createList(graph, 0, 2);
		createList(graph, 1, 3);
		createList(graph, 2, 3);
		createList(graph, 2, 4);
		createList(graph, 4, 5);
		createList(graph, 3, 5);

//		Initialing the Source to Start With
		int source = 0;

		shortestPath(graph, source);

	}

	@SuppressWarnings("unchecked")
	public static void shortestPath(ArrayList<ArrayList<Integer>> graph, int source) {
		int[] distance = new int[graph.size()];
		distance[source] = 0;
		for (int i = 0; i < distance.length; i++) {
//			distance[i] = Integer.MAX_VALUE;
			distance[i] = 0;
		}
//		Creating a visited Array
		boolean[] visited = new boolean[graph.size()];
		distance[source] = 0;
		Queue queue = new java.util.LinkedList<Integer>();
		queue.add(source);
		visited[source] = true;
		while (!queue.isEmpty()) {
			int u = (int) queue.poll();
			for (int i = 0; i < graph.get(i).size(); i++) {
				if (!visited[i]) {
					distance[i] = distance[i] + 1;
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		displayDistance(distance);
//		Printing the Distance
	}

	public static void displayDistance(int[] distance) {
		for (int element : distance) {
			System.out.println(element);
		}
	}
}
