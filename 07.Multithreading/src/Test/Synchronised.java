package Test;
class Table{
	public synchronized void printTable(int x) {
		for(int i=0 ; i<11 ; i++) {
			System.out.println(i*x);			
		}
	}
}
class myThread1 extends Thread{
	Table t1;
	myThread1(Table t){
		this.t1 = t;
	}
	public void run() {
		t1.printTable(5);
	}
}
class myThread2 extends Thread{
	Table t1;
	myThread2(Table t){
		this.t1 = t;
	}
	public void run() {
		t1.printTable(10);
	}
}

public class Synchronised {

}
