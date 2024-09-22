package i_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	 Here is an Example of collections.sort for sorting a list of items of user defined type.
class myPoint implements Comparable<myPoint>
{
	int x,y;
	myPoint(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(myPoint o) {
		return this.x - this.y;
	}

}
public class e_collectionsSort2_UserDefined
{
	public static void main(String[] args)
	{
		List<myPoint> l = new ArrayList<>();
		l.add(new myPoint(5,10));
		l.add(new myPoint(2,20));
		l.add(new myPoint(10,30));
		Collections.sort(l);
		for(myPoint p:l)
		{
			System.out.println(p.x+"  "+p.y);
		}
	}
}
