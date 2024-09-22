//	We are using comparable interface to compare two objects of the class

package a_DSA_With_CollectionFramework;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
class xyzPoint implements Comparable
{
	int x,y;
	xyzPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString()
	{
		return "x="+x+"y="+y;
	}
	@Override
	public int compareTo(Object o)
	{
		xyzPoint p = (xyzPoint)o;
		if(this.x<p.x)
		{
			return -1;
		}
		else if(this.x>p.x)
		{
			return 1;
		}
		else
		{
			if(this.y<p.y)
			{
				return -1;
			}
			else if(this.y>p.y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}

}
public class CF_07_ComparableInterface2
{
	public static void main(String[] args)
	{
		java.util.TreeSet<Point> ts = new TreeSet<>();
		ts.add(new Point(1,1) );
		ts.add(new Point(5,5));
		ts.add(new Point(5,2));
		System.out.println(ts);
	}
}
