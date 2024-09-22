package Practise;

import java.io.File;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumVertices {
	public static  ArrayList<Integer> findSmallestSetOfVertices(int n, ArrayList<ArrayList<Integer>> edges) {
//		System.out.println("Hello World");
		ArrayList<Integer> getnode = new ArrayList<Integer>();
		boolean[] visited = new boolean[n];
		for(int i=0 ; i<n ; i++) {
			if(visited[i]==false) {
//				Start your code here.
				getnode.add(i);
				BFS(i, edges, visited);
			}
		}
		return getnode;
    }
	
	
//	Starting my code.
	public static void BFS(int root , ArrayList<ArrayList<Integer>> list , boolean[] visited) {
//		System.out.println("Hello World");
		Queue<Integer> queue = new LinkedList<>();
		queue.add(root);
		while(queue.isEmpty()==false) {
			visited[queue.peek()] = true;
			int m = queue.poll();
			int i=0;
			while(i<list.get(m).size()) {
				queue.add(list.get(m).get(i));
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
	    // Creating a Graph
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    for (int i = 0; i < 6; i++) {
	        list.add(new ArrayList<Integer>());
	    }

	    list.get(0).add(1);
	    list.get(0).add(2);
	    list.get(2).add(5);
	    list.get(3).add(4);
	    list.get(4).add(2);

	    ArrayList<Integer> arr = findSmallestSetOfVertices(list.size(), list);
	    for(int i=0 ; i<arr.size() ; i++) {
	    	System.out.println(arr.get(i));
	    }
	}
	
}
