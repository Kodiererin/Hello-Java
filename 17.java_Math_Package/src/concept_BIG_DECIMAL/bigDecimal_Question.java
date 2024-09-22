package concept_BIG_DECIMAL;
import java.math.*;
import java.util.*;
public class bigDecimal_Question 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of elements in an Array");
			int x = sc.nextInt();
		BigDecimal []_arr = new BigDecimal[x];
		for(int i=0 ; i<_arr.length ; i++)
		{
			_arr[i] = sc.nextBigDecimal();
		}
		for(int j=0 ; j<_arr.length ; j++)
		{
			for(int k=0 ; k<_arr.length ; k++)
			{
				if(_arr[j].compareTo(_arr[k]) == -1)
				{
					_arr[j] = _arr[j].add(_arr[k]);
					_arr[k] = _arr[j].subtract(_arr[k]);
					_arr[j] = _arr[j].subtract(_arr[k]);
				}
			}
		}
		for(int m = _arr.length-1 ; m>=0; m--)
		{
			System.out.println(_arr[m]);
		}
	}
}
