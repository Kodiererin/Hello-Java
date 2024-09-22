package r_Recursion;

public class a_TripleStep {
	public static void main(String[] args) {
		int totalStep = 4;
		System.out.println(totalSteps(totalStep));
	}

	private static int totalSteps(int totalStep) {
		if(totalStep<0) {
			return 0;
		}
		if(totalStep==0) {
			return 1;
		}
		int x = totalSteps(totalStep-1);
		int y = totalSteps(totalStep-2);
		int z = totalSteps(totalStep-3);
		return x+y+z;
	}
}
