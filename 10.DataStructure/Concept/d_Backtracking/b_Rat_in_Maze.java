package d_Backtracking;

//	0 => Blocked Cells

//	1 => This indicates from where the Path is Possible
//	Condition -> Rats Can Move only from Unblocked Cells Only.
/* I/P  : 	maze[][] = [{1 , 0 , 0 , 0}
 * 						{1 , 1,	 0 , 1}
 * 						{0 , 1 , 0 , 0}
 * 						{1 , 1 , 1 , 1}]
 * O/P : Yes
 *
 * NAIVE SOLUTION : A naive solution would be to generate all path from top left to bottom right
 * While we are generating all the path and then we will traverse the path to find which is the correct solution.
 * For every path we check if it generates the solution or not.
 * If it generates the solution -> Print the solution.
 * Which traversing if you find that at this path there exist no solution then donot go to the path.
 *
 */

//	I have some doube in the code.
public class b_Rat_in_Maze {
    static int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 }, { 0, 1, 1, 1 } };
    static int[][] sol = new int[maze.length][maze[0].length];

    public static void main(String[] args) {
        b_Rat_in_Maze rat = new b_Rat_in_Maze();
        rat.solveMaze(0, 0);
    }

    // isSafe Function which is one of the important functions of the whole Backtracking Algorithm
    boolean isSafe(int i, int j) {
        return (i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == 1);
    }

    boolean solveMaze(int i, int j) {
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            sol[i][j] = 1;
            return true;
        }
        if (isSafe(i, j)) {
            sol[i][j] = 1;
            if (solveMaze(i + 1, j) || solveMaze(i, j + 1))
                return true;
            sol[i][j] = 0;
        }
        return false;
    }

    // Final Function
    boolean solve() {
        if (!solveMaze(0, 0))
            return false;
        else {
            display();
            return true;
        }
    }

    static void display() {
        System.out.println("Solution:");
        for (int[] element : sol) {
            for (int j = 0; j < element.length; j++) {
                System.out.print(element[j] + " ");
            }
            System.out.println();
        }
    }
}
