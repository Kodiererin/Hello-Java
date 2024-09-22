package Backtracking;

public class b_Permutations {
    public static void main(String[] args) {
        char[] x = {'a', 'b', 'c'};
        permute(x, 0, x.length - 1);
    }

    static void permute(char[] str, int low, int high) {
        if (low == high) {
            System.out.println(new String(str));  // Use new String(str) to convert char array to string
        } else {
            for (int i = low; i <= high; i++) {
                swap(str, i, low);
                permute(str, low + 1, high);  // Change i+1 to low+1
                swap(str, i, low);
            }
        }
    }

    public static void swap(char[] str, int low, int high) {
        char temp = str[low];
        str[low] = str[high];
        str[high] = temp;
    }
}
