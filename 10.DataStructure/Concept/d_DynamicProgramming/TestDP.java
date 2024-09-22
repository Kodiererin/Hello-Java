package d_DynamicProgramming;

public class TestDP {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(noOfSteps(n));
	}
	
	static int noOfSteps(int n) {
		if(n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}
		else {
			return noOfSteps(n-1)+noOfSteps(n-2);
		}
	}
}
