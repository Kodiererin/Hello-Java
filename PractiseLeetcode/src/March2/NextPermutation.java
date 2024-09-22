package March2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextPermutation {
    public static void main(String[] args) {
        System.out.println(new NextPermutation().longestValidParentheses("()(()"));
    }
    
    
    public int longestValidParentheses(String s) {
        if(s.length()==0){
            return 0;
        }else{
            Stack<Integer> stack = new Stack<Integer>();
            int ctr=0;
           	stack.push(-1);
           	for(int i=0 ; i<s.length() ; i++) {
           		char c = s.charAt(i);
           		
           		if(c=='(') {
           			stack.push(i);
           		}else {
           			stack.pop();
           			if(stack.isEmpty()) {
           				stack.push(i);
           			}else {
           				int max = i-stack.peek();
           				ctr = Math.max(ctr, max);
           			}
           		}
           	}
            return ctr;
        }
    }

    boolean matching(char a , char b){
        return a=='(' && b==')';
    }
    
    

    public static void nextPermutation() {
        int[] arr = {1, 2, 3};
        ArrayList<int[]> list = new ArrayList<>();
        generateAllPermutation(Arrays.copyOf(arr, arr.length), 0, arr.length - 1, list);

        for (int i = 0; i < list.size(); i++) {
            printArray(list.get(i));
        }
    }

    public static void generateAllPermutation(int[] arr, int start, int end, ArrayList<int[]> list) {
        if (start == end) {
            list.add(Arrays.copyOf(arr, arr.length));
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                generateAllPermutation(Arrays.copyOf(arr, arr.length), start + 1, end, list);
                swap(arr, start, i);
            }
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
