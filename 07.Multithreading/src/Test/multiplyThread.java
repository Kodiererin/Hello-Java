package Test;
//	Write a program to find out the summation of 1 - 10 using 1 thread and multiplication of 1 - 10 using another thread.

class add extends Thread{
	int x;
	add(int x){
		this.x = x;
	}
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(this.x++);
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class mul extends Thread{
	int y;
	mul(int y){
		this.y = y;
	}
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i*this.y);
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
public class multiplyThread {
	public static void main(String[] args) {
		add a = new add(10);
		mul m = new mul(10);
		a.start();
		m.start();
	}
}
