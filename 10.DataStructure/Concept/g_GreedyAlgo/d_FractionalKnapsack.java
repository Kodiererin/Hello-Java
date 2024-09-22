package g_GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

//	Algorithm for the Fractional Knapsack is : 
/*	1. Sort the Jobs in decreasing order of Profit.
 * 	2. Initialize the result as first Job in the Sorted ArrayList (Assign the Latest possible Job)
 * 	3. Do the Following for the remaining (n-1) jobs.
 * 		1. If this job can not be added to the list ignore it.
 * 		2. Else add it to the latest possible set.
 * 
 */
public class d_FractionalKnapsack {
	
	static class Job{
		int deadline;
		int profit;
		Job(int deadline,int profit){
			this.deadline = deadline;
			this.profit = profit;
		}
	}
	
	static class SortJobsWRTdeadline implements Comparator<Job>{

		@Override
		public int compare(Job o1, Job o2) {
			return o2.profit-o1.profit;
//			return 0;
		}
		
	}
	
//	public static void fractionalKnapsack() {
//		Job jobs[] = {new Job(4,20),new Job(1,10),new Job(1,40),new Job(1,30)};
//		Arrays.sort(jobs , new SortJobsWRTdeadline());
//		display(jobs);
//		System.out.println();
//		int result = jobs[0].profit;
//		for(int i=1 ; i<jobs.length ; i++) {
//			if(jobs[i].deadline<=i) {
//				result = result + jobs[i].profit;
//			}
//		}
//		System.out.println(result);
//		
//	}
	public static void fractionalKnapsack() {
		Job jobs[] = {new Job(4,20),new Job(1,10),new Job(1,40),new Job(1,30)};
		Arrays.sort(jobs , new SortJobsWRTdeadline());
		display(jobs);
		System.out.println();
		int result = jobs[0].profit;
		int i=jobs[0].deadline;
		for(i=1 ; i<jobs.length ; i++) {
			if(i<jobs[i].deadline) {
				result = result + jobs[i].profit;
				i=i+jobs[i].deadline;
			}
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		fractionalKnapsack();
	}
	
	
	static void display(Job[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i].deadline+"	"+arr[i].profit);
		}
	}

}
