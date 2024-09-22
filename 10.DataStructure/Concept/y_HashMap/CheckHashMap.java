package y_HashMap;

import java.util.HashMap;

// Check HashMap - The Last Element.

public class CheckHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0 ; i<10 ; i++) {
			map.put(10-i, i);
		}
		System.out.println(map.toString());
		System.out.println(map.get(map.size()));
		System.out.println(map.get(1));
	}   
}
