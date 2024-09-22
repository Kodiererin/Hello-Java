package Practise_OOPs;
abstract class UjjwalPen
{
	abstract void write();
	abstract void refill();
}
public class Pen_Abstract extends UjjwalPen
{
	void write()
	{
		System.out.println("Hello, My name is pen I am writing");
	}
	void refill()
	{
		System.out.println("Hello I am refill");
	}
	public static void main(String[] args) 
	{
		Pen_Abstract p1 = new Pen_Abstract();
		p1.write();
		p1.refill();
	}
}
