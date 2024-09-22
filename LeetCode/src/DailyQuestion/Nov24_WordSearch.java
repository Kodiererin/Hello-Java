package DailyQuestion;

public class Nov24_WordSearch 
{
	  public static boolean exist(char[][] board, String word) 
	  {
		  boolean m = false;
		  for(int i=0 ; i<board.length ; i++)
		  {
			  int j=0;
			  while(board[i][j]==word.charAt(j) && j<word.length()-1)
			  {
				  j++;
				  if(j==word.length()-1)
					  m = true;
			  }
		  }
		  for(int i=0 ; i<board.length ; i++)
		  {
			  int j=0;
			  while(board[j][i]==word.charAt(j) && j<word.length()-1) 
			  {
				  j++;
				  if(j==word.length()-1)
					  m = true;
			  }
		  }
		  return m;
	  }
	  
	  public static boolean exist2(char[][] board, String word)
	  {
		  int i=0;
		  int j=0;
		  int pointer =0;
		  while(i!=board.length-1 && j!=board.length-1)
		  {
			  if(board[i][j]==word.charAt(pointer))
			  {
				  if(board[i][j]==word.charAt(pointer))
				  {
					  j++;
					  pointer++;
				  }
				  if(board[i][j]==word.charAt(pointer))
				  {
					  i++;
					  pointer++;
				  }
//				  if(board[i][j]==word.charAt(pointer))
//				  {
//					  j--;
//					  pointer++;
//				  }
//				  if(board[i][j]!==word.charAt(pointer))
//				  {
//					  i--;
//					  pointer++;
//				  }
				  
				  if(pointer==word.length()-1)
					  return true;
			  }
		  }
		  return false;
	  }
	  public static void main(String[] args) 
	  {
		  char[][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		  System.out.println(exist(board,"ABCCE"));
	  }
}
