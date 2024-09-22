package Multithreading_Udemy;

public class P4_Runnable implements Runnable{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println(i+" Hello World");
			i++;
		}
	}
	public static void main(String[] args) {
		P4_Runnable p = new P4_Runnable();
		Thread t = new Thread(p);
		t.start();
		int i=0;
		while(i<100) {
			System.out.println(i+" Namaste Duniya");
			i++;
		}
	}
	public void print() {
		Synchronised(this){
			P4_Runnable p = new P4_Runnable();
			Thread t = new Thread(p);
			t.start();
			int i=0;
			while(i<100) {
				System.out.println(i+" Namaste Duniya");
				i++;
			}
		}
	}
}
