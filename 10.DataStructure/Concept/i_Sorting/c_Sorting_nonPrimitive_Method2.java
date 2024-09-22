//	When you are sorting the array of primitive type the Arrays.sort() does not allow to use comparator to change the natural order of the primitive datatype.//
//	But While sorting Non-primitive we can use comparator.
//	Natural Order sorting restriction is only for Primitive Datatype. ie: Lower -> Higher.
//	Primitive Datatype : To sort from Bigger to Smaller we have to first sort the array then we have to Reverse the array.
//	non-Primitive Datatype : TO sort the array from bigget to smaller we have can use comparator infact in Collection class there is a function
//			collections.reverse to directly reverse the array.

package i_Sorting;
import java.util.Arrays;
import java.util.Comparator;

class Point2
{
	int x ;
	int y;
	Point2(int x , int y)
	{
		this.x  = x;
		this.y = y;
	}
}
class myCompare implements Comparator<Point2>
{
//	Overriden method.
	@Override
	public int compare(Point2 p1, Point2 p2)
	{
		return p1.x - p2.x;
	}

}
public class c_Sorting_nonPrimitive_Method2
{
	public static void main(String[] args)
	{
		Point2[] arr = {new Point2(10,20),new Point2(3,12), new Point2(5,7)};
		Arrays.sort(arr,new myCompare());
		for (Point2 element : arr) {
			System.out.println(element.x+" "+element.y );
		}
	}
}
