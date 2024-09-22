package Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInGraph {
	public static void main(String[] args) {
		int[][] graph = new int[4][4];
		Arrays.fill(graph[0], 0);
		Arrays.fill(graph[1], 0);
		Arrays.fill(graph[2], 0);
		Arrays.fill(graph[3], 0);
		graph[0][2] = 1;
		graph[0][1] = 1;
		graph[1][2] = 1;
		graph[1][0] = 1;
		graph[1][3] = 1;
		graph[2][1] = 1;
		graph[2][3] = 1;
		graph[2][0] = 1;
		graph[3][2] = 1;
		graph[3][1] = 1;

		findShortestPath(graph);
	}

	public static void findShortestPath(int[][] graph) {
		int source = 0;
		int[] dist = new int[graph.length];
		Arrays.fill(dist, 0);
		boolean[] visited = new boolean[graph.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		visited[0] = true;
		dist[0] = 0;
		while (!queue.isEmpty()) {
			int u = queue.poll();
			for(int i=0 ; i<graph[u].length ; i++) {
				int v = graph[u][i];
				if(visited[v]==false) {
					dist[v] =dist[u]+1 ;
					visited[v] = true;
					queue.add(v);
				}
			}
		}

//		Printing the Visited Array.
		for (int i = 0; i < dist.length; i++) {
			System.out.print(dist[i] + " ");
		}
	}
}
