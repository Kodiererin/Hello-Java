package i_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myPoint1
{
	int x,y;
	myPoint1(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class e_collectionsSort3_ComparatorInterface
{
	public static void main(String[] args)
	{
		List<myPoint1> list = new ArrayList<>();
		list.add(new myPoint1(5,10));
		list.add(new myPoint1(2,20));
		list.add(new myPoint1(10,30));
		Collections.sort(list , new myComparator());
		for(myPoint1 p:list)
			System.out.println(p.x+"  "+p.y);
	}
}
class myComparator implements Comparator<myPoint1>
{

	@Override
	public int compare(myPoint1 p1 , myPoint1 p2) {
		// TODO Auto-generated method stub
		return p1.x - p2.x;
	}
}