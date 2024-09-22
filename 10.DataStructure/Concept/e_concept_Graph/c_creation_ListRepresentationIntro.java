package e_concept_Graph;

public class c_creation_ListRepresentationIntro
{
	public static void info()
	{
		System.out.println("What Were the Problems with the Adjancey Matrix Representation?");
		System.out.println("1. Storing Reduntant Information ");
		 	System.out.println("It was Storing Data connected as well as Data Not Connected By 0's and 1's");
		 System.out.println("---------------------------------------------------------------------------------------");
		 System.out.println("Adjancey List Stores/has an idea of storing which adjacent List to store.");
		 System.out.println("It Saves The Space");
		 System.out.println("Makes a Particular faster which is used in a Lot of algorithm ");
		 System.out.println("Finding the adjacent of the Vertex as we are storing the Adjacent of a vertex so it becomes easier to store an adjacent of a vertex");
		 System.out.println("Adjancey List can be Any List either Linked List or Array List");
		 System.out.println("We will Be using array List of Array List to store data because Array List is Cache friendly and has an ease of implementation");
		 System.out.println("Its Major disadvantage is Due to Dynamic array List it has a wastage of Space!");
	}
	public static void timeComplexityOfAdjanceyList()
	{
//		V : No of Vertices ; E : no of Edges
		System.out.println("Space Complexity Of Undirected Graph : V*2E");
		System.out.println("Space Complexity of Dircted Graph : V+E");
		System.out.println();
		System.out.println("Operations : ");
		System.out.println("1. Check if there is an Edge from u to v : O(v) ");
		System.out.println("2. Find all the Adjacent of u  : BigTheta(degree(u))");
		System.out.println("3. Find all degree of u : Bigtheta(1)");
		System.out.println("4. Add an Edge : BidTheta(1)");
		System.out.println("5. Remove an Edge : BigOh(v)");
	}
}
