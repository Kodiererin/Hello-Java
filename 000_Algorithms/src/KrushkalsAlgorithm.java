import java.util.Arrays;

public class KrushkalsAlgorithm {
    class Edge implements Comparable<Edge>
    {
        // Representing the Graph as an array of edges.
        // Java Representation of Class Class.
        int src , dest , weight;
        // Edge(int s , int d , int w)
        // {
        //     this.src = s;
        //     this.dest = d;
        //     this.weight = w;
        // }
        public int compareTo(Edge e)
        {// Used when you want to sort the edges in increasing order of their weights.
            return this.weight - e.weight;
        };
    }
    class subset
    { int parent, rank; }

    int V , E;
    Edge edge[];        // collection of all edges.
    KrushkalsAlgorithm(int v , int e)
    {
        this.V = v;
        this.E = e;
        edge = new Edge[this.E];
        for(int i=0 ; i<e ; i++)
        {
            edge[i] = new Edge();
        }
    }
    // code for FindSet operation
    int find(subset subsets[] , int i)
    {
        if(subsets[i].parent!=i) subsets[i].parent = find(subsets , subsets[i].parent);

        return subsets[i].parent;
    }
    // A function that does union of two sets of x and y
    // Uses Union By Rank
    void Union(subset subsets[] , int x , int y)
    {
        int xroot = find(subsets,x);
        int yroot = find(subsets , y);
        // Attacj smaller rank tree unser the root of the High rank tree
        // Union By rank
        if(subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if(subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        
        // If ranks are same, then make one as root and increment its rank by one
        else
        {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
    // Write a Program that takes an array of edge as input and return the minimum weight of the Spanning Tree.
    // 1. Detect the Cycle and then add the edge to the MST.
    // Using Disjoint Set Datastructure.
    void kruskalsMST()
    {
        Edge result[] = new Edge[this.V];
        int e=0;
        int i=0;
        for(i=0 ; i<this.V ; i++)
        {
            result[i] = new Edge();
        }
        Arrays.sort(edge);      // sorting the Edge in ascending order.
        
        // Allocate Memory for creating V subsets
        subset subsets[] = new subset[V];
        for(i=0 ; i<this.V ; i++)
        {
            subsets[i] = new subset();
        }
        // Create V subsets with single elements
        for(int v=0 ; v<V ; v++)
        {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
        i=0;
        int res = 0;
        // Number of edges to be taken is equal to V-1
        while(e<this.V-1)
        {
            // Step 2 : Pick the Smallest Edge and Increment the Index for Next Iteration
            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = find(subsets , next_edge.src);
            int y = find(subsets, next_edge.dest);

            // if Including edge dosent cause cycle.
            // Include it in result and increment the index if result for next edge.

            if(x!=y)
            {
                result[e++] = next_edge;
                Union(subsets, x , y);
                
                res = res+next_edge.weight;
            }
            // Else Discard the next_edge
        }
        System.out.println("weight of MSt is "+res);
    }


    public static void main(String[] args) {
        int V = 5; // Number of vertices in graph 
		int E = 7; // Number of edges in graph 
		KrushkalsAlgorithm graph = new KrushkalsAlgorithm(V, E); 

		// add edge 0-1 
		graph.edge[0].src = 0; 
		graph.edge[0].dest = 1; 
		graph.edge[0].weight = 10; 

		// add edge 0-2 
		graph.edge[1].src = 0; 
		graph.edge[1].dest = 2; 
		graph.edge[1].weight = 8; 

		// add edge 0-3 
		graph.edge[2].src = 1; 
		graph.edge[2].dest = 2; 
		graph.edge[2].weight = 5; 

		// add edge 1-3 
		graph.edge[3].src = 1; 
		graph.edge[3].dest = 3; 
		graph.edge[3].weight = 3; 

		// add edge 2-3 
		graph.edge[4].src = 2; 
		graph.edge[4].dest = 3; 
		graph.edge[4].weight = 4; 
		
		//add egde 2-4
		graph.edge[5].src = 2; 
		graph.edge[5].dest = 4; 
		graph.edge[5].weight = 12;
		
		// add edge 3-4
		graph.edge[6].src = 3; 
		graph.edge[6].dest = 4; 
		graph.edge[6].weight = 15; 

		graph.kruskalsMST();
    }

}
// Krushkals Algorithm is Based on two Facts:
    // 1. There Should be No cycle.
    // 2. Minimum Weight Edges must be picked.

    // It is a Greedy Algorithm.
    // Idea : a. Sort all the Edges in the ascending Order.
            // b. For every edge we check if adding the edge causes a cycle or not.
            //      If it causes a cycle then we ignore this edge otherwise we add this edge to the MST.

/*
 * Sort All the edges in increasing order.
 * Initialize : MST = [] and res = 0.
 * DO following edge 'e'' while MST size doesnot become V-1/
 *  a. If adding e to MST does not cause a cycle.   
 *         MST = MST U {e}
 *          res = res + e.weight.
 */