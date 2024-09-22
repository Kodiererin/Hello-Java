package concept_BIG_DECIMAL;

import java.math.BigDecimal;
import java.util.Scanner;

public class understand_BigDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigDecimal[] _arr = new BigDecimal[5];
		String s = "";
		for(int i=0 ; i<5 ; i++)
		{
//			String s = sc.next();
			_arr[i] = sc.nextBigDecimal();
		}
		for(int j=0 ; j<5 ; j++)
		{
			s = _arr[j].toString();
			System.out.println(s);
		}
	}
}
