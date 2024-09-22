package Practise;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		Solution object = new Solution();
		int[] arr = {1,2,3,4};
		object.productExceptSelf(arr);
	}
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        display(result);
        
        // Calculate postfix products while updating the result
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        display(result);
        
        return result;
    }
    
    void display(int[] arr) {
    	for(int i=0 ; i<arr.length ; i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
}