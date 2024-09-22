package g_GreedyProblem;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;

/*
 * 	Greedy Algo : Optimization Problem --> Maximizing or Minimizing problem.
 * 
 * 1. Consider the Infinity supply of coins : 10 5 2 1 [Pay 50 with minimum coins] -> 10 - 5coins 
 */


public class a_Intro {
	public static int minCoins(int coins[] , int amount) {
//		Sort the Array in the Decreasing Order
		Arrays.sort(coins);
		int i = coins.length-1;
		int res = 0;
		while(i>=0) {
			if(coins[i]<=amount) {
				int c = (int)Math.floor(amount/coins[i]);
				res = res+c;
				amount = amount-c*coins[i];
			}
			if(amount==0)
				break;
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5,10};
		int amount = 50;
		System.out.println(minCoins(arr, amount));
	}

}

