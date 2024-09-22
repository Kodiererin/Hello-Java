package e_concept_Graph;

public class i_ShortestPath {
	public static void createList(java.util.ArrayList<java.util.ArrayList<Integer>> adj , int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void createArrayList() {
		int size = 7;
		java.util.ArrayList<java.util.ArrayList<Integer>> adj = new java.util.ArrayList<>(size);

		for(int i=0 ; i<size; i++) {
			adj.add(new java.util.ArrayList<Integer>());
		}

		createList(adj,0,1);
		createList(adj,0,2);
		createList(adj,1,3);
		createList(adj,2,3);
		createList(adj,2,4);
		createList(adj,4,5);
		createList(adj,3,5);

		int source = 0;
		shortestPath(adj, source);
	}
	public static void shortestPath(java.util.ArrayList<java.util.ArrayList<Integer>> adj , int source) {
		int[] distance = new int[adj.size()];
		for(int i = 0 ; i<distance.length ; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		boolean[] visited = new boolean[distance.length];
		distance[source] = 0;
		java.util.Queue<Integer> queue = new java.util.LinkedList<>();
		queue.add(source);
		visited[source] = true;

		while(!queue.isEmpty()) {
			int u = queue.poll();
			for(int i = u ; i<adj.get(u).size() ; i++) {
				if(!visited[i]) {
					distance[i] = Math.min(distance[i], distance[i]+1);
					visited[i]= true;
					queue.add(i);
				}
			}
		}


//		Printing the Distance
		for (int element : distance) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		createArrayList();
	}
}
