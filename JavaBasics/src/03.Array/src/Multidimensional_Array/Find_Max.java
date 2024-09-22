package Multidimensional_Array;
import java.util.*;
public class Find_Max 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows and Columns of Matrix ");
			int rows = sc.nextInt();
			int columns = sc.nextInt();
		System.out.println("If any other number is pressed automatically it will convert to 0");
		System.out.println("Enter The data os the matrix");
		System.out.println("Matrix 1");
		int ctr[][] = new int[columns][rows];
		int matrix1 [][] = new int[columns][rows];
		for(int i=0 ; i<columns ; i++)
		{
			for(int j=0 ; j<rows ; j++)
			{
				matrix1[i][j] = sc.nextInt();
				if(matrix1[i][j]>1)
				{
					matrix1[i][j] =  0;
				}
				
				
			}
		}
	}
}
