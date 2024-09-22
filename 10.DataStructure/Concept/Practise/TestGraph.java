package Practise;

public class TestGraph {
	public static int[][] createGraph() {
		int[][] arr = new int[5][5];
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 0;
		arr[0][3] = 1;
		arr[0][4] = 0;

		arr[1][0] = 1;
		arr[1][1] = 0;
		arr[1][2] = 1;
		arr[1][3] = 1;
		arr[1][4] = 0;

		arr[2][0] = 0;
		arr[2][1] = 1;
		arr[2][2] = 0;
		arr[2][3] = 0;
		arr[2][4] = 1;

		arr[3][0] = 1;
		arr[3][1] = 1;
		arr[3][2] = 0;
		arr[3][3] = 0;
		arr[3][4] = 1;

		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 1;
		arr[4][3] = 1;
		arr[4][4] = 0;
		
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = createGraph();
		for(int[] i : arr) {
			for(int j : i) {
//				System.out.print(j+" ");
			}
//			System.out.println();
		}
		dfs(arr);
	}
	
	public static void dfs(int[][] arr) {
		int source = 0;
		boolean[] visited = new boolean[arr.length];
		startDfs(arr,visited,source);
	}
	static void startDfs(int[][] arr, boolean[] visited, int source) {
	    visited[source] = true;
	    System.out.println(source); // Print the vertex

	    for (int i = 0; i < arr[source].length; i++) {
	        if (arr[source][i] != 0 && !visited[i]) { // Check if there is an edge and the vertex is not visited
	            startDfs(arr, visited, i);
	        }
	    }
	}
	
}
