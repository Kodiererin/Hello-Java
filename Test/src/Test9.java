
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=Math.random();
		
		double a2=Math.random();
				
		double a3=Math.random();
				
		double a4=Math.random();
				
		double a5=Math.random();
		
		System.out.println(a1+"  "+a2+" "+a3+" "+a4+" "+a5);
				
		double avg=(a1+a2+a3+a4+a5)/5;
		System.out.println("Avg " +avg);
				
		double max=Math.max(a1, Math.max(a2, Math.max(a3, Math.max(a4, a5))));
		System.out.println("Max " +max);		
		double min=Math.min(a1, Math.min(a2, Math.min(a3, Math.min(a4, a5))));
		System.out.println("Min " +min);		
		
				
		
				
		

	}

}
