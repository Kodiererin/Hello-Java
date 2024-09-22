package g_Bitwise;

public class a_Check {
	// Function to check if Kth bit is set or not.
	 public static int minSpeedOnTime(int[] dist, double hour) {
		 int i=0;
		 int j=0;
//		 double minSpeed = 0.0;
		 while(i<dist.length) {
			 j=0;
			 double m = 0.0;
			 while(j<dist.length) {
				 m = m+(double)dist[j]/(double)dist[i];
				 System.out.println(m);
				 j++;
			 }
			 if(m<=hour) {
				 System.out.println("The Minimum Time Taken is "+m);
				 return dist[i];
			 }else {
				 i++;
			 }
		 }
		 return -1;
	 }
	 public static int reverse(int x) {
		 if(x==0 ||  x<Integer.MIN_VALUE || x>1474836472)
	         return 0;
	        else{
	            int y = x;
	            x = (int)Math.abs(x);
	            int length = (x+"").length()-1;
	            double sum = 0;            
	            while(x>=0 && length>=0){
	                double m = (x%10)*(int)Math.pow(10,length);
	                if(m<Integer.MAX_VALUE){
	                    sum = sum+m;
	                    if(sum>Integer.MAX_VALUE)
	                        return 0;
	                }
	                x = x/10;
	                length--;
	            }
	            return y>0?(int)sum:-1*(int)sum;
	        }
	    }
    public static void main(String[] args) {
		System.out.println(reverse(-2147483412));
//		System.out.println(2147483647+1000);
	}
}
