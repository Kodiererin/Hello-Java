//Making A multidimensional Array.
//In this Program I am going to make a "2D ARRAY"
import java.util.*;
public class Multidimensional_Array 
{
	public static void main(String[] args)
	{
		int [][] flats = new int [3][4];
		flats[0][0] = 100;
		flats[0][1] = 101;
		flats[0][2] = 102;
		flats[0][3] = 103;
		flats[1][0] = 104;
		flats[1][1] = 105;
		flats[1][2] = 106;
		flats[1][3] = 107;
		flats[2][0] = 108;
		flats[2][1] = 109;
		flats[2][2] = 110;
		flats[2][3] = 111;
		System.out.println("Length of the Array - Row "+flats.length);
		for(int i=0 ; i<flats.length ; i++)
		{
			for(int j=0 ; j<flats[i].length ; j++)
			{
				
					System.out.print(flats[i][j]);				
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}