package e_concept_Graph;

public class b_creation_MatrixMethod
{
	public static void create()
	{
//		For Undirected Graph

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter The Number of Vertices ");
		int vertices = sc.nextInt();
//		assuming the vertices to be 5
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

	}

	public static void createDirected()
	{
//		For Undirected Graph

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter The Number of Vertices ");
		int vertices = sc.nextInt();
//		assuming the vertices to be 5
		int[][] arr = new int[5][5];
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 0;
		arr[0][3] = 1;
		arr[0][4] = 0;

		arr[1][0] = 0;
		arr[1][1] = 0;
		arr[1][2] = 1;
		arr[1][3] = 1;
		arr[1][4] = 0;

		arr[2][0] = 0;
		arr[2][1] = 0;
		arr[2][2] = 0;
		arr[2][3] = 0;
		arr[2][4] = 1;

		arr[3][0] = 0;
		arr[3][1] = 0;
		arr[3][2] = 0;
		arr[3][3] = 0;
		arr[3][4] = 1;

		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 0;
		arr[4][3] = 0;
		arr[4][4] = 0;

	}
}
