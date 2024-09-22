package Practise;
class findLCM
{
	static int compute(int x , int y , int index , int total)
	{
		if(index < y)
		{
			if(x%index == 0 && y%index==0)
			{
				return compute(x/index , y/index , index , total*=index);
			}
			if(x%index!=0 || y%index!=0)
			{
				return compute(x,y,index+1,total);
			}
		}
		if(index>=y)
		{
			return x*y*total;
		}
		return 0;
	}
}
public class practise_lcmRecursion 
{
	public static void main(String[] args) 
	{
		System.out.println("Kemcho Mota Bhai! Moja me ki nhi?");
		System.out.println(findLCM.compute(20, 36 , 2, 1));
		
	}

}
