package Multithreading_Udemy;

class myThread extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println(i+" Hello Ujjwal");
			i++;
		}
	}
}

public class P1_ThreadClass {
	public static void main(String[] args) {
		myThread t = new myThread();
		t.start();
		int i=0;
		while(i<100) {
			System.out.println(i+" Hello Ujjwal Kumar");
			i++;
		}
	}
}
