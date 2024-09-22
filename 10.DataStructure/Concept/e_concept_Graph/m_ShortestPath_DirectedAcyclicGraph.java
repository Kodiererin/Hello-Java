package e_concept_Graph;

import java.util.ArrayList;

public class m_ShortestPath_DirectedAcyclicGraph {
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
		createLinks(graph, 0, 4);
		createLinks(graph, 4, 2);
		createLinks(graph, 4, 5);
		createLinks(graph, 5, 3);
//		For this the output will be : 0 2 3 6 1 5
		/*		shortestPath(graph , source)
		 * 			initialize distance array [inf,inf,inf,inf........]
		 * 			dist[source]=0
		 * 			Find a Topological sort of the graph
		 * 			for every vertex U in the topoligical sort 
		 * 				a. for every adjacent v of u
		 * 						if dist[v] > dist[u] + weight(u,v)
		 * 							dist[v] = dist[v] + weight(u,v)
		 */
		
//		My aim is to understand again the Topological sort and restart to write the code.
	}
//	
}
