package r_Recursion;

public class c_MagixIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 10 };
//		Magic Index are those index whose element is equal to i;

		System.out.println(isMagicIndex(arr, 0, arr.length - 1));
	}

	static boolean isMagicIndex(int[] arr, int i, int j) {
		if (i == j) {
			return false;
		}else {
			int mid = (i + j) / 2;
			if (arr[mid] == mid) {
				return true;
			} else {
				if (mid < arr[mid]) {
					return isMagicIndex(arr, i, mid - 1);
				} else {
					return isMagicIndex(arr, mid + 1, j);
				}
			}
		}
	}
}
