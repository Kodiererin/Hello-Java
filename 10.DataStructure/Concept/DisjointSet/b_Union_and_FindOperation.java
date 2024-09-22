package DisjointSet;
import static java.lang.System.out;

public class b_Union_and_FindOperation
{
	static int parent[];

	static void initialize()
	{
		for(int i=0 ; i<parent.length ; i++)
		{
			parent[i] = i;
		}
	}

	static int find(int x)
	{
		if(parent[x]==x)
			return x;
		else
			return find(parent[x]);
	}

	static void union(int x , int y)
	{
		int x_rep = find(x);
		int y_rep = find(y);

		if(x_rep==y_rep)
			return;

		parent[y_rep] = x_rep;
	}

	public static void main(String[] args)
	{
		int n = 5;

		parent = new int[5];

		initialize();

		union(0,2);
		union(0,4);

		out.print(find(4));
		out.print(find(3));
	}
}
