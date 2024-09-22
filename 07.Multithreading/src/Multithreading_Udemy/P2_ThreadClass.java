package Multithreading_Udemy;

public class P2_ThreadClass extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println(i+" Kemcho Ujjwal");
			i++;
		}
	}
	public static void main(String[] args) {
		P2_ThreadClass t = new P2_ThreadClass();
		t.start();
		int i=0;
		while(i<100) {
			System.out.println(i+" Hello Shubham and Joydeep");
			i++;
		}
	}
}
