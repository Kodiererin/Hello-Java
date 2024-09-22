package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test3sum {
	 public static Object[] start(int[] nums) {
		 TreeSet<int[]> tree = new TreeSet<>(Arrays::compare);
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                for (int k = j + 1; k < nums.length; k++) {
	                    if (nums[i] + nums[j] + nums[k] == 0) {
	                        int[] arr = {nums[i], nums[j], nums[k]};
	                        Arrays.sort(arr);
	                        tree.add(arr);
	                    }
	                }
	            }
	        }
	        return new ArrayList<>(tree);
	    }

	    public static void main(String[] args) {
	        int[] nums = { -1, 0, 1, 2, -1, -4 };
	        start(nums);
	    }
}
