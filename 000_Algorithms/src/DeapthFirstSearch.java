import java.util.ArrayList;
public class DeapthFirstSearch {
    // We Will Pick the lowest Numbered Index First.
    // The Function takes A Source Vertex and a Adjacency list Graph as a Parameter.
    public static void DFSRecursive(ArrayList<ArrayList<Integer>> adj , int source , boolean[] visited )
    {
        visited[source] = true;
        System.out.println(source);
        for(int u : adj.get(source))
        {
            if(visited[u]==false)
            {
                DFSRecursive(adj, u, visited);
            }
        }
    }
    static void DFS(ArrayList<ArrayList<Integer>> adj , int V , int s)
    {
        boolean visited[] = new boolean[V];
        DFSRecursive(adj, s, visited);
    }
    public static void main(String[] args) {
        // CreateGraph graph = new CreateGraph();
        int Vertices = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(Vertices);
        for(int i=0 ; i<Vertices ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1); 
        addEdge(adj,0,2); 
        addEdge(adj,2,3); 
        addEdge(adj,1,3); 
        addEdge(adj,1,4);
        addEdge(adj,3,4);


        System.out.println("DFS Traversal IS ");
        DFS(adj,Vertices,0);
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
