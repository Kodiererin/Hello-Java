package d_Backtracking;
//	We are given a Number N
//	We need to consider place n queens on the chessboard such that no two queens attack each other.
/* I/P = 4
 * 		0	0	1	0
 * 		1	0	0	0
 * 		0	0	0	1
 * 		0	1	0	0
 *
 * 	Output : Yes
 * 	Similary other Input and So On.
 */
//	Write a function that takes n as a parameter. This function should return boolean Value.
//	It returns true if there exist a solution and also prints the solution.
//	else returns false;

//	Moving Ahead with Backtracking Solution
//	-> Place the tree one by one and here as soon as we get the solution we'll quit the function.
//	isSafe fucntion will check if the queens clash or not.
//	By modifying the  code we can run also get all the possible configuration.

//	Check the code.
public class c_N_QueensProblem {
	static int N = 4;
	static int[][] board = new int[N][N];
	public static void main(String[] args) {
		int num = 4;
		N = num;
		solve();
	}
	public static boolean solve() {
		if(!SolveRecursion(0)) {
			return false;
		}else {
			printBoard(board);
			return true;
		}
	}
	public static boolean SolveRecursion(int col) {
		if(col==N) {
			return true;
		}
		for(int i=0 ; i<N ; i++) {
			if(isSafe(i,col)) {
				board[i][col] = 1;
				if(SolveRecursion(col+1))
					return true;
				board[i][col] = 0;			// This calls back the queeen to the original position, as this is called BackTracking
			}
		}
		return false;
	}
//	Vertically , Horizontally and Diagonally Yha pe Check hoga.
//	Agar Vertically,Horizontally and Diagonnally khi pe vi 1 h toh woh false return kr dega.
	public static boolean isSafe(int row , int col) {
		for(int i=0 ; i<col ; i++) {
			if(board[row][i]==1) {
				return false;
			}
		}
		for(int i=row , j=col ; i>=0 && j>=0 ; i-- , j--) {
			if(board[i][j]==1)
				return false;
		}
		for(int i=row , j=col; j>=0  && i<N ; i++ , j--) {
			if(board[i][j]==1)
				return false;
		}
		return true;
	}


	public static void printBoard(int[][] matrix) {
		for (int[] element : matrix) {
			for(int j=0 ; j<element.length ; j++) {
				System.out.print(element[j]+" ");
			}
			System.out.println();
		}
	}

}
