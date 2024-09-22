package Test;

//	Write a Program to create a class having Name as Member
// 	Create two Thread Class
//	1. To modify the Name
//	2. To print the Name.

class Print{
	String name;
	Print(String name){
		this.name = name;
	}
	public  void printString() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println(this.name);
		}
	}
	public  void printTen() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(this.name);
		}
	}
}
class modify extends Thread{
	String name;
	modify(String name){
		this.name = name;
	}
	public synchronized void run() {
		this.name = name.toUpperCase();
		Print p = new Print(this.name);
		p.printString();

	}
}

class printTen extends Thread{
	String name;
	printTen(String name) {
		this.name = name;
	}
	public synchronized void run() {
		Print p = new Print(this.name);
		p.printTen();	
	}
}

public class testSynchronised {
	public static void main(String[] args) {
		modify mf = new modify("ujjwal");
		printTen p = new printTen("kumar");
		mf.start();
		p.start();
		
	}
}
