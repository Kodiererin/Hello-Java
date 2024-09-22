package d_Backtracking;
//	Given a String, Print all those Permutations which Donot contain "AB" as SubString.
//	I/P : "A B C"
//	O/P : ACB , BCA,BAC,CBA

//	Note : This is not an Optimal Solution and So we are mobing to the Optimal Solution
public class a_Permutations_NaiveSolution {
	public static void main(String[] args) {
//		String m = "Ujjwal";
//		m = swap(m,2,4);
//		System.out.println(m);
		Permute("ABC", 0, 2);
	}
//	Naive Solution
	public static void Permute(String str, int l , int r) {
		if(l==r) {
			if(str.subSequence(0, 1)!="AB") {
				System.out.println(str);
				return;
			}
		}else {
			for(int i=l ; i<=r ; i++) {
				str = swap(str , l , i);
				Permute(str, l+1, r);
				swap(str, i, l);
			}
		}
	}
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
