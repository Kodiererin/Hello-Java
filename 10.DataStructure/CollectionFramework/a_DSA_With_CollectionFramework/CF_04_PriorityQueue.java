package a_DSA_With_CollectionFramework;
import java.util.Iterator;
import java.util.PriorityQueue;
public class CF_04_PriorityQueue
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(23);
		p.add(12);
		p.add(34);
		p.add(54);
		p.add(3);
//		System.out.println(p.peek());

//		Instead of Add we can also offer also
		Iterator i = p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Deleting Element");
		p.poll();
		p.poll();
		p.poll();
		Iterator i2 = p.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
