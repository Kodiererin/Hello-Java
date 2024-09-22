package y_HashMap;

import java.util.Arrays;

public class TestHashMap {
    public static void main(String[] args) {
        int[][] arr = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};

        // Sort the array based on the first element of each subarray
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        System.out.println(arr.length);
        System.out.println();
        for(int i=0 ; i<arr.length ; i++) {
        	System.out.println(arr[i][0]);
        }
        System.out.println();
        System.out.println(arr[0].length);
        
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
