//#CodeWithHarry
//@Multidimensional_Array
//Create a Java program to add two matrices of size 2x3.
import java.util.*;
public class CWH3_SumofMatrices
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of 2x2 Matrices");
			int [][] mat = new int[2][2];
			int [][] mat2 = new int[2][2];
			int [][] matsum = new int[2][2];
			{
		System.out.println("Enter Matrices 1 Data");
		for(int i=0 ; i<mat.length ; i++)
		{
			for(int j=0 ; j<mat[i].length ; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		for(int k=0 ; k<mat.length ; k++)
		{
			for(int l=0 ; l<mat[k].length ; l++)
			{
				System.out.print(mat[k][l]+" ");
			}
		System.out.println();
		}
		System.out.println("Enter Matrices 2 Data");
		for(int m=0 ; m<mat.length ; m++)
		{
			for(int o=0 ; o<mat[m].length ; o++)
			{
				mat2[m][o] = sc.nextInt();
			}
		}
		for(int p=0 ; p<mat.length ; p++)
		{
			for(int q=0 ; q<mat[p].length ; q++)
			{
				System.out.print(mat2[p][q]+" ");
			}
		System.out.println();
		}
		System.out.println("The sum of Matrices 1 and Matrices2 = ");
		for(int a= 0 ; a<mat2.length ; a++)
		{
			for(int b=0 ; b<mat2[a].length ; b++)
			{
//				matsum[a][b] = 0;
				mat2[a][b] = mat2[a][b] + mat[a][b];
				System.out.print(mat2[a][b]+" ");
			}
			System.out.println();
		}
 	}
}
}