package i_Sorting;

import java.util.ArrayList;
import java.util.Collections;
public class g_BucketSort {
	public static void main(String[] args) {
		System.out.println("Hello World");
		bucketSort();
	}

	public static void bucketSort(){
		int[] arr = {20,88,70,85,75,95,95,18,82,60};
		int bucket = 5;

		int maxValue = arr[0];
		for (int element : arr) {
			maxValue = Math.max(maxValue, element);
		}

		maxValue++;

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for(int i=0 ; i<bucket ; i++) {
			list.add(new ArrayList<>());
		}

		for (int element : arr) {
			int bi = (bucket*element)/maxValue;
			list.get(bi).add(element);
		}

		for(int i=0 ; i<bucket ; i++) {
			Collections.sort(list.get(i));
		}

		int index = 0;
		for(int i=0 ; i<bucket ; i++) {
			for (Integer element : list.get(i)) {
				arr[index] = element;
				index++;
			}
		}

		for (int element : arr)
			System.out.println(element);
	}
}