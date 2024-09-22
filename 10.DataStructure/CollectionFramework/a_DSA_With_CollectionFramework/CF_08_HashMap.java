package a_DSA_With_CollectionFramework;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class CF_08_HashMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
//		System.out.println(tm);
		tm.put(4, "f");
		tm.put(5, "G");
		System.out.println(tm.ceilingEntry(5).getValue());
		System.out.println(tm.containsKey(4));

//		We use the methods Put and Get ie Most Commonly Used Methods

		Entry<Integer,String> e = tm.firstEntry();
		System.out.println(e.getKey()+" "+e.getValue());

//		Hash Map


	}
}