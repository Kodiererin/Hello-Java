package a_DSA_With_CollectionFramework;

import java.util.Comparator;
//	Comparator is Used to Modify Arrays class, We can the default Arrays
//	Methods to Modify and change the methods that are already present in the Arrays Class.

class myCLass implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1 , Integer i2)
	{
		if(i1<i2)
		{
			return 1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

public class CF_19_Comparator
{
	public static void main(String[] args)
	{

	}
}
