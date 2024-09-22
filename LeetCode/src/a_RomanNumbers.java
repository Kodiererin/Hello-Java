//	Symbol       Value
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000


public class a_RomanNumbers 
{
	public static String intToRoman(int num)
	{
		String nme="";
		if(num<5)
		{
			for(int i=0 ; i<num ; i++)
				nme+="I";
		}
		else if(num>=5 && num<10)
		{
			nme+="V";
			for(int i=5 ; i<num ; i++)
				nme = nme+"I";
		}
		else if(num>=10 && num<50)
		{
			int x = num/10;
			for(int i=0 ; i<x ; i++)
				nme = nme+"X";
			num = num - (10*x);
			x = num/5;
			for(int i=0 ; i<x ; i++)
				nme = nme+"V";
			x = num%5;
			for(int i=0 ; i<x; i++)
				nme = nme+"I";
			return nme;
		}
		else if(num>=50 && num<=100)
		{
			int x = num/50;
			for(int i=0 ; i<x ; i++)
				nme = nme+"L";
			num = num-(x*50);
//			System.out.println(num);
			x = num/10;
//			System.out.println(x);
			for(int i=0 ; i<x ; i++)
				nme = nme+"X";
			num = num - x*10;
			x = num/5;
			for(int i=0 ; i<x ; i++)
				nme = nme+"V";
			x = num%5;
			for(int i=0 ; i<x ; i++)
				nme = nme+"I";
			return nme;
		}
		else if(num>=50 && num<=100)
		{
			
		}
		return nme;
	}
	public static void main(String[] args) 
	{
		System.out.println(intToRoman(68));
	}
}
