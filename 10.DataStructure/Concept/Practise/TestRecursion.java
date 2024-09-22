package Practise;

public class TestRecursion {
	public static void main(String[] args) {
		printN(2 ,2);
	}
	static void printN(int n , int o) {
		if(n==0 || o==0) {
			return;
		}else {
			System.out.print(n+0+" ");
			printN(n-1,o);
			System.out.println();
			printN(n,o-1);
		}
	}
}
