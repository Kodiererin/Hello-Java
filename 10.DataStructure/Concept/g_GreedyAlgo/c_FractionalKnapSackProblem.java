package g_GreedyAlgo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//	FRACTIONAL KNAPSACK PROBLEM 
//	BigOh(nLog(n)) Time and BigOn(n) Time 


class WeightValue {
	int weight;
	int value;
	public WeightValue(int weight , int value) {
		this.value = value;
		this.weight = weight;
	}
	
}

class MyComparable implements Comparator<WeightValue>{
	@Override
	public int compare(WeightValue o , WeightValue p) {
		// TODO Auto-generated method stub
		return (int)- o.value/o.weight + p.value/p.weight ;
	}
}

public class c_FractionalKnapSackProblem  {

	public static void main(String[] args) {
		int[] value = {600,500,400};
		int[] weight = {50,20,30};
		int target = 70;
		System.out.println(computeFractionalKnapSack(weight, value, target));
	}
	
	public static int computeFractionalKnapSack(int[] weight , int[] values , int target) {
		WeightValue array[] = new WeightValue[weight.length];
		for(int i=0 ; i<weight.length ; i++) {
			array[i] = new WeightValue(weight[i], values[i]);
		}
		Arrays.sort(array, (o,p)->p.value/p.weight - o.value/o.weight);  
//		This is not giving a Good Answer.
//		Arrays.sort(array, new MyComparable());
		
		int res=0;
		int currentCapacity = target;
		displayArray(array);
		System.out.println();
		
		int i=0;
		while(currentCapacity!=0) {
			System.out.println("The Current Capacity is "+currentCapacity);
			if(array[i].weight<=currentCapacity) {
				currentCapacity-=array[i].weight;
				res+=array[i].value;
			}else {
				res = res + (array[i].value*currentCapacity)/array[i].weight;
				return res;
			}
			i++;
		}
		
		
		return res;
	}
	
	
	static void displayArray(WeightValue arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i].value+"	|	"+arr[i].weight);
		}
	}
}
