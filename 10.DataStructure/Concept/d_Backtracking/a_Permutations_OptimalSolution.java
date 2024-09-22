package d_Backtracking;

public class a_Permutations_OptimalSolution {
	public static void main(String[] args) {
		Permute("ABCD", 0, 3);
	}
//	In this code, the code is more Optimised although the recursion tree formed will be same.

//	Creating an Is-Safe function
//	This fixes the previous Code Problem and Optimises the code
	public static boolean isSafe(String str , int l , int i , int r) {
		if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B')
			return false;
		if(r==(l+1) && ((str.charAt(i)=='A' && str.charAt(l)=='B')) || (str.charAt(i)=='A' && str.charAt(r)=='B')) {
			return false;
		}
		return true;
	}

	public static void Permute(String str , int l , int r) {
		if(l==r) {
			System.out.println(str);
			return;
		}else {
			for(int i=l ; i<r ; i++) {
				if(isSafe(str, l, i, r)) {
					str = swap(str , l , i);
					Permute(str, l+1 , r);
					str = swap(str, l, i);
				}
			}
		}
	}

//	Method for Swapping
	public static String swap(String str , int i  , int j) {
		char[] ch = str.toCharArray();

		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

		// Swapping using XOR operation
//        ch[i] = (char)(ch[i] ^ ch[j]);
//        ch[j] = (char)(ch[i] ^ ch[j]);
//        ch[i] = (char)(ch[i] ^ ch[j]);

		return String.valueOf(ch);
	}
}
