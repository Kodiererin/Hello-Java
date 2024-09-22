package a_DSA_With_CollectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

public class CF_03_ArrayDeque
{
	public static void main(String[] args)
	{
		ArrayDeque<Integer> aq1 = new ArrayDeque<>();
		aq1.add(20);
		aq1.offer(21);
		aq1.offerFirst(22);
		aq1.offerLast(23);
		aq1.add(24);
		aq1.addLast(25);
		aq1.addAll(List.of(26,27,28,29));
		Iterator i = aq1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//		To delete the Elements we Will use Poll
		aq1.poll();
		aq1.pollFirst();
		aq1.pollLast();
	}
}
