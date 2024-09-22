package Practise_OOPs;
public class FountainPen extends UjjwalPen 
{
	void write()
	{
		System.out.println("Fountain Pen Writing Which has been Extended from UjjwalPen Class");
	}
	void refill()
	{
		System.out.println("Fountain Pen has refill Which has been Extended from UjjwalPen Class");
	}
	void nib()
	{
		System.out.println("Fountain Pen Does Not have a Nib. This Method is not from UjjwalPen");
	}
	public static void main(String[] args) 
	{
		FountainPen fp1 = new FountainPen();
		fp1.write();
		fp1.refill();
		fp1.nib();
	}
}
