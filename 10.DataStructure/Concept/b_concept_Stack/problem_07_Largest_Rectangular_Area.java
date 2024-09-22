package b_concept_Stack;
//	Largest Rectangular Area in Histogram

//	We are given an Array, Every array represents the height of the Histogam width of all the Histograph with same Width.

/*	Naive Solution : We consider every bar as the smallest bat, the bar with the minimum height in the rectangle and we find
 * the Rectangular area with this bar being smallest.
 */
import java.util.*;

public class problem_07_Largest_Rectangular_Area {
	public static int naiveSolution(int[] arr, int size) {
		int res = 0;
		for (int i = 0; i < size; i++) {
			int curr = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] >= arr[i]) {
					curr = curr + arr[i];
				} else {
					break;
				}
			}

			for (int j = i + 1; j < size; j++) {
				if (arr[j] >= arr[i]) {
					curr = curr + arr[i];
				} else {
					break;
				}
//				res = max(res,curr);
			}
		}
		return res;
	}

	public static int efficientSolution(int arr[],int n){
        Stack <Integer> s=new Stack<>();
        int res=0;
        int tp;
        int curr;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                tp=s.peek();s.pop();
                curr=arr[tp]* (s.isEmpty() ? i : i - s.peek() - 1);
                res=Math.max(res,curr);
            }
            s.add(i);
        }
        while(!s.isEmpty()){
            tp=s.peek();s.pop();
            curr=arr[tp]* (s.isEmpty() ? n : n - s.peek() - 1);
            res=Math.max(res,curr);
        }

        return res;
}
}
