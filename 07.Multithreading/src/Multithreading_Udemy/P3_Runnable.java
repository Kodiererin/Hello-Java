package Multithreading_Udemy;

class myRunnable implements Runnable{
	public void run() {
		int i=0;
		while(i<100){
			System.out.println("Hello Ujjwal");
			i++;
		}
	}
}
public class P3_Runnable {
	public static void main(String[] args) {
		myRunnable mR = new myRunnable();
		Thread t = new Thread(mR);
		t.start();
		int i=0;
		while(i<100) {
			System.out.println(i+" Hello Shubham and Joydeep");
			i++;
		}
	}
}
